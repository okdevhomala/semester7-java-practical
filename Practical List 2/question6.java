import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class question6 { // AllBordersExample
    public static void main(String[] args) {
        JFrame f = new JFrame("Khusboo Karki");
        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(2, 3, 10, 10));

        JLabel line = new JLabel("Line Border", JLabel.CENTER);
        line.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel etched = new JLabel("Etched Border", JLabel.CENTER);
        etched.setBorder(BorderFactory.createEtchedBorder());

        JLabel bevel = new JLabel("Bevel Border", JLabel.CENTER);
        bevel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        JLabel titled = new JLabel("Titled Border", JLabel.CENTER);
        titled.setBorder(BorderFactory.createTitledBorder("Title"));

        JLabel empty = new JLabel("Empty Border", JLabel.CENTER);
        empty.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel compound = new JLabel("Compound Border", JLabel.CENTER);
        Border outer = BorderFactory.createLineBorder(Color.RED);
        Border inner = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        compound.setBorder(BorderFactory.createCompoundBorder(outer, inner));

        f.add(line);
        f.add(etched);
        f.add(bevel);
        f.add(titled);
        f.add(empty);
        f.add(compound);

        f.setVisible(true);
    }
}
