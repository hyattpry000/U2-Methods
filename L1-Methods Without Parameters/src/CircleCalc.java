import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        //call the area method
        area();
        //call the circumference method
        circumference();
    }

    private static void area() {
        DecimalFormat round = new DecimalFormat("#.##");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));
        double area = radius * radius * Math.PI;

        JOptionPane.showMessageDialog(null, "The area is " + round.format((area)));
    }

    private static void circumference() {
        DecimalFormat round = new DecimalFormat("#.##");
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));
        double circumference = 2 * radius * Math.PI;

        JOptionPane.showMessageDialog(null, "The circumference is " + round.format((circumference)));

    }

    //write a method to calculate a circle's area


    //write a method to calculate a circle's circumference

}
