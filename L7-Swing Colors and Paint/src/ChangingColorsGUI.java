import javax.print.CancelablePrintJob;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangingColorsGUI {

    //Variables in a class are declared here,
    //but often not initialized

    JFrame window = new JFrame("Color Switcheroo");
    JPanel panel = new JPanel();
    JButton darkTheme = new JButton("Dark");
    JButton lightTheme = new JButton("Second Color");
    JButton retroTheme = new JButton("Third Color");


    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */

    public ChangingColorsGUI() {

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.add(darkTheme);
        panel.add(lightTheme);
        panel.add(retroTheme);

        //create a new Custom color

        //Set the colors of our buttons and panel
        darkTheme.addActionListener(new Dark());
        lightTheme.addActionListener(new Light());
        retroTheme.addActionListener(new Retro());

        window.add(panel);

        window.setVisible(true);
    }

    //Add a listener to change the color when the button is clicked

    private class Dark implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color darkPanel = new Color(200,75,49);
            Color darkButton = new Color(52, 103,81);
            Color darkText = new Color(236,219,186);

            darkTheme.setBackground(darkButton);
            darkTheme.setForeground(darkText);
            panel.setBackground(darkPanel);
        }
    }
    private class Light implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color lightPanel = new Color(202,184,255);
            Color lightButton = new Color(252, 255,166);
            Color lightText = new Color(181,222,255);

            lightTheme.setBackground(lightButton);
            lightTheme.setForeground(lightText);
            panel.setBackground(lightPanel);
        }
    }
    private class Retro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color retroPanel = new Color(162,210,255);
            Color retroButton = new Color(255, 134,94);
            Color retroText = new Color(254,249,239);

            retroTheme.setBackground(retroButton);
            retroTheme.setForeground(retroText);
            panel.setBackground(retroPanel);
        }
    }
}
