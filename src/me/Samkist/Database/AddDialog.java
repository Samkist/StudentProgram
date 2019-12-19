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

    ArrayList<Component> components = new ArrayList<>();

    public AddDialog(JFrame jFrame, Class<? extends Person> type) {
        super(jFrame);

    }
}
