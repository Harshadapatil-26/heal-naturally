import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import MyDesigns.*;
public class FrmMenu3 extends JFrame
{

      UIDesign3 screen1;

      JPanel myUI;
	  JLabel lblCountryID,lblCountryName;
      JTextField txtCountryID,txtCountryName;

     public FrmMenu3()
     {
		 setLayout(null);
		 setSize(1920,1080);
		 setTitle("Menu 3");

		 screen1=new UIDesign3();
		 add(screen1);
         myUI=screen1.getCenterPanel();
		 myUI.setLayout(null);

		 screen1.setTopHeading("Country Management");
		 screen1.setSubTopHeading("Country");
		 screen1.setBottomHeading("Harshada Patil");

		 lblCountryID=new JLabel("Country ID : ");
		 lblCountryID.setBounds(10,10,150,30);
		 lblCountryID.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblCountryID);

		 txtCountryID=new JTextField("1");
		 txtCountryID.setBounds(170,10,100,30);
		 txtCountryID.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(txtCountryID);

		 lblCountryName=new JLabel("Country Name : ");
		 lblCountryName.setBounds(10,50,150,30);
		 lblCountryName.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblCountryName);

		 txtCountryName=new JTextField();
		 txtCountryName.setBounds(170,50,100,30);
		 txtCountryName.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(txtCountryName);


      }
      public static void main(String[] args)
      {
           FrmMenu3 A=new FrmMenu3();
           A.show();
       }
}

















