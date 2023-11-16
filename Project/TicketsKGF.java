package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TicketsKGF implements ActionListener 
{
    JFrame j;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JCheckBox A1,A2,A3,A4,A5,A6,A7,A8;
    JCheckBox B1,B2,B3,B4,B5,B6,B7,B8;
    JCheckBox C1,C2,C3,C4,C5,C6,C7,C8;
    JCheckBox D1,D2,D3,D4,D5,D6,D7,D8;
    JCheckBox E1,E2,E3,E4,E5,E6,E7,E8;
    JCheckBox F1,F2,F3,F4,F5,F6,F7,F8;
    JCheckBox G1,G2,G3,G4,G5,G6,G7,G8;
    JCheckBox H1,H2,H3,H4,H5,H6,H7,H8;
    JButton b1;
    
	public static void main(String[] args)
	{
        new TicketsKGF();
	}
	TicketsKGF()
	{
		j=new JFrame("RRR TICKETS");
		j.setLayout(null);
		j.setSize(1000, 1000);
		j.getContentPane().setBackground(Color.gray);
		
		l1=new JLabel("Reserved Class--RS:250");
		l1.setForeground(Color.white);
		l1.setFont(new Font("Times new Roman",Font.ITALIC,20));
		l1.setBounds(10, 10, 400, 50);
		
        l2=new JLabel("A-");
        l2.setForeground(Color.white);
		l2.setFont(new Font("Times new Roman",Font.ITALIC,20));
        l2.setBounds(10, 50, 50, 50);
        
        
        A1=new JCheckBox("A1");
		A1.setForeground(Color.black);
		A1.setBounds(50, 50, 50, 50);
			
		A2=new JCheckBox("A2");
		A2.setForeground(Color.black);
		A2.setBounds(100, 50, 50, 50);
			
		A3=new JCheckBox("A3");
		A3.setForeground(Color.black);
		A3.setBounds(150, 50, 50, 50);
			
		A4=new JCheckBox("A4");
		A4.setForeground(Color.black);
		A4.setBounds(200, 50, 50, 50);
			
		A5=new JCheckBox("A5");
		A5.setForeground(Color.black);
		A5.setBounds(250, 50, 50, 50);
			
		A6=new JCheckBox("A6");
		A6.setForeground(Color.black);
		A6.setBounds(300, 50, 50, 50);
		
		A7=new JCheckBox("A7");
		A7.setForeground(Color.black);
		A7.setBounds(350, 50, 50, 50);
			
		A8=new JCheckBox("A8");
		A8.setForeground(Color.black);
		A8.setBounds(400, 50, 50, 50);
		
		
		int i;
		l3=new JLabel("B-");
		l3.setForeground(Color.white);
		l3.setFont(new Font("Times new Roman",Font.ITALIC,20));
        l3.setBounds(10, 100, 50, 50);
        
		
			B1=new JCheckBox("B1");
			B1.setForeground(Color.black);
			B1.setBounds(50, 100, 50, 50);
			
			B2=new JCheckBox("B2");
			B2.setForeground(Color.black);
			B2.setBounds(100, 100, 50, 50);
			
			B3=new JCheckBox("B3");
			B3.setForeground(Color.black);
			B3.setBounds(150, 100, 50, 50);
			
			B4=new JCheckBox("B4");
			B4.setForeground(Color.black);
			B4.setBounds(200, 100, 50, 50);
			
			B5=new JCheckBox("B5");
			B5.setForeground(Color.black);
			B5.setBounds(250, 100, 50, 50);
			
			B6=new JCheckBox("B6");
			B6.setForeground(Color.black);
			B6.setBounds(300, 100, 50, 50);
			
			B7=new JCheckBox("B7");
			B7.setForeground(Color.black);
			B7.setBounds(350, 100, 50, 50);
			
			B8=new JCheckBox("B8");
			B8.setForeground(Color.black);
			B8.setBounds(400, 100, 50, 50);
		
		
		l4=new JLabel("C-");
		l4.setForeground(Color.white);
		l4.setFont(new Font("Times new Roman",Font.ITALIC,20));
        l4.setBounds(10, 150, 50, 50);
       
        
        	C1=new JCheckBox("C1");
    		C1.setForeground(Color.black);
    		C1.setBounds(50, 150, 50, 50);
    		
    		C2=new JCheckBox("C2");
    		C2.setForeground(Color.black);
    		C2.setBounds(100, 150, 50, 50);
    		
    		C3=new JCheckBox("C3");
    		C3.setForeground(Color.black);
    		C3.setBounds(150, 150, 50, 50);
    		
    		C4=new JCheckBox("C4");
    		C4.setForeground(Color.black);
    		C4.setBounds(200, 150, 50, 50);
    		
    		C5=new JCheckBox("C5");
    		C5.setForeground(Color.black);
    		C5.setBounds(250, 150, 50, 50);
    		
    		C6=new JCheckBox("C6");
    		C6.setForeground(Color.black);
    		C6.setBounds(300, 150, 50, 50);
    	
    		C7=new JCheckBox("C7");
    		C7.setForeground(Color.black);
    		C7.setBounds(350, 150, 50, 50);
    		
    		C8=new JCheckBox("C8");
    		C8.setForeground(Color.black);
    		C8.setBounds(400, 150, 50, 50);
		
		
		l5=new JLabel("D-");
		l5.setForeground(Color.white);
		l5.setFont(new Font("Times new Roman",Font.ITALIC,20));
        l5.setBounds(10, 200, 50, 50);
        
		D1=new JCheckBox("D1");
		D1.setForeground(Color.black);
		D1.setBounds(50, 200, 50, 50);
			
		D2=new JCheckBox("D2");
		D2.setForeground(Color.black);
		D2.setBounds(100, 200, 50, 50);
			
		D3=new JCheckBox("D3");
		D3.setForeground(Color.black);
		D3.setBounds(150, 200, 50, 50);
			
		D4=new JCheckBox("D4");
		D4.setForeground(Color.black);
		D4.setBounds(200, 200, 50, 50);
		
		D5=new JCheckBox("D5");
		D5.setForeground(Color.black);
		D5.setBounds(250, 200, 50, 50);
			
		D6=new JCheckBox("D6");
		D6.setForeground(Color.black);
		D6.setBounds(300, 200, 50, 50);
			
		D7=new JCheckBox("D7");
		D7.setForeground(Color.black);
		D7.setBounds(350, 200, 50, 50);
			
		D8=new JCheckBox("D8");
		D8.setForeground(Color.black);
		D8.setBounds(400, 200, 50, 50);
		
		l6=new JLabel("Second Class--RS:200");
		l6.setForeground(Color.white);
		l6.setFont(new Font("Times new Roman",Font.ITALIC,20));
		l6.setBounds(10, 250, 400, 50);
		
		
		l7=new JLabel("E -");
		l7.setForeground(Color.white);
		l7.setFont(new Font("Times new Roman",Font.ITALIC,20));
        l7.setBounds(10, 300, 50, 50);
        
		
		E1=new JCheckBox("E1");
		E1.setForeground(Color.black);
		E1.setBounds(50, 300, 50, 50);
			
		E2=new JCheckBox("E2");
		E2.setForeground(Color.black);
		E2.setBounds(100, 300, 50, 50);
			
		E3=new JCheckBox("E3");
		E3.setForeground(Color.black);
		E3.setBounds(150, 300, 50, 50);
			
		E4=new JCheckBox("E4");
		E4.setForeground(Color.black);
		E4.setBounds(200, 300, 50, 50);
		
		E5=new JCheckBox("E5");
		E5.setForeground(Color.black);
		E5.setBounds(250, 300, 50, 50);
			
		E6=new JCheckBox("E6");
		E6.setForeground(Color.black);
		E6.setBounds(300, 300, 50, 50);
			
		E7=new JCheckBox("E7");
		E7.setForeground(Color.black);
		E7.setBounds(350, 300, 50, 50);
			
		E8=new JCheckBox("E8");
		E8.setForeground(Color.black);
		E8.setBounds(400, 300, 50, 50);
		
		
		l8=new JLabel("F-");
		l8.setForeground(Color.white);
		l8.setFont(new Font("Times new Roman",Font.ITALIC,20));
        l8.setBounds(10, 350, 50, 50);
        
		F1=new JCheckBox("F1");
		F1.setForeground(Color.black);
		F1.setBounds(50, 350, 50, 50);
			
		F2=new JCheckBox("F2");
		F2.setForeground(Color.black);
		F2.setBounds(100, 350, 50, 50);
			
		F3=new JCheckBox("F3");
		F3.setForeground(Color.black);
		F3.setBounds(150, 350, 50, 50);
		
		F4=new JCheckBox("F4");
		F4.setForeground(Color.black);
		F4.setBounds(200, 350, 50, 50);
		
		F5=new JCheckBox("F5");
		F5.setForeground(Color.black);
		F5.setBounds(250, 350, 50, 50);
			
		F6=new JCheckBox("F6");
		F6.setForeground(Color.black);
		F6.setBounds(300, 350, 50, 50);
			
		F7=new JCheckBox("F7");
		F7.setForeground(Color.black);
		F7.setBounds(350, 350, 50, 50);
			
		F8=new JCheckBox("F8");
		F8.setForeground(Color.black);
		F8.setBounds(400, 350, 50, 50);
		
		
		l9=new JLabel("G-");
		l9.setForeground(Color.white);
		l9.setFont(new Font("Times new Roman",Font.ITALIC,20));
        l9.setBounds(10, 400, 50, 50);
        
		
		G1=new JCheckBox("G1");
		G1.setForeground(Color.black);
		G1.setBounds(50, 400, 50, 50);
			
		G2=new JCheckBox("G2");
		G2.setForeground(Color.black);
		G2.setBounds(100, 400, 50, 50);
			
		G3=new JCheckBox("G3");
		G3.setForeground(Color.black);
		G3.setBounds(150, 400, 50, 50);
		
		G4=new JCheckBox("G4");
		G4.setForeground(Color.black);
		G4.setBounds(200, 400, 50, 50);
		
	    G5=new JCheckBox("G5");
		G5.setForeground(Color.black);
		G5.setBounds(250, 400, 50, 50);
			
		G6=new JCheckBox("G6");
		G6.setForeground(Color.black);
		G6.setBounds(300, 400, 50, 50);
			
		G7=new JCheckBox("G7");
		G7.setForeground(Color.black);
		G7.setBounds(350, 400, 50, 50);
			
		G8=new JCheckBox("G8");
		G8.setForeground(Color.black);
		G8.setBounds(400, 400, 50, 50);
		
		
		l10=new JLabel("H-");
		l10.setForeground(Color.white);
		l10.setFont(new Font("Times new Roman",Font.ITALIC,20));
        l10.setBounds(10, 450, 50, 50);
        
		
		H1=new JCheckBox("H1");
		H1.setForeground(Color.black);
		H1.setBounds(50, 450, 50, 50);
			
		H2=new JCheckBox("H2");
		H2.setForeground(Color.black);
		H2.setBounds(100, 450, 50, 50);
			
		H3=new JCheckBox("H3");
		H3.setForeground(Color.black);
		H3.setBounds(150, 450, 50, 50);
		
		H4=new JCheckBox("H4");
		H4.setForeground(Color.black);
		H4.setBounds(200, 450, 50, 50);
		
		H5=new JCheckBox("H5");
		H5.setForeground(Color.black);
		H5.setBounds(250, 450, 50, 50);
			
	    H6=new JCheckBox("H6");
		H6.setForeground(Color.black);
		H6.setBounds(300, 450, 50, 50);
			
		H7=new JCheckBox("H7");
		H7.setForeground(Color.black);
		H7.setBounds(350, 450, 50, 50);
			
		H8=new JCheckBox("H8");
		H8.setForeground(Color.black);
		H8.setBounds(400, 450, 50, 50);
			
		
		
		
		j.add(l1);
		j.add(l2);
		j.add(l3);
		j.add(l4);
		j.add(l5);
		j.add(l6);
		j.add(l7);
		j.add(l8);
		j.add(l9);
		j.add(l10);
		
		
		j.add(A1);
		j.add(A2);
		j.add(A3);
		j.add(A4);
		j.add(A5);
		j.add(A6);
		j.add(A7);
		j.add(A8);
		
		j.add(B1);
		j.add(B2);
		j.add(B3);
		j.add(B4);
		j.add(B5);
		j.add(B6);
		j.add(B7);
		j.add(B8);
		
		j.add(C1);
		j.add(C2);
		j.add(C3);
		j.add(C4);
		j.add(C5);
		j.add(C6);
		j.add(C7);
		j.add(C8);
		
		j.add(D1);
		j.add(D2);
		j.add(D3);
		j.add(D4);
		j.add(D5);
		j.add(D6);
		j.add(D7);
		j.add(D8);
		
		j.add(E1);
		j.add(E2);
		j.add(E3);
		j.add(E4);
		j.add(E5);
		j.add(E6);
		j.add(E7);
		j.add(E8);
		
		
		j.add(F1);
		j.add(F2);
		j.add(F3);
		j.add(F4);
		j.add(F5);
		j.add(F6);
		j.add(F7);
		j.add(F8);
		
		j.add(G1);
		j.add(G2);
		j.add(G3);
		j.add(G4);
		j.add(G5);
		j.add(G6);
		j.add(G7);
		j.add(G8);
		
		j.add(H1);
		j.add(H2);
		j.add(H3);
		j.add(H4);
		j.add(H5);
		j.add(H6);
		j.add(H7);
		j.add(H8);
		
		
		b1=new JButton("BOOK");
		b1.setBounds(600, 600, 100, 50);
		b1.setForeground(Color.black);
		j.add(b1);
		
		b1.addActionListener(this);
		
		j.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		 if(e.getSource()==b1)
		 {
			 
			int i;
			
			try {
                FileWriter w = new FileWriter("C:\\Users\\CHARAN\\eclipse-workspace\\CTOOD\\src\\Project\\Movie Tickets");

                if(A1.isSelected()==true)
                {
                	w.write(A1+"\n");
                }
                else if(A2.isSelected()==true)
                {
                	w.write(A2+"\n");
                }
                else if(A3.isSelected()==true)
                {
                	w.write(A3+"\n");
                }
                else if(A4.isSelected()==true)
                {
                	w.write(A4+"\n");
                }
                if(A5.isSelected()==true)
                {
                	w.write(A5+"\n");
                }
                if(A6.isSelected()==true)
                {
                	w.write(A6+"\n");
                }
                if(A7.isSelected()==true)
                {
                	w.write(A7+"\n");
                }
                if(A8.isSelected()==true)
                {
                	w.write(A8+"\n");
                }
                
                if(B1.isSelected()==true)
                {
                	w.write(B1+"\n");
                }
                if(B2.isSelected()==true)
                {
                	w.write(B2+"\n");
                }
                if(B3.isSelected()==true)
                {
                	w.write(B3+"\n");
                }
                if(B4.isSelected()==true)
                {
                	w.write(B4+"\n");
                }
                if(B5.isSelected()==true)
                {
                	w.write(B5+"\n");
                }
                if(B6.isSelected()==true)
                {
                	w.write(B6+"\n");
                }
                if(B7.isSelected()==true)
                {
                	w.write(B7+"\n");
                }
                if(B8.isSelected()==true)
                {
                	w.write(B8+"\n");
                }
                
                if(C1.isSelected()==true)
                {
                	w.write(C1+"\n");
                }
                if(C2.isSelected()==true)
                {
                	w.write(C2+"\n");
                }
                if(C3.isSelected()==true)
                {
                	w.write(C3+"\n");
                }
                if(C4.isSelected()==true)
                {
                	w.write(C4+"\n");
                }
                if(C5.isSelected()==true)
                {
                	w.write(C5+"\n");
                }
                if(C6.isSelected()==true)
                {
                	w.write(C6+"\n");
                }
                if(C7.isSelected()==true)
                {
                	w.write(C7+"\n");
                }
                if(C8.isSelected()==true)
                {
                	w.write(C8+"\n");
                }
                
                if(D1.isSelected()==true)
                {
                	w.write(D1+"\n");
                }
                if(D2.isSelected()==true)
                {
                	w.write(D2+"\n");
                }
                if(D3.isSelected()==true)
                {
                	w.write(D3+"\n");
                }
                if(D4.isSelected()==true)
                {
                	w.write(D4+"\n");
                }
                if(D5.isSelected()==true)
                {
                	w.write(D5+"\n");
                }
                if(D6.isSelected()==true)
                {
                	w.write(D6+"\n");
                }
                if(D7.isSelected()==true)
                {
                	w.write(D7+"\n");
                }
                if(D8.isSelected()==true)
                {
                	w.write(D8+"\n");
                }
                
                if(E1.isSelected()==true)
                {
                	w.write(E1+"\n");
                }
                if(E2.isSelected()==true)
                {
                	w.write(E2+"\n");
                }
                if(E3.isSelected()==true)
                {
                	w.write(E3+"\n");
                }
                if(E4.isSelected()==true)
                {
                	w.write(E4+"\n");
                }
                if(E5.isSelected()==true)
                {
                	w.write(E5+"\n");
                }
                if(E6.isSelected()==true)
                {
                	w.write(E6+"\n");
                }
                if(E7.isSelected()==true)
                {
                	w.write(E7+"\n");
                }
                if(E8.isSelected()==true)
                {
                	w.write(E8+"\n");
                }
                
                if(F1.isSelected()==true)
                {
                	w.write(F1+"\n");
                }
                if(F2.isSelected()==true)
                {
                	w.write(F2+"\n");
                }
                if(F3.isSelected()==true)
                {
                	w.write(F3+"\n");
                }
                if(F4.isSelected()==true)
                {
                	w.write(F4+"\n");
                }
                if(F5.isSelected()==true)
                {
                	w.write(F5+"\n");
                }
                if(F6.isSelected()==true)
                {
                	w.write(F6+"\n");
                }
                if(F7.isSelected()==true)
                {
                	w.write(F7+"\n");
                }
                if(F8.isSelected()==true)
                {
                	w.write(F8+"\n");
                }
                
                if(G1.isSelected()==true)
                {
                	w.write(G1+"\n");
                }
                if(G2.isSelected()==true)
                {
                	w.write(G2+"\n");
                }
                if(G3.isSelected()==true)
                {
                	w.write(G3+"\n");
                }
                if(G4.isSelected()==true)
                {
                	w.write(G4+"\n");
                }
                if(G5.isSelected()==true)
                {
                	w.write(G5+"\n");
                }
                if(G6.isSelected()==true)
                {
                	w.write(G6+"\n");
                }
                if(G7.isSelected()==true)
                {
                	w.write(G7+"\n");
                }
                if(G8.isSelected()==true)
                {
                	w.write(G8+"\n");
                }
                
                if(H1.isSelected()==true)
                {
                	w.write(H1+"\n");
                }
                if(H2.isSelected()==true)
                {
                	w.write(H2+"\n");
                }
                if(H3.isSelected()==true)
                {
                	w.write(H3+"\n");
                }
                if(H4.isSelected()==true)
                {
                	w.write(H4+"\n");
                }
                if(H5.isSelected()==true)
                {
                	w.write(H5+"\n");
                }
                if(H6.isSelected()==true)
                {
                	w.write(H6+"\n");
                }
                if(H7.isSelected()==true)
                {
                	w.write(H7+"\n");
                }
                if(H8.isSelected()==true)
                {
                	w.write(H8+"\n");
                }
                
                
                w.close();
            }
            catch (Exception ae) {
                System.out.println(ae);
            }
			JOptionPane.showMessageDialog(j,"Your Seats are booked");
			new CustomerDetails();
		 }
		 else
		 {
			 JOptionPane.showMessageDialog(j, "Please select seats");
		 }
	}

}
