package MyDesigns;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UIDesign1 extends JPanel
{
	  JPanel PnlTop,PnlBottom,PnlSubTop,PnlLeft,PnlLeft2,PnlRight,PnlCenter,PnlButton,Pnl1,Pnl2,Pnl3,Pnl4,Pnl5,Pnl6,Pnl7,PnlLabel1;
	  JButton Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7;
	  JComboBox cmb1;
      JLabel lbl1,lblimage,lblTop,lblSubtop,lblBottom;

      public UIDesign1()
	  {
		   setLayout(null);
		   setSize(1920,1080);
		 // setTitle("UI Design1");

		   PnlTop=new JPanel();
		   PnlTop.setBounds(10,10,1882,50);
		   PnlTop.setBackground(Color.orange);
		   PnlTop.setLayout(null);
		   add(PnlTop);

		   lblTop=new JLabel("FLOWER ASTHETIC");
		   lblTop.setBounds(750,10,400,30);
		   lblTop.setFont(new Font("Cambria",Font.BOLD,35));
		   PnlTop.add(lblTop);

		   PnlSubTop=new JPanel();
		   PnlSubTop.setBounds(10,70,1882,50);
		   PnlSubTop.setBackground(Color.red);
		   PnlSubTop.setLayout(null);
		   add(PnlSubTop);

		   lblSubtop=new JLabel("A BASIC FLOWER MENU");
		   lblSubtop.setBounds(800,10,400,30);
		   lblSubtop.setFont(new Font("Cambria",Font.BOLD,20));
		   PnlSubTop.add(lblSubtop);

		   PnlLeft=new JPanel();
		   PnlLeft.setBounds(10,130,350,830);
		   PnlLeft.setBackground(Color.orange);
		   PnlLeft.setLayout(null);
		   add(PnlLeft);

		   PnlLabel1=new JPanel();
		   PnlLabel1.setBounds(10,10,330,70);
		   PnlLabel1.setBackground(Color.white);
		   PnlLabel1.setLayout(null);
		   PnlLeft.add(PnlLabel1);

		   lbl1=new JLabel("Label 1");
		   lbl1.setBounds(20,20,80,30);
		   lbl1.setFont(new Font("Cambria",Font.BOLD,20));
		   PnlLabel1.add(lbl1);

		   cmb1=new JComboBox();
		   cmb1.setBounds(110,20,200,30);
		   PnlLabel1.add(cmb1);

		   PnlLeft2=new JPanel();
		   PnlLeft2.setBounds(10,90,330,730);
		   PnlLeft2.setBackground(Color.white);
		   PnlLeft.add(PnlLeft2);

		   PnlCenter=new JPanel();
		   PnlCenter.setBounds(370,130,1131,750);
		   PnlCenter.setBackground(Color.pink);
		   add(PnlCenter);

		   PnlButton=new JPanel();
		   PnlButton.setBounds(370,890,1131,70);
		   PnlButton.setBackground(Color.white);
		   PnlButton.setLayout(null);
		   PnlButton.setBorder(BorderFactory.createLineBorder(Color.black));
		   add(PnlButton);

		   Pnl1=new JPanel();
		   Pnl1.setBounds(10,10,150,50);
		   Pnl1.setBackground(Color.black);
		   Pnl1.setLayout(null);
		   PnlButton.add(Pnl1);

		   Btn1=new JButton("First");
		   Btn1.setBounds(10,10,130,30);
		   Pnl1.add(Btn1);

		   Pnl2=new JPanel();
		   Pnl2.setBounds(170,10,150,50);
		   Pnl2.setBackground(Color.black);
		   Pnl2.setLayout(null);
		   PnlButton.add(Pnl2);

		   Btn2=new JButton("Second");
		   Btn2.setBounds(10,10,130,30);
		   Pnl2.add(Btn2);

		   Pnl3=new JPanel();
		   Pnl3.setBounds(330,10,150,50);
		   Pnl3.setBackground(Color.black);
		   Pnl3.setLayout(null);
		   PnlButton.add(Pnl3);

		   Btn3=new JButton("Third");
		   Btn3.setBounds(10,10,130,30);
		   Pnl3.add(Btn3);

	       Pnl4=new JPanel();
		   Pnl4.setBounds(490,10,150,50);
		   Pnl4.setBackground(Color.black);
		   Pnl4.setLayout(null);
		   PnlButton.add(Pnl4);

		   Btn4=new JButton("Fourth");
		   Btn4.setBounds(10,10,130,30);
		   Pnl4.add(Btn4);

		   Pnl5=new JPanel();
		   Pnl5.setBounds(650,10,150,50);
		   Pnl5.setBackground(Color.black);
		   Pnl5.setLayout(null);
		   PnlButton.add(Pnl5);

		   Btn5=new JButton("Fifth");
		   Btn5.setBounds(10,10,130,30);
		   Pnl5.add(Btn5);

		   Pnl6=new JPanel();
		   Pnl6.setBounds(810,10,150,50);
		   Pnl6.setBackground(Color.black);
		   Pnl6.setLayout(null);
		   PnlButton.add(Pnl6);

		   Btn6=new JButton("Sixth");
		   Btn6.setBounds(10,10,130,30);
		   Pnl6.add(Btn6);

		   Pnl7=new JPanel();
		   Pnl7.setBounds(970,10,150,50);
		   Pnl7.setBackground(Color.black);
		   Pnl7.setLayout(null);
		   PnlButton.add(Pnl7);

		   Btn7=new JButton("Seventh");
		   Btn7.setBounds(10,10,130,30);
		   Pnl7.add(Btn7);

		   PnlRight=new JPanel();
		   PnlRight.setBounds(1511,130,380,830);
		   PnlRight.setBackground(Color.orange);
		   PnlRight.setLayout(null);
		   add(PnlRight);

		   lblimage=new JLabel(new ImageIcon("Picture.JPG"));
		   lblimage.setBounds(10,10,360,810);
		   PnlRight.add(lblimage);

		   PnlBottom=new JPanel();
		   PnlBottom.setBounds(10,970,1882,55);
		   PnlBottom.setBackground(Color.red);
		   PnlBottom.setLayout(null);
		   add(PnlBottom);

		   lblBottom=new JLabel("Harshada Patil");
		   lblBottom.setBounds(800,10,400,30);
		   lblBottom.setFont(new Font("Cambria",Font.BOLD,30));
		   PnlBottom.setLayout(null);
		   PnlBottom.add(lblBottom);

	   }
	   public static void main(String[] args)
	   {
			UIDesign1 A=new UIDesign1();
			A.show();
		}
		public JPanel getCenterPanel()
		{
			return(PnlCenter);
		}


 }















