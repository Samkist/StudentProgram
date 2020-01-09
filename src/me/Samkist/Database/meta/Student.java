/* Created By: Sam Pizette
 * On Date: 12/16/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database.meta;

public class Student extends Person {

    private static int id = 0;
    private int thisid;

    public Student(String name) {
        super(name);
        thisid = id++;
    }

    public int getID() {
        return thisid;
    }
}