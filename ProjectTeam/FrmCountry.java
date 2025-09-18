import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmCountry extends JFrame implements ActionListener
{
     JLabel lblCountryID,lblCountryName;
     JTextField txtCountryID,txtCountryName;
     JButton BTInsert;
     FrmCountry()
     {
           setSize(500,500);
     	   setLocation(100,100);
	       setTitle("Country Information");
	       setLayout(null);

	       lblCountryID=new JLabel("CountryID ");
           lblCountryID.setBounds(10,20,100,30);
           add(lblCountryID);

           txtCountryID=new JTextField();
	       txtCountryID.setBounds(120,20,200,30);
           add(txtCountryID);

           lblCountryName=new JLabel("CountryName ");
	       lblCountryName.setBounds(10,70,100,30);
	       add(lblCountryName);

	  	   txtCountryName=new JTextField();
	       txtCountryName.setBounds(120,70,200,30);
           add(txtCountryName);

		  BTInsert=new JButton("Insert");
		  BTInsert.setBounds(80,120,100,30);
		  add(BTInsert);

		  BTInsert.addActionListener(this);
      }
       public void actionPerformed(ActionEvent ae)
      {
           if(ae.getSource()==BTInsert)
           {
       	        ClsCountry temp=readUI();
       	        ClsCountry.addNewCountry(temp);

	       }
	       readUI();
       }
       ClsCountry readUI()
	   {
		   ClsCountry temp=new ClsCountry();
		   temp.setCountryID(Integer.parseInt(txtCountryID.getText()));
		   temp.setCountryName(txtCountryName.getText());
		   return(temp);
       }
       public static void main(String args[])
       {
           FrmCountry A=new FrmCountry();
           A.show();
       }

 }












