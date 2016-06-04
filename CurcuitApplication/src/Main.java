
import introduction.LibClass;

/**
 * Programming electronics and other electrical circuit.  
 * In this application we show 10 simple electrical circuits.
 */
/**
 *
 * @author nedim.basic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String welcomeMessage = LibClass.about(args);
        System.out.println("Welcome messsage: " + welcomeMessage);
    }
}
