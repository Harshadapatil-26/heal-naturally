import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmRegionalLanguage extends JFrame implements ActionListener
{
     JLabel lblRegionalLanguageID,lblRegionalLanguageName;
     JTextField txtRegionalLanguageID,txtRegionalLanguageName;
     JButton BTInsert;
     FrmRegionalLanguage()
     {
	   setSize(700,500);
	   setLocation(100,100);
	   setTitle("RegionalLanguage Information");
	   setLayout(null);

	   lblRegionalLanguageID=new JLabel("RegionalLanguageID ");
	   lblRegionalLanguageID.setBounds(10,20,200,30);
	   add(lblRegionalLanguageID);

	   txtRegionalLanguageID=new JTextField();
	   txtRegionalLanguageID.setBounds(220,20,200,30);
	   add(txtRegionalLanguageID);

	   lblRegionalLanguageName=new JLabel("RegionalLanguageName ");
	   lblRegionalLanguageName.setBounds(10,70,200,30);
	   add(lblRegionalLanguageName);

	   txtRegionalLanguageName=new JTextField();
	   txtRegionalLanguageName.setBounds(220,70,200,30);
	   add(txtRegionalLanguageName);

	   BTInsert=new JButton("Insert");
	   BTInsert.setBounds(80,120,100,30);
	   add(BTInsert);

	   BTInsert.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
	{
	  if(ae.getSource()==BTInsert)
	  {
		  ClsRegionalLanguage temp=readUI();
		  ClsRegionalLanguage.addNewRegionalLanguage(temp);
	  }
	  readUI();
    }
    ClsRegionalLanguage readUI()
	{
	   ClsRegionalLanguage temp=new ClsRegionalLanguage();
	   temp.setRegionalLanguageID(Integer.parseInt(txtRegionalLanguageID.getText()));
	   temp.setRegionalLanguageName(txtRegionalLanguageName.getText());
	   return(temp);
	 }
	 public static void main(String args[])
	 {
		  FrmRegionalLanguage A=new FrmRegionalLanguage();
		  A.show();
      }
}









