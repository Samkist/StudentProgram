/* Created By: Sam Pizette
 * On Date: 1/6/2020
 * Project Name: StudentProgram
 */
package me.Samkist.Database;

import BreezySwing.GBDialog;
import me.Samkist.Database.meta.Graduate;
import me.Samkist.Database.meta.Person;
import me.Samkist.Database.meta.Student;
import me.Samkist.Database.meta.Undergraduate;

import javax.swing.*;
import java.util.ArrayList;

public class CompareDialog extends GBDialog {

    private Database db;

    private JList<java.lang.String> peopleList = addList(1,1,1,1);
    private JTextArea peopleDetails = addTextArea("",1,2,1,1);

    public CompareDialog(JFrame jFrame, Database db) {
        super(jFrame);
        this.db = db;
        db.getPersons().forEach(p -> {
            DefaultListModel<String> model = (DefaultListModel<String>) peopleList.getModel();
            model.addElement(p.getName());
        });
        peopleDetails.setEditable(false);
    }

    public void listItemSelected(JList<String> list) {
        compare();
    }

    public void listDoubleClicked(JList<String> list, String itemClicked) {
        compare();
    }

    private void compare() {
        ArrayList<Person> similarPersons = new ArrayList<>();
        Person person = db.getPersons().get(peopleList.getSelectedIndex());
        StringBuilder builder = new StringBuilder();
        if(person instanceof Undergraduate) {
            builder.append("Undergraduates that match ").append(person.getName()).append(" :\n");
        } else if(person instanceof Graduate) {
            builder.append("Graduate Students that match ").append(person.getName()).append(" :\n");
        }
        db.getPersons().forEach(p -> {
            if(person instanceof Undergraduate && p instanceof Undergraduate) {
                Undergraduate ug = (Undergraduate) person;
                Undergraduate ugIterated = (Undergraduate) p;
                if(ug.equals(ugIterated))
                    builder.append(ugIterated.toString()).append("\n");
            } else if(person instanceof Graduate && p instanceof Graduate) {
                Graduate gSelected = (Graduate) person;
                Graduate gIterated = (Graduate) p;
                builder.append(gIterated.toString()).append("\n");
            }
        });
    }
}
