/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;

/**
 *
 * @author nedim.basic
 */
public class LibClass {
     public static String about(String[] args) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
                b.append(args[i].charAt(i));
            
        }
        return b.toString();
                }
}
