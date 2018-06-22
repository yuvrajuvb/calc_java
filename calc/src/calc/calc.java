package calc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calc extends JFrame {
	JTextField t1;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b0;
	JButton badd;
	JButton bsub;
	JButton bmul;
	JButton bc;
	JLabel l1=new JLabel();
	Integer num1=null;
	Integer num2=null;
	Integer cnum=null;
	//constructor
	public calc(){	
		setWin();
	b1.addActionListener( new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{cnum=1;
				t1.setText("1");
				if(num1==null){
					num1=1;
				}
				else num2=1;
			
			}
			
		});
	b2.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=2;
			t1.setText("2");
			if(num1==null){
				num1=2;
			}
			else num2=2;
		
		}
		
	});
	b3.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=3;
			t1.setText("3");
			if(num1==null){
				num1=3;
			}
			else num2=3;
		
		}
		
	});
	b4.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=4;
			t1.setText("4");
			if(num1==null){
				num1=4;
			}
			else num2=4;
		
		}
		
	});
	b5.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=5;
			t1.setText("5");
			if(num1==null){
				num1=5;
			}
			else num2=5;
		
		}
		
	});
	b6.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=6;
			t1.setText("6");
			if(num1==null){
				num1=6;
			}
			else num2=6;
		
		}
		
	});
	b7.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=7;
			t1.setText("7");
			if(num1==null){
				num1=7;
			}
			else num2=7;
		
		}
		
	});
	b8.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=8;
			t1.setText("8");
			if(num1==null){
				num1=8;
			}
			else num2=8;
		
		}
		
	});
	b9.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=9;
			t1.setText("9");
			if(num1==null){
				num1=9;
			}
			else num2=9;
		
		}
		
	});
	b0.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=0;
			t1.setText("0");
			if(num1==null){
				num1=0;
			}
			else num2=0;
		
		}
		
	});
	badd.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{   int r=num1+num2; 
		num1=num2=null;
			t1.setText(r+"");
		}
		
	});
	bsub.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{   int r=num1-num2; 
		num1=num2=null;
		t1.setText(r+"");
		}
		
	});
	bmul.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{   int r=num1*num2; 
		num1=num2=null;	
		t1.setText(r+"");
		}
		
	});
	}
	
private void setWin(){
	t1=new JTextField(15);
	b1= new JButton("1");
	b2= new JButton("2");
	b3= new JButton("3");
	b4= new JButton("4");
	b5= new JButton("5");
	b6= new JButton("6");
	b7= new JButton("7");
	b8= new JButton("8");
	b9= new JButton("9");
	b0= new JButton("0");
	
	badd= new JButton("+");
	bsub= new JButton("-");
	bmul= new JButton("*");
	bc= new JButton("C");
	add(t1);
	add(b1);
	add(b2);
	add(b3);
	add(badd);
	add(b4);
	add(b5);
	add(b6);
	add(bsub);
	add(b7);
	add(b8);
	add(b9);
	add(bmul);
	add(b0);
	add(bc);
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(200,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
calc c=new calc();

	}

}
