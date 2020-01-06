/* Created By: Sam Pizette
 * On Date: 12/16/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database.meta;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + getName();
    }
}
