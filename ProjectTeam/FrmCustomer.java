import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmCustomer extends JFrame implements ActionListener
{
     JLabel lblCustomerID,lblCustomerName;
     JTextField txtCustomerID,txtCustomerName;
     JComboBox cmbPlace;
     JButton BTInsert;
     int vPlaceID=0;
     int x=20;
     int h=30;
     int gap=20;
     public FrmCustomer()
     {
           setSize(500,500);
     	   setLocation(100,100);
	       setTitle("Customer Information");
	       setLayout(null);

           x=x+h+gap;
	       lblCustomerID=new JLabel("CustomerID ");
           lblCustomerID.setBounds(10,x,100,h);
           add(lblCustomerID);

           txtCustomerID=new JTextField();
	       txtCustomerID.setBounds(120,x,200,h);
           add(txtCustomerID);

           x=x+h+gap;
           lblCustomerName=new JLabel("CustomerName ");
	       lblCustomerName.setBounds(10,x,100,h);
	       add(lblCustomerName);

	  	   txtCustomerName=new JTextField();
	       txtCustomerName.setBounds(120,x,200,h);
           add(txtCustomerName);

           x=x+h+gap;
           cmbPlace=new JComboBox();
           cmbPlace.setBounds(120,x,200,h);
		   add(cmbPlace);

            x=x+h+gap;
		  BTInsert=new JButton("Insert");
		  BTInsert.setBounds(80,x,100,h);
		  add(BTInsert);

		  BTInsert.addActionListener(this);
		  addPlaceRecord(cmbPlace);
      }
       public void actionPerformed(ActionEvent ae)
      {
		 ClsCustomer temp=readUI();
           if(ae.getSource()== BTInsert)
           {
       	        ClsCustomer.addNewCustomer(temp);
	       }
	       else if(ae.getSource()==cmbPlace)
	       {
			   if(cmbPlace.getSelectedIndex()==0)
			   {
				   JOptionPane.showMessageDialog(this,"Please Select Place");
			   }
			   else
			   {
				   String item=(String)cmbPlace.getSelectedItem();
				   vPlaceID=ClsPlace.getPlaceIDFromPlaceName(item);
				   JOptionPane.showMessageDialog(this,"PlaceID"+vPlaceID);
			   }
		   }
       }
       ClsCustomer readUI()
	   {
		   ClsCustomer temp=new ClsCustomer();
		   temp.setCustomerID(Integer.parseInt(txtCustomerID.getText()));
		   temp.setCustomerName(txtCustomerName.getText());

		   temp.setPlaceID(vPlaceID);
		   return(temp);
       }
       void addPlaceRecord(JComboBox temp)
       {
		   temp.removeActionListener(this);
		   ClsPlace.addPlaceRecord(temp);
		   temp.addActionListener(this);
	   }
       public static void main(String args[])
       {
           FrmCustomer A=new FrmCustomer();
           A.show();
       }
 }












