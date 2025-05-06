package baitapC2;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class bt29 extends JFrame {
    public bt29() {
        setTitle("Bài 29");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Documents");
        DefaultMutableTreeNode folder1 = new DefaultMutableTreeNode("Photos");
        DefaultMutableTreeNode folder2 = new DefaultMutableTreeNode("Videos");

        root.add(folder1);
        root.add(folder2);

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);

        add(scrollPane);
    }

    public static void main(String[] args) {
        new bt29().setVisible(true);
    }
}
