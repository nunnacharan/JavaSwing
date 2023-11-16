package Project;
import java.io.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Theaters implements ActionListener 
{
	JFrame j;
	JLabel l1,l2;
	JComboBox c1,c2;
	JButton b1;
	String d[] = { "Select","PVR","PLATENOUS","BHASKAR" };
	String s[] = { "Select","11:00","14:30","18:15","21:30"};

	public static void main(String[] args) 
	{
		new Theaters();
	}
	Theaters()
	{
		
		j=new JFrame("THEATERS");
		j.setLayout(null);
		j.setSize(1000, 1000);
		j.getContentPane().setBackground(Color.gray);
		
		l1=new JLabel(" Theater Name ");
		l1.setForeground(Color.white);
		l1.setFont(new Font("Times new Roman",Font.ITALIC,20));
		l1.setBounds(50, 150, 200, 50);
		j.add(l1);
		
		c1=new JComboBox(d);
		c1.setForeground(Color.black);
		c1.setBounds(210, 150, 100, 50);
		j.add(c1);
		
		l2=new JLabel(" Show Timings ");
		l2.setForeground(Color.white);
		l2.setFont(new Font("Times new Roman",Font.ITALIC,20));
		l2.setBounds(50, 300, 200, 50);
		j.add(l2);
		
		c2=new JComboBox(s);
		c2.setBounds(210, 300, 100, 50);
		c2.setForeground(Color.black);
		j.add(c2);
		
		b1=new JButton("NEXT");
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("Times new Roman",Font.ITALIC,20));
		b1.setBounds(430, 450, 150, 50);
		j.add(b1);
		
		b1.addActionListener(this);
		j.setVisible(true);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{ 
        String s1=c1.getSelectedItem()+" ";
        String s2=c2.getSelectedItem()+" ";
        if (e.getSource() == b1) {
        	if (e.getSource() == b1) {
	            try {

	                
	                FileWriter w = new FileWriter("C:\\Users\\CHARAN\\eclipse-workspace\\CTOOD\\src\\Project\\Movie Tickets", true);

	                w.write(s1 + "\n");
	                w.write(s2 + "\n"); 
	                w.close();
	            }
	            catch (Exception ae) {
	                System.out.println(ae);
	            }
	        }
	        JOptionPane.showMessageDialog(j,"Successfully Saved"+ " The Details");
        }
        JOptionPane.showMessageDialog(j,"Successfully Saved"+ " The Details");

		
		if(c1.getSelectedItem()=="PVR") 
		{
			new PVR();
		}
		
		else if(c1.getSelectedItem()=="PLATENOUS" ) 
		{
			new Platenous();
		}
		else if(c1.getSelectedItem()=="BHASKAR" ) 
		{
			new Bhaskar();
		}
		else
		{
	    }
		
		
	}
}

