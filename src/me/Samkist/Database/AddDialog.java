/* Created By: Sam Pizette
 * On Date: 12/19/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database;

import BreezySwing.GBDialog;
import me.Samkist.Database.meta.Graduate;
import me.Samkist.Database.meta.Person;
import me.Samkist.Database.meta.Student;
import me.Samkist.Database.meta.Undergraduate;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AddDialog extends GBDialog {

    private Database db;
    private JLabel addLabel = addLabel("Add Person", 1, 1, 1, 1);
    private JLabel typeLabel = addLabel("Person Type", 2, 1, 1, 1);
    private JComboBox<String> personType = addComboBox(2, 2, 1, 1);
    private JLabel levelLabel = addLabel("Grade Level: ", 3, 1, 1, 1);
    private JComboBox<String> level = addComboBox(3, 2, 1, 1);
    private JLabel nameLabel = addLabel("Name: ", 4, 1, 1, 1);
    private JTextField nameField = addTextField("", 4, 2, 1, 1);
    private JLabel major = addLabel("Major: ", 5, 1, 1,1 );
    private JTextField majorField = addTextField("", 5, 2 ,1, 1);
    private JButton button = addButton("Add Person", 6, 1, 1,1);



    public AddDialog(JFrame jFrame, Database db) {
        super(jFrame);
        this.db = db;

        personType.addItem("Person");
        personType.addItem("Student");
        personType.addItem("Graduate Student");
        personType.addItem("Undergraduate");

        level.addItem("Freshman");
        level.addItem("Sophomore");
        level.addItem("Junior");
        level.addItem("Senior");
        setVisible(true);
        setSize(400, 400);
        setTitle("Add Person");

        revalidate();
    }

    public void buttonClicked(JButton jButton) {
        if(jButton.equals(button)) {
            if(db.getPersons().size() >= 10) {
                button.setEnabled(false);
                return;
            } else {
                Person p;
                switch(personType.getSelectedIndex()) {
                    case 0 : {
                        p = new Person(nameField.getText());
                        break;
                    }

                    case 1 : {
                        p = new Student(nameField.getText());
                        break;
                    }
                    
                    case 2 : {
                        p = new Graduate(nameField.getText(), majorField.getText());
                        break;
                    }

                    case 3 : {
                        p = new Undergraduate(nameField.getText(), majorField.getText(), Grade.FRESHMAN.getByValue(level.getItemAt(level.getSelectedIndex())));
                        break;
                    }

                    default : {
                        p = null;
                    }
                }
                db.addPerson(p, this);
                setVisible(false);
            }
        }
    }
}
