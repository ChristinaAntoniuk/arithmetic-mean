package global_networks;

/**
 * Created by Christina on 12-Nov-16.
 */
public class View {
    // Text's constants
    public final static String INPUT_MESSAGE = "Input numbers (separating by space):";
    public final static String ERROR_MESSAGE = "Error! You should input numbers and separate them by ONE space! Try again.";

    /**
     * Method outputs message to console.
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * Method outputs formatted answer to console.
     * @param arithmeticMean
     * @param roundArithmeticMean
     */
    public void printFormatAnswer(double arithmeticMean, int roundArithmeticMean){
        System.out.printf("Arithmetic mean: %1$d (%2$.2f)", roundArithmeticMean, arithmeticMean);
    }
}
