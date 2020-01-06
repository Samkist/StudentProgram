/* Created By: Sam Pizette
 * On Date: 12/16/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database.meta;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Graduate extends Student implements Majorable {

    private String major;

    public Graduate(String name, @NotNull String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Major: " + getMajor();
    }
}
