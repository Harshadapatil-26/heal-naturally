import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import MyDesigns.*;
public class FrmMenu1 extends JFrame
{

      UIDesign1 screen1;

      JPanel myUI;
      JLabel lblFlowerID,lblFlowerName;
      JTextField txtFlowerID,txtFlowerName;
     public FrmMenu1()
     {
             setLayout(null);
             setSize(1920,1080);
             setTitle("Menu ");

             screen1=new UIDesign1();
             add(screen1);

             myUI=screen1.getCenterPanel();
             myUI.setLayout(null);

             lblFlowerID=new JLabel("Flower ID : ");
             lblFlowerID.setBounds(10,10,150,30);
             lblFlowerID.setFont(new Font("Cambria",Font.BOLD,20));
             myUI.add(lblFlowerID);

             txtFlowerID=new JTextField("1");
             txtFlowerID.setBounds(170,10,100,30);
             txtFlowerID.setFont(new Font("Cambria",Font.BOLD,20));
             myUI.add(txtFlowerID);

             lblFlowerName=new JLabel("Flower Name : ");
             lblFlowerName.setBounds(10,50,150,30);
             lblFlowerName.setFont(new Font("Cambria",Font.BOLD,20));
             myUI.add(lblFlowerName);

             txtFlowerName=new JTextField();
             txtFlowerName.setBounds(170,50,100,30);
             txtFlowerName.setFont(new Font("Cambria",Font.BOLD,20));
             myUI.add(txtFlowerName);


      }
      public static void main(String[] args)
      {
           FrmMenu1 A=new FrmMenu1();
           A.show();
       }
}

















