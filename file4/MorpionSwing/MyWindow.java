import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindow extends  JFrame{

    public MyWindow(){
        super("Morpion");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);


        Map<String, JButton> buttons= new Hashtable<String, JButton>();
        buttons.put("00", new JButton("\u0020"));
        buttons.put("01", new JButton("\u0020"));
        buttons.put("02", new JButton("\u0020"));
        buttons.put("10", new JButton("\u0020"));
        buttons.put("11", new JButton("\u0020"));
        buttons.put("12", new JButton("\u0020"));
        buttons.put("20", new JButton("\u0020"));
        buttons.put("21", new JButton("\u0020"));
        buttons.put("22", new JButton("\u0020"));

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel plateau = new JPanel(new GridLayout(3, 3));
        plateau.add(buttons.get("00"));
        plateau.add(buttons.get("01"));
        plateau.add(buttons.get("02"));
        plateau.add(buttons.get("10"));
        plateau.add(buttons.get("11"));
        plateau.add(buttons.get("12"));
        plateau.add(buttons.get("20"));
        plateau.add(buttons.get("21"));
        plateau.add(buttons.get("22"));
        plateau.setSize(400, 300);

        contentPane.add(plateau, BorderLayout.CENTER);

        // JPanel action = new JPanel(null);
        JLabel actionText = new JLabel("jwngowngow");
        // action.setSize(400, 100);
        // action.setLocation(0, 100);
        // action.add(actionText);

        contentPane.add(actionText, BorderLayout.SOUTH);
    }

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        MyWindow myWindow = new MyWindow();
        myWindow.setVisible(true);
    }
}
