import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindow extends JFrame{

    private static int[][] plateau = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private static Random rand = new Random();
    private static boolean joueur = rand.nextBoolean();
    private static Map<String, JButton> buttons = new Hashtable<String, JButton>();
    private static JLabel actionText = new JLabel("jwngowngow");
    private static JTextField xField = new JTextField();
    private static JTextField yField = new JTextField();
    private static JButton placer = new JButton("Placer");

    public MyWindow(){
        super("Morpion");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);

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
        contentPane.add(actionText, BorderLayout.SOUTH);
        contentPane.add(xField);
        contentPane.add(yField);
        contentPane.add(placer);
    }

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        MyWindow myWindow = new MyWindow();
        myWindow.setVisible(true);
    }

    private static void jeu(){
        if(joueur){
            joueur();
        }
        else{
            ordi();
        }
    }

    private static void joueur(){
        System.out.println("Joueur, c'est a votre tour. Entrez la ligne (0-2), puis la colonne (0-2) :");
        int x = 0;
        int y = 0;

        placer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if((xField.getText() != null && xField.getText() != "") && (yField.getText() != null && yField.getText() != "")){
                    x = Integer.parseInt(xField.getText());
                    y = Integer.parseInt(yField.getText());
                }
            }
        });

        if(plateau[x][y] != 0){
            System.out.println("Cette case a déjà été jouée!");
            joueur();
        }

        plateau[x][y] = 1;

        joueur = false;
        jeu();
    }

    private static void ordi(){
        System.out.println("Tour de l'ordinateur :");
        Random randO = new Random();
        int x = 0;
        int y = 0;

        x = randO.nextInt(3);
        y = randO.nextInt(3);

        if(plateau[x][y] != 0){
            ordi();
        }

        plateau[x][y] = 2;

        joueur = true;
        jeu();
    }

    private static boolean verifGO(){
        // tres moche, a modifier dans le futur
        if(
            ((plateau[0][0] == plateau[0][1] && plateau[0][1] == plateau[0][2]) ||
            (plateau[1][0] == plateau[1][1] && plateau[1][1] == plateau[1][2]) ||
            (plateau[2][0] == plateau[2][1] && plateau[2][1] == plateau[2][2]) ||
            (plateau[0][0] == plateau[1][0] && plateau[1][0] == plateau[1][0]) ||
            (plateau[0][1] == plateau[1][1] && plateau[1][1] == plateau[2][1]) ||
            (plateau[0][2] == plateau[1][2] && plateau[1][2] == plateau[2][2]) ||
            (plateau[0][0] == plateau[1][1] && plateau[1][1] == plateau[2][2]) ||
            (plateau[0][2] == plateau[1][1] && plateau[1][1] == plateau[2][0])) &&
            (plateau[0][0] != 0 && plateau[1][1] != 0 && plateau[2][2] != 0)
        ){
            return true;
        }

        return false;
    }
}
