import javax.swing.*;
import java.awt.event.*;

public class question9 extends JFrame implements FocusListener {
    JTextField tf1, tf2;
    JLabel label;

    public question9() {
        setTitle("Focus Event Demo");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tf1 = new JTextField();
        tf1.setBounds(50, 30, 250, 30);
        tf1.addFocusListener(this);
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 70, 250, 30);
        tf2.addFocusListener(this);
        add(tf2);

        label = new JLabel("Focus status will appear here");
        label.setBounds(50, 110, 300, 30);
        add(label);

        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        if (e.getSource() == tf1) {
            label.setText("TextField 1 gained focus");
        } else if (e.getSource() == tf2) {
            label.setText("TextField 2 gained focus");
        }
    }

    public void focusLost(FocusEvent e) {
        if (e.getSource() == tf1) {
            label.setText("TextField 1 lost focus");
        } else if (e.getSource() == tf2) {
            label.setText("TextField 2 lost focus");
        }
    }

    public static void main(String[] args) {
        new question9();
    }
}
