package book.store.system;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author MJ
 */
public class Splash extends JFrame {
    
    Splash(){
        
        //getContentPane().setBackground(Image.WHITE);
        setLayout(null);
        Font h1 = new Font("Serif", Font.BOLD, 60);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        
        JLabel heading = new JLabel("Athena Reads");
        JLabel img = new JLabel(i3);
        JButton b1 = new JButton("Enter the Store");
        
        
        heading.setBounds(80, 30, 1200, 60);
        img.setBounds(50, 100, 1050, 500);
        b1.setBounds(400,400,300,70);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        
        
        heading.setFont(h1);
        
       
        add(heading);
        add(img);
        img.add(b1);
       
        
        
        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
        
       
        
        
        
    
    }
    
    public static void main(String args[]){
    
    new Splash();
    
    }
    
}
