package book.store.system;
import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {

    Home(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        Font heading = new Font("Default", Font.BOLD, 30);
        Font wl = new Font("Default", Font.BOLD, 20);

        

        JLabel h1 = new JLabel("Athena Reads");
        h1.setBounds(80, 30, 1200, 60);
        h1.setFont(heading);
        add(h1);

        JButton wishlist = new JButton("Wishlist");
        wishlist.setBounds(900, 30, 150, 50);
        wishlist.setBackground(Color.WHITE);
        wishlist.setForeground(Color.BLACK);
        wishlist.setBorder(null);
        wishlist.setFont(wl);
        add(wishlist);



        Icon icon = new ImageIcon("icons/search.png");
        JButton srchbtn = new JButton(icon);
        srchbtn.setBounds(100, 100, 50, 50);
        srchbtn.setBackground(Color.WHITE);
        srchbtn.setForeground(Color.BLACK);
        srchbtn.setBorder(null);
        srchbtn.setFont(wl);
        add(srchbtn);



        JTextField searchbr = new JTextField("Search");
        searchbr.setBounds(150, 100, 900, 50);
        searchbr.setFont(wl);
        add(searchbr);

        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);


        
        
        
        
        
    }
    
    public static void main(String args[]){



        new Home(){};
    }
}
