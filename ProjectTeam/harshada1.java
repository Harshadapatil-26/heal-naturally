import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class harshada1 extends JFrame implements ActionListener
{
       JPanel pnlNew;
       JLabel lblHeading;
       JButton btnCancel;
       public harshada1()
	   {
		   setSize(1920,1080);
		   setTitle("Yoga and Ayurveda");
		   setLayout(null);

		   pnlNew=new JPanel();
		   pnlNew.setLayout(null);
		   pnlNew.setBounds(1,1,1920,1080);
		   pnlNew.setBackground(Color.gray);
		   add(pnlNew);

		   lblHeading=new JLabel("A Complete Ayurvedic solution for all Your Problems");
		   lblHeading.setFont(new Font("Cambria",Font.BOLD,40));
		   lblHeading.setBounds(540,100,1000,100);
		   lblHeading.setForeground(Color.white);
		   pnlNew.add(lblHeading);

		   btnCancel=new JButton("<-");
		   btnCancel.setBounds(10,10,50,20);
		   pnlNew.add(btnCancel);
	       btnCancel.addActionListener(this);
	   }
	   public void actionPerformed(ActionEvent ae)
	   {
		   if(ae.getSource()==btnCancel)
		   {
		           harshada A=new harshada();
		           A.show();
			}
		}


	  public static void main(String[] args)
	  {
		   harshada1 A=new harshada1();
		   A.show();
      }
}
