import javax.swing.*;
import java.awt.event.*;

public class question2 { // name it progressbar
    public static void main(String[] args) {
        JFrame f = new JFrame("Khusboo Karki - ProgressBar");
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JProgressBar bar = new JProgressBar(0, 100);
        bar.setBounds(50, 30, 200, 25);
        bar.setValue(0);
        bar.setStringPainted(true);

        JButton btn = new JButton("Start");
        btn.setBounds(100, 70, 80, 30);

        // Event handling
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Thread(() -> {
                    for (int i = 0; i <= 100; i++) {
                        bar.setValue(i);
                        try { Thread.sleep(50); } catch (Exception ex) {}
                    }
                }).start();
            }
        });

        f.add(bar);
        f.add(btn);
        f.setVisible(true);
    }
}
