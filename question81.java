import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class question81 { // AWTvsSwingVisualDemo
    public static void main(String[] args) {
        // ----------- AWT Window -----------
        Frame awtFrame = new Frame("AWT Window");
        Label awtLabel = new Label("Aayush Chandra Pradhan");
        Button awtButton = new Button("Click me");

        awtLabel.setBounds(50, 50, 100, 30);
        awtButton.setBounds(50, 100, 100, 30);

        awtFrame.add(awtLabel);
        awtFrame.add(awtButton);

        awtFrame.setSize(250, 200);
        awtFrame.setLayout(null);
        awtFrame.setLocation(100, 100);
        awtFrame.setVisible(true);

        // AWT Button click handler
        awtButton.addActionListener(e -> awtLabel.setText("AWT Clicked"));

        awtFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                awtFrame.dispose();
            }
        });

        // ----------- Swing Window -----------
        JFrame swingFrame = new JFrame("Swing Window");
        JLabel swingLabel = new JLabel("Aayush Chandra Pradhan");
        JButton swingButton = new JButton("Click me");

        swingLabel.setBounds(50, 50, 120, 30);
        swingButton.setBounds(50, 100, 120, 30);

        swingFrame.add(swingLabel);
        swingFrame.add(swingButton);

        swingFrame.setSize(300, 220);
        swingFrame.setLayout(null);
        swingFrame.setLocation(400, 100); // side-by-side with AWT
        swingFrame.setVisible(true);
        swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Swing button click
        swingButton.addActionListener(e -> swingLabel.setText("Swing Clicked"));

        // Optional: Add some look and feel for Swing
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(swingFrame);
        } catch (Exception ex) {
            System.out.println("Look and feel error");
        }
    }
}
