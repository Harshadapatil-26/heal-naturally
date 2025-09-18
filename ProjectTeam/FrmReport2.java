import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ReportDesign.*;
public class FrmReport2 extends JFrame
{

      RPTDesign2 screen1;
     public FrmReport2()
     {
             setLayout(null);
             setSize(1920,1080);
             setTitle("Menu ");

             screen1=new RPTDesign2();
             screen1.setBounds(1,1,1920,1080);
             add(screen1);

      }
      public static void main(String[] args)
      {
           FrmReport2 A=new FrmReport2();
           A.show();
       }
}

















