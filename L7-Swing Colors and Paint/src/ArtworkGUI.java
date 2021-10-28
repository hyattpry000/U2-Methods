import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;
    Color one = new Color(240,152,240);

    public ArtworkGUI()
    {
        frame = new JFrame("demarcus");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);



        //CREATE THE GUI
        JPanel panel = new ArtworkGUI.MyDrawing();
        frame.add(panel);
        frame.setVisible(true);



    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(Color.black);
        }

        //Add the PaintComponent Method and create your drawing.

        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.setColor(Color.yellow);
            g.fillOval(90,75,400,400);

            g.setColor(Color.black);
            g.fillOval(150,150,100,100);
            g.fillOval(350,150,100,100);



            g.setColor(Color.magenta);
            g.fillArc(100,100,100,100,40,180);

            g.setColor(Color.white);
            g.fillArc(250,275,123,123,180,180);
            g.setColor(Color.black);
            g.drawArc(250,275,123,123,180,180);


        }
    }
}
