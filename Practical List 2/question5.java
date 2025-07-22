import javax.swing.*;
import java.awt.event.*;

public class question5 { // SwingMenuExample
    public static void main(String[] args) {
        JFrame f = new JFrame("Khusboo Karki - Swing Menu");
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu fileMenu2 = new JMenu("File 2");
        JMenu fileMenu3 = new JMenu("File 3");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        fileMenu.add(open);
        fileMenu.add(exit);
        menuBar.add(fileMenu);
        menuBar.add(fileMenu2);
        menuBar.add(fileMenu3);

        f.setJMenuBar(menuBar);

        // Event handling
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}
