import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JLabel label1;
    private JLabel label2;
    private int count = 0;
    private int changes = 0;

    //constructor
    public GUI() {
        //Create frame
        JFrame frame = new JFrame("Simple GUI");
        //Set frame size
        frame.setSize(600, 400);
        //Makes program exit when we close the GUI
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create panel & set defaults
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(2, 2, 30, 30));
        frame.add(panel);

        //Create Label & add to panel
        label1 = new JLabel("Value: " + count);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label1);
        label2 = new JLabel("Number of Changes: " + changes);
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label2);


        //Create Buttons & add to panel
        JButton b1 = new JButton("+1");
        JButton b2 = new JButton("-1");
        panel.add(b1);
        panel.add(b2);

        //Adding actions to buttons
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //code we want to run when B1 is pressed
                b1Press();
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b2Press();
            }
        });





        //Makes frame show up
        //Should be at the end of the constructor
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }

    //Methods that are called when buttons are clicked
    public void b1Press(){
        count ++;
        changes++;
        label1.setText("Value: " + count);
        label2.setText("Number of Changes: " + changes);
    }
    public void b2Press()
    {
        count --;
        changes++;
        label1.setText("Value: " + count);
        label2.setText("Number of Changes: " + changes);
    }
}