import java.awt.*;
             
public class UI_01 extends Frame
{    
	UI_01()
	{
		Button b = new Button("Home");
        b.setBounds(100,120,80,30);
        add(b);
        
        setSize(400,450);
        setLayout(null);
        setVisible(true);
	}
	public static void main(String[] args)
	{
		new UI_01();
	}
}
