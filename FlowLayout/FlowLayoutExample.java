package java510;
import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample 
{
	FlowLayoutExample()
	{
		Frame f = new Frame("BVRITH College");
		Button b1 = new Button("CSE");
		Button b2 = new Button("IT");
		Button b3 = new Button("AIML");
		Button b4 = new Button("ECE");
		Button b5 = new Button("EEE");
		f.setLayout(new FlowLayout());
		f.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
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
		new FlowLayoutExample();
	}
}
