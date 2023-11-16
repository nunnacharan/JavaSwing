package Project;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;
/*import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;*/

public class Create implements ActionListener
{
	JFrame j;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1;
    
	public static void main(String[] args) 
	{
		new Create();
	}
	Create()
	{
		j=new JFrame("Create Email and Password");
		j.setLayout(null);
		j.setSize(800, 800);
		j.getContentPane().setBackground(Color.WHITE);
		
		l1=new JLabel("Enter EMAIL");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Times new Roman",Font.ITALIC,20));
    	l1.setBounds(50, 50, 200, 50);
    	t1=new JTextField(30);
    	t1.setBounds(220, 50, 150, 50);
    	j.add(l1);
    	j.add(t1);
    	
    	l2=new JLabel("Enter Password");
    	l2.setForeground(Color.red);
		l2.setFont(new Font("Times new Roman",Font.ITALIC,20));
    	l2.setBounds(50, 150, 200, 50);
    	t2=new JTextField(30);
    	t2.setBounds(220, 150, 150, 50);
    	j.add(l2);
    	j.add(t2);
    	
    	
    	b1=new JButton("CREATE");
    	b1.setBounds(400, 200, 110, 50);
    	b1.setForeground(Color.red);
    	b1.setFont(new Font("Times new Roman",Font.ITALIC,20));   
    	j.add(b1);

    	b1.addActionListener(this);
    	j.setVisible(true);
    	
	}
	boolean password(String password) 
	{
		int count1=0,count2=0,count3=0,count4=0,i;
	    for(i=0;i<password.length();i++)
	    {
	    	if(password.charAt(i)>='A' && password.charAt(i)<='Z')
	    	{
	    		count1++;
	    	}
	    	if(password.charAt(i)>='a' && password.charAt(i)<='z')
	    	{
	    		count2++;
	    	}
	    	if(password.charAt(i)>='0' && password.charAt(i)<='9')
	    	{
	    		count3++;
	    	}
	    	if(password.charAt(i)=='!' || password.charAt(i)=='@' || password.charAt(i)=='#' || password.charAt(i)=='$'  )
	    	{
	    		count4++;
	    	}
	    }	
	    if(count1>=1 && count2>=1 && count3>=1 && count4>=1 )
	    {
	    	return true;
	    }
	    return false;
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
	    String mail=t1.getText();
	    String password=t2.getText();
	    if(password(t2.getText()))
    	{
	    	new SignIn(mail,password);
    	}
    	else
		{
			JOptionPane.showMessageDialog(j,"PASSWORD Should CONTAIN ");
		}
		
	}

}
