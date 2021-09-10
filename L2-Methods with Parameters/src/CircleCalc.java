import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        //create and run the program
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));
        areaCir(radius);
        circCir(radius);
    }

    //re-write the method to calculate a circle's area using parameters
    private static void  areaCir(double radius){
        DecimalFormat round = new DecimalFormat("#.##");

        double area = radius * radius * Math.PI;
        JOptionPane.showMessageDialog(null, "The area is " + round.format((area)));

    }

    //re-write the method to calculate a circle's perimeter using parameters
    private static void circCir(double radius) {
        DecimalFormat round = new DecimalFormat("#.##");

        double circumference = 2 * radius * Math.PI;
        JOptionPane.showMessageDialog(null, "The circumference is " + round.format((circumference)));



    }
}
