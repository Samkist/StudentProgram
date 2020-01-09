/* Created By: Sam Pizette
 * On Date: 12/16/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database.meta;

public class Student extends Person {

    private int thisid;

    public Student(String name, int ID) {
        super(name);
        thisid = ID;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "ID: " + getID();
    }

    public int getID() {
        return thisid;
    }
}