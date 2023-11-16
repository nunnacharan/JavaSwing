package Project;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

public class SignIn implements ActionListener 
{
	JFrame j;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    String mail,pass;
	SignIn(String mail,String pass)
	{
		this.mail=mail;
		this.pass=pass;
		j=new JFrame("WELCOME");
		j.setLayout(null);
		j.setSize(1000, 1000);
		j.getContentPane().setBackground(Color.WHITE);
		
		l1=new JLabel("UserName");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Times new Roman",Font.ITALIC,20));
    	l1.setBounds(100, 50, 100, 50);
    	t1=new JTextField(30);
    	t1.setBounds(220, 50, 150, 50);
    	j.add(l1);
    	j.add(t1);
    	
    	l2=new JLabel("Password");
    	l2.setForeground(Color.red);
		l2.setFont(new Font("Times new Roman",Font.ITALIC,20));
    	l2.setBounds(100, 150, 100, 50);
    	t2=new JTextField(30);
    	t2=new JPasswordField(30);
    	t2.setBounds(220, 150, 150, 50);
    	j.add(l2);
    	j.add(t2);
    	
    	b1=new JButton("Log in");
    	b1.setBounds(400, 200, 100, 50);
    	b1.setForeground(Color.red);
    	b1.setFont(new Font("Times new Roman",Font.ITALIC,20));   
    	j.add(b1);

    	b1.addActionListener(this);
    	j.setVisible(true);
    	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Scanner sc=new Scanner(System.in);
	    String name=t1.getText();
	    String password=t2.getText();
	    
	    if(name.equals(mail) && password.equals(pass))
		{
	    	new BookCancel();
		}
		else
		{
			JOptionPane.showMessageDialog(j,"INVALID USERNAME or PASSWORD");
		}
		
		
	}

}