import javax.swing.*;
import java.awt.*;

public class TicTacTOE {
    public static void main(String[] args) {
        JFrame panel =new JFrame();
        panel.setVisible(true);
        panel.setSize(1000,500);
        JButton button =new JButton("Click me");
        button.setBounds(5,5,100,100);
        panel.setLayout(null);
        panel.add(button);
        button.setEnabled(true);

    }
}
