/* Created By: Sam Pizette
 * On Date: 12/16/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database.meta;

public class Graduate extends Student implements Majorable {

    private String major;
    private int id;

    public Graduate(String name, String major, int ID) {
        super(name, ID);
        this.major = major;
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
                + "ID: " + getId();
    }

    public int getId() {
        return id;
    }

    public boolean equals(Graduate g) {
        return getMajor().equalsIgnoreCase(g.getMajor());
    }
}
