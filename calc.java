package calc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calc extends JFrame {
	JTextField t1,t2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bc,bEq;
	JLabel l1;
	JLabel l2;
	Integer num1=null;
	Integer num2=null;
	Integer cnum=null;
	Integer cop=null;
	int flag=0,set=0;
	//constructor
public calc(){	
		setWin();
	b1.addActionListener( new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{cnum=1;
			setDig();		}
				});
	b2.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=2;
		setDig();		}
	});
	b3.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=3;
		setDig();		}
	});
	b4.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=4;
		setDig();	}			
	});
	b5.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=5;
		setDig();			}
	});
	b6.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=6;
		setDig();		}
	});
	b7.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=7;
		setDig();		}
	});
	b8.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=8;
		setDig();		}
	});
	b9.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=9;
		setDig();		}
	});
	b0.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{cnum=0;
		setDig();
		}
	});
	badd.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{  flag=1;
		set=0;
		cop=11;
		}
		
	});
	bsub.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{     flag=1;
		set=0;
			cop=22;
		}
		
	});
	bmul.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{     flag=1;
		set=0;
			cop=33;
		}
		
	});
	bc.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{  
		num1=num2=cop=null;	
		t1.setText(" ");
		}
	});
bEq.addActionListener( new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{  calcFun(num1,num2,cop);
	}
});
}
private void setDig(){
		if(flag==0 )
		{ 
		       if(num1!=null && set!=1)
			   num1=num1*10+cnum;
		       else {num1=cnum;
		       set=0;
		       }
		       t1.setText(num1+"");
		}
		else{
			if(num2!=null)
				num2=num2*10+cnum;
			else num2=cnum;
		
			t1.setText(num2+"");
		}		
	}

private void calcFun(int a,int b,int c){
	int r=0;
	System.out.println("add"+a+b+c);
	switch (c){
	case 11:r=a+b;
			num1=r;
			set=1;
			num2=cop=null;
			flag=0;
			t2.setText(r+"");
			break;
	case 22:r=a-b;
			num1=r;
			flag=0;
			set=1;
			num2=cop=null;
			t2.setText(r+"");
			break;
	case 33:r=a*b;
			num1=r;
			flag=0;
			set=1;
			num2=cop=	null;
			t2.setText(r+"");
			break;
	default:add(l2);
			break;
	}
}
	
private void setWin(){
	l1=new JLabel("CALCULATOR");
	l2=new JLabel("error");
	t1=new JTextField(15);
	t2=new JTextField("result",15);
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
	bEq=new JButton("=");
	add(l1);
	add(t1);
	add(t2);
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
	add(bEq);
	
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(200,300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
calc c=new calc();

	}

}
