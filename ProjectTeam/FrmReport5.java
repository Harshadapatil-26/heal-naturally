import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ReportDesign.*;
public class FrmReport5 extends JFrame
{

      RPTDesign5 screen1;

     public FrmReport5()
     {
		 setLayout(null);
		 setSize(1920,1080);
		 setTitle("Menu ");

		 screen1=new RPTDesign5();
		 screen1.setBounds(1,1,1920,1080);
		 add(screen1);

	 }
     public static void main(String[] args)
     {
	    FrmReport5 A=new FrmReport5();
	    A.show();
     }
}

















