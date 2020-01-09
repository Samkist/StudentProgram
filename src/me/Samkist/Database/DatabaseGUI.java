/* Created By: Sam Pizette
 * On Date: 12/19/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database;

import BreezySwing.GBFrame;

import javax.swing.*;

public class DatabaseGUI extends GBFrame {

    private static JFrame frame;
    private JButton printPersons = addButton("Print Persons", 0, 0, 1, 1);
    private JButton printStudents = addButton("Print Students", 1, 0, 1, 1);
    private JButton printUndergraduates = addButton("Print Undergraduates", 2, 0, 1, 1);
    private JButton printGraduates = addButton("Print Graduate Students", 3, 0, 1, 1);
    private JButton addPerson = addButton("Add Person", 4, 0, 1, 1);
    private Database db = new Database(this);

    public static void main(String[] args) {
        frame = new DatabaseGUI();
    }

    public DatabaseGUI() {
        /*new CompareDialog(frame, db).setVisible(true);*/
        setVisible(true);
        setSize(400, 400);
        setTitle("Persons Database");
    }



    public void buttonClicked(JButton jButton) {
        if(jButton.equals(addPerson)) {
            new AddDialog(this, db);
        }

        if(jButton.equals(printPersons)) {
            new PrintDialog(frame, PrintType.PERSON, db);
        }

        if(jButton.equals(printStudents)) {
            new PrintDialog(frame, PrintType.STUDENT, db);
        }

        if(jButton.equals(printGraduates)) {
            new PrintDialog(frame, PrintType.GRADUATE, db);
        }

        if(jButton.equals(printUndergraduates)) {
            new PrintDialog(frame, PrintType.UNDERGRADUATE, db);
        }
    }

    public void disableAddPerson() {
        addPerson.setEnabled(false);
    }
}
