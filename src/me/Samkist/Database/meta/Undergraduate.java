/* Created By: Sam Pizette
 * On Date: 12/16/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database.meta;

import me.Samkist.Database.Grade;

public class Undergraduate extends Student implements Majorable {

    private String major;
    private Grade level;
    private int id;

    public Undergraduate(String name, String major, Grade level, int ID) {
        super(name, ID);
        if(major != null) {
            this.major = major;
        } else {
            this.major = "Undecided";
        }
        this.level = level;
        id = ID;
    }


    @Override
    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Major: " + getMajor() + "\n"
                + "ID: " + getID() + "\n"
                + "Grade: " + getLevel().getDescription();
    }

    public Grade getLevel() {
        return level;
    }

    public boolean equals(Undergraduate ug) {
        return ug.getLevel() == getLevel() || ug.getMajor().equalsIgnoreCase(getMajor());
    }
}
