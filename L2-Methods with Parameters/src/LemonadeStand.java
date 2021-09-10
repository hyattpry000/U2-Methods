import javax.swing.*;
import java.text.DecimalFormat;
public class LemonadeStand {


    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */
    static double price16 = .5;
    static double price20= .99;
    static double tax = 7.5;
    public static void main(String[] args) {

        int num16 = Integer.parseInt(JOptionPane.showInputDialog("How many 16 oz lemonades?"));
        int num20 = Integer.parseInt(JOptionPane.showInputDialog("How many 20 oz lemonades?"));

        calculateCost(num16, num20);

        System.exit(0);
    }


    public static void calculateCost(int num16, int num20) {

        DecimalFormat roundTo2 = new DecimalFormat("#,###.##");


        double cost16 = num16 * price16;
        double cost20 = num20 * price20;

        double total16 = cost16 * (1 + (tax/100.00));
        double total20 = cost20 * (1 + (tax/100.00));

        double total = total16 + total20;

        JOptionPane.showMessageDialog(null, "Your total cost for 16 oz. is: $" + roundTo2.format(total16));
        JOptionPane.showMessageDialog(null, "Your total cost for 20 oz. is: $" + roundTo2.format(total20));
        JOptionPane.showMessageDialog(null, "Your total cost is: $" + roundTo2.format(total));

    }

}
