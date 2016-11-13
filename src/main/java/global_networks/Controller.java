package global_networks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Christina on 12-Nov-16.
 */

public class Controller {

    Model model;
    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Method realizes the program logic.
     */
    public void process() {
        Scanner sc = new Scanner(System.in);
        model.setNumbers(convertStringToInteger(sc));
        double arithmeticMean = model.countArithmeticMean();
        view.printFormatAnswer(arithmeticMean, model.roundArithmeticMean(arithmeticMean));
    }

    /**
     * Method gets input string, splits it by spaces and converts this individual numbers to Integer format.
     * @param sc
     * @return
     */
    public ArrayList<Integer> convertStringToInteger(Scanner sc) {
        ArrayList<Integer> numbers = new ArrayList<>();
        view.printMessage(View.INPUT_MESSAGE);
        String stringNumbers = sc.nextLine();
        while (!validation(stringNumbers, IPattern.INT_PATTERN)){
            view.printMessage(View.ERROR_MESSAGE);
            view.printMessage(View.INPUT_MESSAGE);
            stringNumbers = sc.nextLine();
        }
        String stringNumbersArray[] = stringNumbers.trim().split(" ");
        for (String num : stringNumbersArray) {
            numbers.add(new Integer(num));
        }
        return numbers;
    }

    /**
     * Method validates input string data.
     * @param stringNumbers
     * @param regex
     * @return
     */
    public boolean validation(String stringNumbers, final String regex) {
        String stringNumbersArray[] = stringNumbers.trim().split(" ");
        Pattern p = Pattern.compile(regex);
        Matcher m;
        boolean valid = true;
        for (String num : stringNumbersArray){
            m = p.matcher(num);
            if (!m.matches()) {
                valid = false;
                break;
            }
        }
        return valid;
    }
}
