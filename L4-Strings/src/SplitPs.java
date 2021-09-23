import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter your word: ");
        JOptionPane.showMessageDialog(null, splitP(word));
        System.exit(0);
    }



    public static String splitP(String word){
        int pIndex = word.indexOf('p');

        String split = word.substring(pIndex, pIndex + 4);
        return split;
    }

}
