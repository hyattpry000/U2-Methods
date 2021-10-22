import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    static JTextField input1;
    static JTextField input2;
    static JLabel solution;
    static JLabel blank;

    public static void main(String[] args) {
        JFrame window = new JFrame("Calculator");
        JPanel panel = new JPanel();
        JLabel num1 = new JLabel("Enter number one: ");
        input1 = new JTextField(18);
        JLabel num2 = new JLabel("Enter number two: ");
        input2 = new JTextField(18);
        JButton buttonMa = new JButton("+");
        JButton buttonSub = new JButton("-");
        JButton buttonMu = new JButton("X");
        JButton buttonDi = new JButton("÷");
        solution = new JLabel("Solution Is: ");
        blank = new JLabel("         ");

        window.setSize(250, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        panel.add(num1);
        panel.add(input1);
        panel.add(num2);
        panel.add(input2);
        panel.add(buttonMa);
        panel.add(buttonSub);
        panel.add(buttonMu);
        panel.add(buttonDi);
        panel.add(blank);
        panel.add(solution);

        buttonMa.addActionListener(new addListener());
        buttonSub.addActionListener(new addListener2());
        buttonMu.addActionListener(new addListener3());
        buttonDi.addActionListener(new addListener4());


        window.add(panel);

        window.setVisible(true);


    }

    private static class addListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            double Num1 = Double.parseDouble(input1.getText());
            double Num2 = Double.parseDouble(input2.getText());


            solution.setText(String.valueOf("The Solution is: " +  Num1 + Num2));


        }
    }
    private static class addListener2 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            double Num1 = Double.parseDouble(input1.getText());
            double Num2 = Double.parseDouble(input2.getText());


            solution.setText(String.valueOf( Num1 - Num2));


        }
    }
    private static class addListener3 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            double Num1 = Double.parseDouble(input1.getText());
            double Num2 = Double.parseDouble(input2.getText());


            solution.setText(String.valueOf("The Solution is: " + Num1 * Num2));


        }
    }
    private static class addListener4 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            double Num1 = Double.parseDouble(input1.getText());
            double Num2 = Double.parseDouble(input2.getText());


            solution.setText(String.valueOf("The Solution is: " + Num1 / Num2));


        }
    }
}
