import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {



        Frame frame = new Frame();
        JOptionPane.showMessageDialog(frame, "Hello from Frame");


        String s = JOptionPane.showInputDialog(frame, "Say your name: ");
        System.out.println(s);

        frame.dispose();

    }

}
