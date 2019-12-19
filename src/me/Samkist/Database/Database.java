/* Created By: Sam Pizette
 * On Date: 12/16/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database;

import me.Samkist.Database.meta.Graduate;
import me.Samkist.Database.meta.Person;
import me.Samkist.Database.meta.Student;
import me.Samkist.Database.meta.Undergraduate;

import java.util.ArrayList;
import java.util.Optional;

public class Database {

    private ArrayList<Person> persons = new ArrayList<>();

    public void addPerson(Person p) {
        persons.add(p);
    }

    public static void main(String[] args) {
        Database db = new Database();
    }

    public Database() {
        Undergraduate ungrad = new Undergraduate("stinky", null, Grade.SOPHOMORE);
        persons.add(ungrad);
        Graduate grad = new Graduate("poo", "Oop");
        persons.add(grad);
        getStudents().forEach(o -> System.out.println(o.print()));
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

    public ArrayList<Student> getGraduates() {
        ArrayList<Student> list = new ArrayList<>();
        persons.forEach(person -> {
            if(person instanceof Graduate)
                list.add((Graduate) person);
        });
        return list;
    }

    public ArrayList<Student> getUndergraduates() {
        ArrayList<Student> list = new ArrayList<>();
        persons.forEach(person -> {
            if(person instanceof Undergraduate)
                list.add((Undergraduate) person);
        });
        return list;
    }
}
