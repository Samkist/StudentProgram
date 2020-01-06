/* Created By: Sam Pizette
 * On Date: 12/16/2019
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
import java.util.Optional;

public class Database {

    private ArrayList<Person> persons = new ArrayList<>();
    private DatabaseGUI gui;
    public void addPerson(Person p, GBDialog dialog) {
        persons.add(p);
        if(persons.size() >= 10) {
            gui.disableAddPerson();
            dialog.setVisible(false);
        }
    }

    public Database(DatabaseGUI gui) {
        this.gui = gui;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public ArrayList<Student> getStudents() {
        ArrayList<Student> list = new ArrayList<>();
        persons.forEach(person -> {
            if(person instanceof Student)
                list.add((Student) person);
        });
        return list;
    }

    public ArrayList<Graduate> getGraduates() {
        ArrayList<Graduate> list = new ArrayList<>();
        persons.forEach(person -> {
            if(person instanceof Graduate)
                list.add((Graduate) person);
        });
        return list;
    }

    public ArrayList<Undergraduate> getUndergraduates() {
        ArrayList<Undergraduate> list = new ArrayList<>();
        persons.forEach(person -> {
            if(person instanceof Undergraduate)
                list.add((Undergraduate) person);
        });
        return list;
    }
}
