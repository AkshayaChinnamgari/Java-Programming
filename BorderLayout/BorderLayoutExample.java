package java510;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample 
{
	BorderLayoutExample()
	{
		Frame f = new Frame("Directions");
		Button b1 = new Button("NORTH");
		Button b2 = new Button("SOUTH");
		Button b3 = new Button("EAST");
		Button b4 = new Button("WEST");
		Button b5 = new Button("CENTER");
		f.setLayout(new BorderLayout());

		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new BorderLayoutExample();
	}
}
