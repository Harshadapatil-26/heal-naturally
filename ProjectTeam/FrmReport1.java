import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ReportDesign.*;
public class FrmReport1 extends JFrame
{

      RPTDesign1 screen1;
     public FrmReport1()
     {
             setLayout(null);
             setSize(1920,1080);
             setTitle("Menu ");

             screen1=new RPTDesign1();
             screen1.setBounds(1,1,1920,1080);
             add(screen1);

      }
      public static void main(String[] args)
      {
           FrmReport1 A=new FrmReport1();
           A.show();
       }
}

















