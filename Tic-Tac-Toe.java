//Yash Raj Singh Chauhan
// Tic-Tac-Toe Game using Swing & Awt

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Frame extends JFrame implements ActionListener
{   
   int x=100,y=100;
   JButton b[]=new JButton[9];
   JLabel l,l1;
   Font f1;
   Frame()
   {
	 setLayout(null); 
     f1=new Font("Forte",Font.BOLD,30);
	 setFont(f1);
	 l=new JLabel("Tic-Tac-Toe Game");
     l.setBounds(120,30,250,30);
     l.setFont(f1);
	 add(l);
	 
	 l1=new JLabel();
     l1.setBounds(70,200,350,30);
     l1.setForeground(Color.red);
	 l1.setFont(f1);
	 add(l1);

	 
	 
	 
	 int k=0;
	 for(int i=0;i<3;i++)
	 {
	   for(int j=0;j<3;j++)
	   {
		   b[k]=new JButton();
		   b[k].setBounds(x,y,100,100);
		   b[k].setFont(f1);
		   add(b[k]);
		   b[k].addActionListener(this);
		   k++;
		   x+=100;
	   }	   
	   x=100;
	   y+=100;
	 }
	 
	 
   }
   int c=0;
   int d=0;
   public void actionPerformed(ActionEvent e)
   {
          JButton b1=(JButton)e.getSource();
		  if(c%2==0)
		  {
			  b1.setLabel("X");
		  }
		  else
		  {
			  b1.setLabel("O");
			  
		  }
		  b1.removeActionListener(this);
		  c++;
	if(
	  (b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X")
   || (b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X")
   || (b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X")
   || (b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X")
   || (b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[4].getLabel()=="X")
   || (b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X")
   || (b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X")
   || (b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X")
   )	  
   {
	   d=1;
	   System.out.println("Palyer 1 Winner");
	   l1.setText("PLAYER 1 WINNER!!!");

   }	  
   else if(
      (b[0].getLabel()=="O" && b[1].getLabel()=="O" && b[2].getLabel()=="O")
   || (b[3].getLabel()=="O" && b[4].getLabel()=="O" && b[5].getLabel()=="O")
   || (b[6].getLabel()=="O" && b[7].getLabel()=="O" && b[8].getLabel()=="O")
   || (b[0].getLabel()=="O" && b[3].getLabel()=="O" && b[6].getLabel()=="O")
   || (b[1].getLabel()=="O" && b[4].getLabel()=="O" && b[4].getLabel()=="O")
   || (b[2].getLabel()=="O" && b[5].getLabel()=="O" && b[8].getLabel()=="O")
   || (b[0].getLabel()=="O" && b[4].getLabel()=="O" && b[8].getLabel()=="O")
   || (b[2].getLabel()=="O" && b[4].getLabel()=="O" && b[6].getLabel()=="O")
   )
   {
	   d=1;
	   System.out.println("player 2 wimmer");
	   l1.setText("PLAYER 2 WINNER!!!");
   }
   if(c==9 && d==0){
	   System.out.println("Drew");
	   l1.setText("---Draw---");
	   
   }
		  
		  
   }
}
class TicTacToe
{
  static public void main(String ar[])
  {
     Frame f=new Frame();
	 f.setVisible(true);
	 f.setBounds(100,100,500,500);
	 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
  }
}