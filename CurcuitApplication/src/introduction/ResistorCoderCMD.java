/**
 *  Java program to calculate resistor value form it's color code!
 *  By writing color name throw command line.
 *  Template writing color code is color-color-color
 */
package introduction;

/**
 *
 * @author nedim.basic
 */
import java.util.Scanner;

public class ResistorCoderCMD {

    private String colorCodes;
    private final String[] numberCodes = {"BLACK", "BROWN", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PINK", "GRAY", "WHITE"};

    private void inputColorCode() {
        System.out.print("Enter color code(red-red-green):");
        Scanner s = new Scanner(System.in);

        colorCodes = s.nextLine().toUpperCase();

    }

    private String convertToValues() {
        String result ="";
        int tmp=0;

        String Codes[] = colorCodes.split("-");
        System.out.println(Codes[0]);
        result = "" + getIndexOfCodeArray(Codes[0]) + getIndexOfCodeArray(Codes[1]);
        System.out.println(result);
        tmp = getIndexOfCodeArray(Codes[2]);

        double value = Long.parseLong(result) * Math.pow(10, tmp);

        result = Double.toString(value);

        return result;

    }

    private int getIndexOfCodeArray(String color) {

        int res = -1;
        for (int i = 0; i < numberCodes.length; i++) {

            if (numberCodes[i].equals(color)) {
                return i;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        ResistorCoderCMD rcc = new ResistorCoderCMD();
        while (true) {
            try {
                System.out.println("©Nedim Software Solutions");
                rcc.inputColorCode();
                System.out.println(rcc.convertToValues() + " Ohm(s)");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Error input! Try again.");
            }

        }
    }

}
