package NTSpellCheck;

import java.awt.*;
import javax.swing.*;
import java.io.*;

public class SCTest {

    public static void main(String args[]) {
        try {
            JFrame frame = new JFrame("NTSpellCheck Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setLayout(new BorderLayout());
            JTextArea area = new JTextArea();
            File f = new File(System.getProperty("user.home") + "/.NPad/Dictionary/dictionary.txt");
            NTSpellCheck checker = new NTSpellCheck(area, f, true, true, 25, Color.red, NTSpellCheck.WAVE_UNDERLINE);
            frame.getContentPane().add(area, BorderLayout.CENTER);
            frame.setSize(640, 480);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}