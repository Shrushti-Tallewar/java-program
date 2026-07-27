import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UI_Event extends JFrame implements ActionListener
{
	JFrame jf;
	JPanel pp;
	CardLayout cd;
	
	UI_Event()
	{
		jf = new  JFrame("CardLayout Example");
		cd = new CardLayout();
		
		//creating main parent panel that will contain two child panel
		pp = new JPanel();
		
     //Creating two child panels
		    JPanel cp1 = new JPanel();
		    JPanel cp2 = new JPanel();
		
	 //Creating two parents buttons
		    JButton b1 = new JButton("Numbers");
		    JButton b2 = new JButton("Alphabets");
		
	 //Creating 3 child buttons for Numbers button
		    JButton b3 = new JButton("1");
		    JButton b4 = new JButton("2");
	        JButton b5 = new JButton("3");
	    
	  //Creating 3 child buttons for Alphabets button
	  		JButton b6 = new JButton("A");
	  		JButton b7 = new JButton("B");
	  	    JButton b8 = new JButton("C");
	  	    JButton b9 = new JButton("D");
	  	    
	  //Adding b3,b4,b5 button to cp1
	  	    cp1.add(b3);
	  	    cp1.add(b4);
	  	    cp1.add(b5);
	  	    
	  //Adding b6,b7,b8,b9 button to cp2
	  	    cp2.add(b6);
	  	    cp2.add(b7);
	  	    cp2.add(b8);
	  	    cp2.add(b9);
	  	    
	  // Setting the positioning the components 
	  // in pp (that contains cp1 and cp2) to cardLayout
	  	pp.setLayout(cd);
	  
	  //Adding cp1 and cp2 to pp
	  	pp.add(cp1,"Numbers");
	  	pp.add(cp2,"Alphabets");    
	  	
	  	b1.addActionListener(this);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	  	b2.addActionListener(this);
	  	
	  	jf.setLayout(new FlowLayout());
	  	
	  	jf.add(b1);
	  	jf.add(b2);
	  	jf.add(pp);
	  	jf.setSize(300,200);
	  	jf.setVisible(true);
	  	    
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Numbers")
		{
			cd.show(pp,"Numbers");
		}
		else
		{
			cd.show(pp,"Alphabets");
		}
	}
	public static void main(String[] args) 
	{
           new UI_Event();                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	}

}



























