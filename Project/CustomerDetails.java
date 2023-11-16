package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.*;

public class CustomerDetails implements ActionListener
{
	JFrame j;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1;

	public static void main(String[] args) 
	{
        new CustomerDetails();
	}
	CustomerDetails()
	{
		j=new JFrame("WELCOME");
		j.setLayout(null);
		j.setSize(1000, 1000);
		j.getContentPane().setBackground(Color.white);
		
		l1=new JLabel("Name");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Times new Roman",Font.ITALIC,20));
    	l1.setBounds(100, 50, 100, 50);
    	t1=new JTextField(30);
    	t1.setBounds(220, 50, 150, 50);
    	j.add(l1);
    	j.add(t1);
    	
    	l2=new JLabel("No Of Tickets");
    	l2.setForeground(Color.red);
		l2.setFont(new Font("Times new Roman",Font.ITALIC,20));
    	l2.setBounds(100, 150, 100, 50);
    	t2=new JTextField(30);
    	t2.setBounds(220, 150, 150, 50);
    	j.add(l2);
    	j.add(t2);
    	
    	l3=new JLabel("Phone Number");
    	l3.setForeground(Color.red);
		l3.setFont(new Font("Times new Roman",Font.ITALIC,20));
    	l3.setBounds(100, 250, 100, 50);
    	t3=new JTextField(30);
    	t3.setBounds(220, 250, 150, 50);
    	j.add(l3);
    	j.add(t3);
    	
    	b1=new JButton("Submit");
    	b1.setBounds(400, 200, 100, 100);
    	b1.setForeground(Color.red);
    	b1.setFont(new Font("Times new Roman",Font.ITALIC,20));   
    	j.add(b1);

    	
    	b1.addActionListener(this);
    	j.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String name;
		int tickets;
		long number;
		 if(e.getSource()==b1)
		 {
			 name=t1.getText();
			 tickets=Integer.parseInt(t2.getText());
			 number=Long.parseLong(t3.getText());
			 
			 try {
				 
	                FileWriter w = new FileWriter("C:\\Users\\CHARAN\\eclipse-workspace\\CTOOD\\src\\Project\\Movie Tickets", true);

                 w.write("\n" +t1.getText()+ "\n");
                 w.write(t2.getText() + "\n");
                 w.write(t3.getText() + "\n");
               
                 w.close();
             }
             catch (Exception ae) {
                 System.out.println(ae);
             }
			 JOptionPane.showMessageDialog(j, "Your Details are Saved");
		 }
		 else
		 {
			 JOptionPane.showMessageDialog(j,"Enter the text");
		 }
	}
}
