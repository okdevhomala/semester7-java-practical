import javax.swing.*;
import javax.swing.tree.*;

public class question1 { // name it jtreejtabledemo
    public static void main(String[] args) {
        JFrame f = new JFrame("Khusboo Karki JTree JTable");

        // JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Semester");
        root.add(new DefaultMutableTreeNode("First"));
        root.add(new DefaultMutableTreeNode("Seventh"));
        JTree tree = new JTree(root);

        // JTable
        String[] col = {"ID", "Name"};
        String[][] data = {
                {"1", "Khusboo Karki"},
                {"2", "Khusboo Karki"}
        };
        JTable table = new JTable(data, col);

        // Layout
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(tree),
                new JScrollPane(table));

        f.add(split);
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
