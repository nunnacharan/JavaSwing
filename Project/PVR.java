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

public class PVR implements ActionListener
{
	JFrame j;
	JLabel l1;
	JRadioButton rb1,rb2,rb3;
	JButton b1;

	public static void main(String[] args) 
	{
		new PVR();
	}
	PVR()
	{
		j=new JFrame("PVR MOVIES");
		j.setLayout(null);
		j.setSize(500, 500);
		j.getContentPane().setBackground(Color.gray);
		
		l1=new JLabel("MOVIE NAMES");
		l1.setForeground(Color.white);
		l1.setFont(new Font("Times new Roman",Font.ITALIC,20));
		l1.setBounds(30, 170, 200, 100);
		j.add(l1);
		
		rb1=new JRadioButton("RRR");
		rb1.setForeground(Color.black);
		rb1.setBounds(180, 200, 100, 50);
		rb2=new JRadioButton("GANI");
		rb2.setForeground(Color.black);
		rb2.setBounds(280, 200, 100, 50);
		rb3=new JRadioButton("KGF");
		rb3.setForeground(Color.black);
		rb3.setBounds(380, 200, 100, 50);
		
		j.add(rb1);
		j.add(rb2);
		j.add(rb3);
		
		ButtonGroup gb= new ButtonGroup();
		gb.add(rb1);
		gb.add(rb2);
		gb.add(rb3);
		
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
			
			new TicketsBhaskar();
		}
		else if(rb2.isSelected()==true)
		{
			
			new TicketsGani();
		}
		else
		{
			
			new TicketsKGF();
		}
		
	}

}
