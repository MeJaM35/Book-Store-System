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
public class Sell extends JFrame {
    
    Sell(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        Font heading = new Font("Default", Font.BOLD, 60);
        //Font subheading = new Font("Default", Font.BOLD, 40);
        Font lbls = new Font("Default", Font.BOLD, 20);
    
        JLabel h1 = new JLabel("Add a new book");
        h1.setBounds(80, 30, 1200, 60);
        h1.setFont(heading);
        add(h1);
        
        
        JLabel bnamel = new JLabel("Book Namee:");
        bnamel.setBounds(80, 140, 1200, 60);
        bnamel.setFont(lbls);
        add(bnamel);
        
        JLabel descl = new JLabel("Description:");
        descl.setBounds(80, 200, 1200, 60);
        descl.setFont(lbls);
        add(descl);
        
        JLabel subl = new JLabel("Subject:");
        subl.setBounds(80, 260, 1200, 60);
        subl.setFont(lbls);
        add(subl);
        
        JLabel authl = new JLabel("Author");
        authl.setBounds(80, 320, 1200, 60);
        authl.setFont(lbls);
        add(authl);

        JLabel pricel = new JLabel("Price:");
        pricel.setBounds(80, 380, 1200, 60);
        pricel.setFont(lbls);
        add(pricel);
        
        JTextField bnamet = new JTextField("e.g. DSA");
        bnamet.setBounds(280, 140, 350, 60);
        bnamet.setFont(lbls);
        add(bnamet);
        
        JTextField desct = new JTextField("");
        desct.setBounds(280, 200, 350, 60);
        desct.setFont(lbls);
        add(desct);
        
        JTextField subt = new JTextField("Comp Science");
        subt.setBounds(280, 260, 350, 60);
        subt.setFont(lbls);
        add(subt);
        
        JTextField autht = new JTextField("e.g. MJ");
        autht.setBounds(280, 320, 350, 60);
        autht.setFont(lbls);
        add(autht);

        JTextField pricet = new JTextField("$$$");
        pricet.setBounds(280, 380, 350, 60);
        pricet.setFont(lbls);
        add(pricet);
        
        JButton sellbtn = new JButton("Sell");
        sellbtn.setBounds(280, 450, 150, 50);
        sellbtn.setBackground(Color.BLACK);
        sellbtn.setForeground(Color.WHITE);
        add(sellbtn);
        
        
        
        
        setSize(700, 600);
        setLocation(500, 500);
        setVisible(true);
        
    }
    
    public static void main(String args[]){
        
        new Sell();
    }
    
}
