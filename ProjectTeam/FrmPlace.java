import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmPlace extends JFrame implements ActionListener
{
     JLabel lblPlaceID,lblPlaceName;
     JTextField txtPlaceID,txtPlaceName;
     JButton BTInsert;
     FrmPlace()
     {
           setSize(500,500);
     	   setLocation(100,100);
	       setTitle("Place Information");
	       setLayout(null);

	       lblPlaceID=new JLabel("PlaceID ");
           lblPlaceID.setBounds(10,20,100,30);
           add(lblPlaceID);

           txtPlaceID=new JTextField();
	       txtPlaceID.setBounds(120,20,200,30);
           add(txtPlaceID);

           lblPlaceName=new JLabel("PlaceName ");
	       lblPlaceName.setBounds(10,70,100,30);
	       add(lblPlaceName);

	  	   txtPlaceName=new JTextField();
	       txtPlaceName.setBounds(120,70,200,30);
           add(txtPlaceName);

		  BTInsert=new JButton("Insert");
		  BTInsert.setBounds(80,120,100,30);
		  add(BTInsert);

		  BTInsert.addActionListener(this);
      }
       public void actionPerformed(ActionEvent ae)
      {
           if(ae.getSource()==BTInsert)
           {
       	        ClsPlace temp=readUI();
       	        ClsPlace.addNewPlace(temp);

	       }
	       readUI();
       }
       ClsPlace readUI()
	   {
		   ClsPlace temp=new ClsPlace();
		   temp.setPlaceID(Integer.parseInt(txtPlaceID.getText()));
		   temp.setPlaceName(txtPlaceName.getText());
		   return(temp);
       }
       public static void main(String args[])
       {
           FrmPlace A=new FrmPlace();
           A.show();
       }
 }












