import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ReportDesign.*;
public class FrmReport3 extends JFrame
{

      RPTDesign3 screen1;
     public FrmReport3()
     {
             setLayout(null);
             setSize(1920,1080);
             setTitle("Menu ");

             screen1=new RPTDesign3();
             screen1.setBounds(1,1,1920,1080);
             add(screen1);

      }
      public static void main(String[] args)
      {
           FrmReport3 A=new FrmReport3();
           A.show();
       }
}

















