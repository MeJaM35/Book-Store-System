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
public class Register extends JFrame {
    
    Register(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        Font heading = new Font("Default", Font.BOLD, 60);
        //Font subheading = new Font("Default", Font.BOLD, 40);
        Font lbls = new Font("Default", Font.BOLD, 20);
    
        JLabel h1 = new JLabel("Register");
        h1.setBounds(80, 30, 1200, 60);
        h1.setFont(heading);
        add(h1);
        
        
        JLabel unamel = new JLabel("Username:");
        unamel.setBounds(80, 140, 1200, 60);
        unamel.setFont(lbls);
        add(unamel);
        
        JLabel emaill = new JLabel("Email:");
        emaill.setBounds(80, 200, 1200, 60);
        emaill.setFont(lbls);
        add(emaill);
        
        JLabel pwdl1 = new JLabel("Password:");
        pwdl1.setBounds(80, 260, 1200, 60);
        pwdl1.setFont(lbls);
        add(pwdl1);
        
        JLabel pwdl2 = new JLabel("Confirm Password:");
        pwdl2.setBounds(80, 320, 1200, 60);
        pwdl2.setFont(lbls);
        add(pwdl2);
        
        JTextField unamet = new JTextField("Username");
        unamet.setBounds(280, 140, 350, 60);
        unamet.setFont(lbls);
        add(unamet);
        
        JTextField emailt = new JTextField("Email");
        emailt.setBounds(280, 200, 350, 60);
        emailt.setFont(lbls);
        add(emailt);
        
        JTextField pwdt1 = new JTextField("****");
        pwdt1.setBounds(280, 260, 350, 60);
        pwdt1.setFont(lbls);
        add(pwdt1);
        
        JTextField pwdt2 = new JTextField("****");
        pwdt2.setBounds(280, 320, 350, 60);
        pwdt2.setFont(lbls);
        add(pwdt2);
        
        JButton lgnbtn = new JButton("Register");
        lgnbtn.setBounds(280, 400, 150, 50);
        lgnbtn.setBackground(Color.BLACK);
        lgnbtn.setForeground(Color.WHITE);
        add(lgnbtn);
        
        
        
        
        setSize(700, 600);
        setLocation(500, 500);
        setVisible(true);
        
    }
    
    public static void main(String args[]){
        
        new Register();
    }
    
}
