/* Created By: Sam Pizette
 * On Date: 12/19/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database;

import BreezySwing.GBDialog;
import me.Samkist.Database.meta.Person;

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


    public AddDialog(JFrame jFrame, Database db) {
        super(jFrame);
        this.db = db;
    }
}
