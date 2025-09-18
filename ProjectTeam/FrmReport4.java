import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ReportDesign.*;
public class FrmReport4 extends JFrame
{

      RPTDesign4 screen1;
     public FrmReport4()
     {
             setLayout(null);
             setSize(1920,1080);
             setTitle("Menu ");

             screen1=new RPTDesign4();
             screen1.setBounds(1,1,1920,1080);
             add(screen1);

      }
      public static void main(String[] args)
      {
           FrmReport4 A=new FrmReport4();
           A.show();
       }
}

















