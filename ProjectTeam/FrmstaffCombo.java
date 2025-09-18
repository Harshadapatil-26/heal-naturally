import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class FrmstaffCombo extends JFrame implements ActionListener
{
     JComboBox cmbName;
     JButton BTNRead;
     FrmstaffCombo()
     {
          setSize(300,300);
          setLocation(100,100);
          setTitle("Display Names");
          setLayout(null);

          cmbName=new JComboBox();
          cmbName.setBounds(50,50,200,30);
          add(cmbName);

          BTNRead=new JButton("Read");
          BTNRead.setBounds(100,100,100,40);
          add(BTNRead);

         BTNRead.addActionListener(this);
      }
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getSource()==BTNRead)
	      {
	  		 addStaffRecord(cmbName);
	  	   }
	   }
	  public void addStaffRecord(JComboBox temp)
	  {
	  			 ClsStaffCombo.addStaffRecord(temp);
       }
      public static void main(String args[])
      {
            FrmstaffCombo A=new FrmstaffCombo();
            A.show();
      }
 }




