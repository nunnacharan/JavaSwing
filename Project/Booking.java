package Project;
import javax.swing.*;
import javax.swing.*;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.*;
 public class Booking extends JFrame implements ActionListener
        {
           
          JLabel l1;
          JPanel p1,p2;
          
          JButton b1,b2,b3,b4,b5;
           
          Booking()
          {
            this.setTitle("THIS IS MY PROJET BASED ON GUI");
            Container con=getContentPane();
            con.setLayout(new GridLayout(2,1));
            p1 = new JPanel();
            p2 = new JPanel();
            p1.setBackground(Color.BLUE);
            p2.setBackground(Color.cyan);
            con.add(p1);
            con.add(p2);
             
            l1 = new JLabel("WELCOME TO ONLNE MOVIE BOOKING");
            p1.add(l1);
             
            ImageIcon pic1 = new ImageIcon(new ImageIcon("onlinebooking.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
             l1.setIcon(pic1);
             
             
             
            p2.setLayout(new GridLayout(5,1));
            b1 = new JButton("www.bookmyshow.com");
            b2 = new JButton("www.paytym.com");
            b3 = new JButton("www.ticketnew.com");
            b4 = new JButton("www.chalcinemas.com");
            b5 = new JButton("www.pvrcinemas.com");
             
             
           
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            p2.add(b4);
            p2.add(b5);
             
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
             
            this.pack();
             
             
             
          }
           
          public void actionPerformed(ActionEvent e)  
          {
            if(e.getSource()==b1||e.getSource()==b2||e.getSource()==b3||e.getSource()==b4||e.getSource()==b5)
            {
              new Create();
            }
             
          }
           
          public static void main(String[] args) 
          {
             Booking b = new Booking();
             b.setVisible(true);  
             b.setSize(800, 800);  
 
          }
        }