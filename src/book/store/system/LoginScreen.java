/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.store.system;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author MJ
 */
public class LoginScreen extends JFrame {
    
    LoginScreen(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        Font heading = new Font("Default", Font.BOLD, 60);
        //Font subheading = new Font("Default", Font.BOLD, 40);
        Font lbls = new Font("Default", Font.BOLD, 20);
    
        JLabel h1 = new JLabel("Login");
        h1.setBounds(80, 30, 1200, 60);
        h1.setFont(heading);
        add(h1);
        
        
        JLabel unamel = new JLabel("Username:");
        unamel.setBounds(80, 140, 1200, 60);
        unamel.setFont(lbls);
        add(unamel);
        
        JLabel pwdl = new JLabel("Password:");
        pwdl.setBounds(80, 200, 1200, 60);
        pwdl.setFont(lbls);
        add(pwdl);
        
        JTextField unamet = new JTextField("Username");
        unamet.setBounds(200, 140, 350, 60);
        unamet.setFont(lbls);
        add(unamet);
        
        JTextField pwdt = new JTextField("****");
        pwdt.setBounds(200, 200, 350, 60);
        pwdt.setFont(lbls);
        add(pwdt);
        
        JButton lgnbtn = new JButton("Enter the Store");
        lgnbtn.setBounds(250, 300, 150, 50);
        lgnbtn.setBackground(Color.BLACK);
        lgnbtn.setForeground(Color.WHITE);
        add(lgnbtn);
        
        
        
        
        setSize(700, 450);
        setLocation(500, 500);
        setVisible(true);
    
    }
    
    public static void main(String args[]){
    
        
        new LoginScreen();
    
    }
    
}
