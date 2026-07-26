import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UI_Event_JDBC extends JFrame implements ActionListener
{
	//GUI components
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	JButton b1,b2,b3,b4;
	
	//JDBC
	Connection con;
	Statement st;
	ResultSet rs;
	
	UI_Event_JDBC()
	{
		setLayout(null);
		l1 = new JLabel("Number");
		l2 = new JLabel("Name");
		l3 = new JLabel("Stipend");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		
		b1 = new JButton("First");
		b2 = new JButton("Next");
		b3 = new JButton("Prev");
		b4 = new JButton("Last");
		
		l1.setBounds(100,100,100,30);
		tf1.setBounds(220,100,100,30);
		
		l2.setBounds(100,140,100,30);
		tf2.setBounds(220,140,100,30);
		
		l3.setBounds(100,180,100,30);
		tf3.setBounds(220,180,100,30);
		
		b1.setBounds(100,220,100,30);
		b2.setBounds(220,220,100,30);
		
		b3.setBounds(100,260,100,30);
		b4.setBounds(220,260,100,30);
		
		add(l1);
		add(tf1);
		
		add(l2);
		add(tf2);
		
		add(l3);
		add(tf3);
		
		add(b1);
		add(b2);
		
		add(b3);
		add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		//JDBC
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kdk","root","shrushti02@1");
			st = con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery("select * from students");
			if(rs.next())
			{
				tf1.setText(rs.getString(1));
				tf2.setText(rs.getString(2));
				tf3.setText(rs.getString(3));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			JButton b = (JButton)ae.getSource();
			if(b==b1)
			{
				rs.first();
			}
			else if(b==b2)
			{
				if(!rs.isLast())
				{
					rs.next();
				}
			}
			else if(b==b3)
			{
				if(!rs.isFirst())
				{
				rs.previous();
				}
			}
			else if(b==b4)
			{
				rs.last();
			}
			tf1.setText(rs.getString(1));
			tf2.setText(rs.getString(2));
			tf3.setText(rs.getString(3));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		UI_Event_JDBC obj = new UI_Event_JDBC();
		obj.setVisible(true);
		obj.setSize(600,600); 
		obj.addWindowListener(new WindowAdapter()
				{
			            public void windowClosing(WindowEvent we)
			            {
			            	System.exit(0);
			            }
				});
	}
}




























