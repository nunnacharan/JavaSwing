package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Bhaskar implements ActionListener
{
	JFrame j;
	JLabel l1;
	JRadioButton rb1,rb2;
	JButton b1;
	
	public static void main(String[] args)
	{
        new Bhaskar();
	}
	Bhaskar()
	{
		j=new JFrame("PLATENOUS MOVIES");
		j.setLayout(null);
		j.setSize(500, 500);
		j.getContentPane().setBackground(Color.gray);
		
		l1=new JLabel("MOVIE NAMES");
		l1.setForeground(Color.white);
		l1.setFont(new Font("Times new Roman",Font.ITALIC,20));
		l1.setBounds(30, 150, 200, 100);
		j.add(l1);
		
		rb1=new JRadioButton("RRR");
		rb1.setForeground(Color.black);
		rb1.setBounds(180, 200, 100, 50);
		
		rb2=new JRadioButton("KGF");
		rb2.setForeground(Color.black);
		rb2.setBounds(280, 200, 100, 50);
		
		j.add(rb1);
		j.add(rb2);
		
		
		ButtonGroup gb= new ButtonGroup();
		gb.add(rb1);
		gb.add(rb2);
		
		b1=new JButton("SUBMIT");
		b1.setForeground(Color.black);
		b1.setFont(new Font("Times new Roman",Font.CENTER_BASELINE ,20));
		b1.setBounds(230, 400, 150, 50);
		j.add(b1);
		
		b1.addActionListener(this);
		
		j.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(rb1.isSelected()==true)
		{
			System.out.println(rb1.getText());
			
			new TicketsBhaskar();
		}
		else 
		{
			System.out.println(rb2.getText());
			new TicketsKGF();
		}
		
	
	}

}
