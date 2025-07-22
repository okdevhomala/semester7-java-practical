import javax.swing.*;
import javax.swing.event.*;

public class question4 { // SliderChangeEvent
    public static void main(String[] args) {
        JFrame f = new JFrame("Khusboo - JSlider Example");
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JSlider slider = new JSlider(0, 100, 50);
        slider.setBounds(50, 30, 200, 40);

        JLabel label = new JLabel("Value: 50");
        label.setBounds(110, 70, 100, 20);

        // Handling change event
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                label.setText("Value: " + value);
            }
        });

        f.add(slider);
        f.add(label);
        f.setVisible(true);
    }
}
