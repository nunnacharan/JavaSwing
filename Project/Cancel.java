package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Cancel implements ActionListener 
{
    JFrame j;
    JLabel l1;
    JTextField t1;
    JButton b1;
	public static void main(String[] args) 
	{
        new Cancel();
	}
    Cancel()
    {
    	j=new JFrame("Cancel");
    	j.setLayout(null);
    	j.setSize(500, 500);
    	
    	l1=new JLabel("Enter Tickets");
    	l1.setBounds(100, 100, 100, 50);
        t1=new JTextField(10);
        t1.setBounds(200, 100, 100, 50);
        j.add(t1);
        j.add(l1);
       
        b1=new JButton("CANCEL");
        b1.setBounds(350, 250, 100, 100);
        j.add(b1);
        j.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e)
	{
         if(e.getSource()==b1)
         {
        	 JOptionPane.showMessageDialog(j, "Your cancellation is under progress");
         }
	}

}
