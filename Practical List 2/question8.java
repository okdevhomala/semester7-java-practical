import javax.swing.*;
import java.awt.event.*;

public class question8 extends JFrame {
    JLabel label;

    public question8() {
        setTitle("Simple MouseAdapter");
        setSize(300, 150);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Click anywhere, Khusboo!");
        label.setBounds(80, 50, 150, 30);
        add(label);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked by Khusboo!");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new question8();
    }
}
