package book.store.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author MJ
 */
public class Splash extends JFrame implements ActionListener {
    
    Splash(){
        
        //getContentPane().setBackground(Image.WHITE);
        setLayout(null);
        Font h1 = new Font("Serif", Font.BOLD, 60);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        
        JLabel heading = new JLabel("Athena Reads");
        JLabel img = new JLabel(i3);
        JButton lgbtn = new JButton("Login");
        JButton regbtn = new JButton("Register");
        
        
        heading.setBounds(80, 30, 1200, 60);
        img.setBounds(50, 100, 1050, 500);
        lgbtn.setBounds(300,400,200,70);
        lgbtn.setForeground(Color.BLACK);
        lgbtn.setBackground(Color.WHITE);
        lgbtn.addActionListener(this);

        regbtn.setBounds(500,400,200,70);
        regbtn.setForeground(Color.BLACK);
        regbtn.setBackground(Color.WHITE);
        regbtn.addActionListener(this);
        
        
        heading.setFont(h1);
        
       
        add(heading);
        add(img);
        img.add(lgbtn);
        img.add(regbtn);
       
        
        
        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
        
       
        
        
        
    
    }

    public void actionPerformed(ActionEvent ae){
    setVisible(false);
    new LoginScreen();

    }
    
    public static void main(String args[]){
    
    new Splash();
    
    }
    
}
