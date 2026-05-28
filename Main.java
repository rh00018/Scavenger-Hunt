import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    //Variables
    public static int points = 0;
    public static int modifier = 1;
    public static void main(String[] args) {
        
        //Frame, labels and such
        JFrame frame = new JFrame("Main window");
        
        JButton center = new JButton(new ImageIcon("Product/Assets/Cookie1.jpg")); 
        center.setBounds(100, 100, 500 ,500);
        
        JLabel tracker = new JLabel("Points: " + points);
        tracker.setBounds(400, 50, 100, 25);
        tracker.setFont(new Font("Arial", Font.PLAIN, 20));
        
        
        
        
        center.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                points += modifier;
                tracker.setText("Points: " + points);
            }
        });
        
        //adding things to window and opening window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(tracker);
        frame.add(center);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
        
    }
}