import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */

    public static void main(String[] args) {
        JFrame window = new JFrame("Conversion Tool");
        JPanel panel = new JPanel();
        JButton MtF = new JButton("Press Here for Meters -> Feet");
        JButton FtM = new JButton("Press Here for Feet -> Meter");

        window.setSize(350,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        FtM.addActionListener(new FtMListener());
        MtF.addActionListener(new MtFListener());

        panel.add(FtM);
        panel.add(MtF);

        window.add(panel);
        window.setVisible(true);
    }
    private static class FtMListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number =Double.parseDouble(JOptionPane.showInputDialog("Enter the feet"));

            double result = number / 3.28;

            JOptionPane.showMessageDialog(null, result + " in meters");
        }
    }
    private static class MtFListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number =Double.parseDouble(JOptionPane.showInputDialog("Enter the meters"));

            double result = number * 3.28;

            JOptionPane.showMessageDialog(null, result + " in feet");
        }
    }

}
