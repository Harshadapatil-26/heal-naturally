import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import MyDesigns.*;
public class FrmStateNew extends JFrame
{

      UIDesignStatenew screen1;

      JPanel myUI;
      JLabel lblStateID,lblStateName;
      JTextField txtStateID,txtStateName;
     public FrmStateNew()
     {
             setLayout(null);
             setSize(1920,1080);
             setTitle("Menu ");

             screen1=new UIDesignStatenew();
             add(screen1);

             myUI=screen1.getCenterPanel();
             myUI.setLayout(null);

             lblStateID=new JLabel("State ID : ");
             lblStateID.setBounds(10,10,150,30);
             lblStateID.setFont(new Font("Cambria",Font.BOLD,20));
             myUI.add(lblStateID);

             txtStateID=new JTextField("1");
             txtStateID.setBounds(170,10,100,30);
             txtStateID.setFont(new Font("Cambria",Font.BOLD,20));
             myUI.add(txtStateID);

             lblStateName=new JLabel("State Name : ");
             lblStateName.setBounds(10,50,150,30);
             lblStateName.setFont(new Font("Cambria",Font.BOLD,20));
             myUI.add(lblStateName);

             txtStateName=new JTextField();
             txtStateName.setBounds(170,50,100,30);
             txtStateName.setFont(new Font("Cambria",Font.BOLD,20));
             myUI.add(txtStateName);


      }
      public static void main(String[] args)
      {
           FrmStateNew A=new FrmStateNew();
           A.show();
       }
}

















