import javax.accessibility.AccessibleAction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel(new GridLayout(6, 2));
        jFrame.add(jPanel);
        JButton jbutton1 = new JButton("Text");
        JButton jbutton2 = new JButton("Text");
        JButton jbutton3 = new JButton("Text");
        JButton jbutton4 = new JButton("Text");
        JButton jbutton5 = new JButton("Text");
        JButton jbutton6 = new JButton("Text");
        JButton jbutton7 = new JButton("Text");
        JButton jbutton8 = new JButton("Text");
        JButton jbutton9 = new JButton("Text");
        JButton jbutton10 = new JButton("Text");


        jPanel.add(jbutton1);
        jPanel.add(jbutton2);
        jPanel.add(jbutton3);
        jPanel.add(jbutton4);
        jPanel.add(jbutton5);
        jPanel.add(jbutton6);
        jPanel.add(jbutton7);
        jPanel.add(jbutton8);
        jPanel.add(jbutton9);
        jPanel.add(jbutton10);

        jFrame.setContentPane(jPanel);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html><h2>Text</h2><i>Text</i>");
            }
        });
        jbutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html><h2>Text</h2><i>Text</i>");
            }
        });
        jbutton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html><h2>Text</h2><i>Text</i>");
            }
        });
        jbutton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html><h2>Text</h2><i>Text</i>");
            }
        });
        jbutton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html><h2>Text</h2><i>Text</i>");
            }
        });
        jbutton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html><h2>Text</h2><i>Text</i>");
            }
        });
        jbutton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html><h2>Text</h2><i>Text</i>");
            }
        });
        jbutton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html><h2>Text</h2><i>Text</i>");
            }
        });
        jbutton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html><h2>Text</h2><i>Text</i>");
            }
        });

        //jbutton1.addActionListener(EventHandler.create(ActionListener.class, jframe, "title", "source.text"));

    }

    static JFrame getFrame() {
        JFrame jframe = new JFrame() {
        };

        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        jframe.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        jframe.setTitle("Made by zimmermann");
        return jframe;
    }
}