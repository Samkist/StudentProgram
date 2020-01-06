package me.Samkist.Database;

import BreezySwing.GBDialog;

import javax.swing.*;

public class PrintDialog extends GBDialog {

    JTextArea outputField = addTextArea("", 0, 0, 2, 2);

    public PrintDialog(JFrame jFrame, PrintType printType, Database db) {
        super(jFrame);
        setVisible(true);
        setSize(400, 400);
        setTitle("Print " + printType.getDescription());
        outputField.setEditable(false);
        print(printType, db);
    }

    public void print(PrintType printType, Database db) {
        switch(printType.ordinal()) {
            case 0: {
                db.getPersons().forEach(p -> {
                    String s = outputField.getText();
                    outputField.setText(s + (p.toString() + "\n"));
                });
                break;
            }

            case 1: {
                db.getStudents().forEach(p -> {
                    String s = outputField.getText();
                    outputField.setText(s + p.toString() + "\n");
                });
                break;
            }

            case 2: {
                db.getGraduates().forEach(p -> {
                    String s = outputField.getText();
                    outputField.setText(s + p.toString() + "\n");
                });
                break;
            }

            case 3: {
                db.getUndergraduates().forEach(p -> {
                    String s = outputField.getText();
                    outputField.setText(s + p.toString() + "\n");
                });
                break;
            }
        }
    }


}
