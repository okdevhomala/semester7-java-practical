import javax.swing.*;
import java.awt.event.*;

public class question7 extends JFrame implements KeyListener {
    JTextField inputField;
    JLabel infoLabel;

    public question7() {
        setTitle("KeyEvent Demo");
        setSize(400, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        infoLabel = new JLabel("Type something:");
        infoLabel.setBounds(30, 30, 200, 30);
        add(infoLabel);

        inputField = new JTextField();
        inputField.setBounds(30, 70, 300, 30);
        inputField.addKeyListener(this); // attach KeyListener
        add(inputField);

        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        infoLabel.setText("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        // Optional: show key code
    }

    public void keyReleased(KeyEvent e) {
        // Optional: reset or do nothing
    }

    public static void main(String[] args) {
        new question7();
    }
}
