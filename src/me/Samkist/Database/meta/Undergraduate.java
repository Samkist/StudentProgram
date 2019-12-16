/* Created By: Sam Pizette
 * On Date: 12/16/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database.meta;

import com.sun.istack.internal.Nullable;
import me.Samkist.Database.Grade;

public class Undergraduate extends Student implements Majorable {

    private String major;
    private Grade level;

    public Undergraduate(String name, @Nullable String major, Grade level) {
        super(name);
        if(major != null) {
            this.major = major;
        } else {
            this.major = "Undecided";
        }
        this.level = level;
    }


    @Override
    public String getMajor() {
        return major;
    }

    @Override
    public String print() {
        return "Name: " + getName() + "\n"
                + "Major: " + getMajor() + "\n"
                + "Grade: " + getLevel().getDescription();
    }

    public Grade getLevel() {
        return level;
    }
}
