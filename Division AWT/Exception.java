package java510;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Divide extends JFrame implements ActionListener
{
	JFrame f;
	JPanel c;
	JTextField txt1, txt2, txt3;
	JLabel l1, l2;
	JButton b;
	Divide()
	{
		f = new JFrame("Division");
		c = new JPanel();
		c.setLayout(new FlowLayout());
		l1 = new JLabel("Enter First Number");
		txt1 = new JTextField(20);
		l2 = new JLabel("Enter Second Number");
		txt2 = new JTextField(20);
		txt3 = new JTextField(20);
		b = new JButton("Divide");
		b.addActionListener(this);
		c.add(l1);
		c.add(txt1);
		c.add(l2);
		c.add(txt2);
		c.add(b);
		c.add(txt3);
		
		f.add(c);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int num1, num2;
		try
		{
			num1 = Integer.parseInt(txt1.getText());
			num2 = Integer.parseInt(txt2.getText());
			txt3.setText("Result :  " + num1/num2);
		}
		catch(NumberFormatException ne)
		{
			JOptionPane.showMessageDialog(f, "Number Format Exception");
		}
		catch(ArithmeticException ae)
		{
			JOptionPane.showMessageDialog(f, "Arithmetic Exception");
		}
	}
}
public class Exception
{
	public static void main(String args[])
	{
		new Divide();
	}
}
