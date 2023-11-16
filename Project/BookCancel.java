package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BookCancel implements ActionListener
{
	JFrame j;
	JButton b1,b2;

	public static void main(String[] args) 
	{
       new BookCancel();
	}
	BookCancel()
	{
		j=new JFrame("Book or Cancel");
		j.setLayout(null);
		j.setSize(500, 500);
		
	    b1=new JButton("Book");
	    b1.setBounds(100, 150, 100, 50);
	    j.add(b1);
	    
	    b2=new JButton("Cancel");
	    b2.setBounds(200, 150, 100, 50);
	    j.add(b2);
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    
	    j.setVisible(true);
	 }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
      if(e.getSource()==b1)
      {
    	
			new Theaters();
		
		
      }
      if(e.getSource()==b2)
      {
    	  new Cancel();
      }
	}

}
