import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ComboNewspaper extends JFrame implements ActionListener
{
     JComboBox cmbNewsPaper;
     JButton BTRead;
     JLabel lblnewspaper;
     ComboNewspaper()
     {
           setSize(500,300);
           setLocation(100,100);
           setTitle("Read NewsPaper");
           setLayout(null);


           cmbNewsPaper=new JComboBox();
           cmbNewsPaper.setBounds(120,20,150,30);
           add(cmbNewsPaper);

           BTRead=new JButton("READ");
           BTRead.setBounds(100,100,100,30);
           add(BTRead);

           BTRead.addActionListener(this);
       }
       public void actionPerformed(ActionEvent ae)
	   {
			if(ae.getSource()==BTRead)
		  {
			 addPaperRecord(cmbNewsPaper);
		   }
	   }
	    public void addPaperRecord(JComboBox temp)
	   	  {
	   	  			 ClsNewspaper.addPaperRecord(temp);
       }
     public static void main(String[] args)
     {
           ComboNewspaper A=new ComboNewspaper();
           A.show();
      }
}







