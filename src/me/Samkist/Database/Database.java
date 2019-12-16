/* Created By: Sam Pizette
 * On Date: 12/16/2019
 * Project Name: StudentProgram
 */
package me.Samkist.Database;

import me.Samkist.Database.meta.Undergraduate;

public class Database {
    public static void main(String[] args) {
        Undergraduate grad = new Undergraduate("stinky", null, Grade.SOPHOMORE);
        System.out.println(grad.print());
    }
}
