import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmDistrict extends JFrame implements ActionListener
{
     JLabel lblDistrictID,lblDistrictName;
     JTextField txtDistrictID,txtDistrictName;
     JComboBox cmbCountry,cmbState;
     JButton BTInsert;
     int vCountryID=0;
     int vStateID=0;
     int x=20;
     int h=30;
     int gap=20;
     public FrmDistrict()
     {
           setSize(500,500);
     	   setLocation(100,100);
	       setTitle("District Information");
	       setLayout(null);

           x=x+h+gap;
	       lblDistrictID=new JLabel("DistrictID ");
           lblDistrictID.setBounds(10,x,100,h);
           add(lblDistrictID);

           txtDistrictID=new JTextField();
	       txtDistrictID.setBounds(120,x,200,h);
           add(txtDistrictID);

           x=x+h+gap;
           lblDistrictName=new JLabel("DistrictName ");
	       lblDistrictName.setBounds(10,x,100,h);
	       add(lblDistrictName);

	  	   txtDistrictName=new JTextField();
	       txtDistrictName.setBounds(120,x,200,h);
           add(txtDistrictName);

           x=x+h+gap;
           cmbCountry=new JComboBox();
           cmbCountry.setBounds(120,x,200,h);
		   add(cmbCountry);

            x=x+h+gap;
	               cmbState=new JComboBox();
	               cmbState.setBounds(120,x,200,h);
		   add(cmbState);

            x=x+h+gap;
		  BTInsert=new JButton("Insert");
		  BTInsert.setBounds(80,x,100,h);
		  add(BTInsert);

		  BTInsert.addActionListener(this);
		  addCountryRecord(cmbCountry);
		 // addStateRecord(cmbState);
		  cmbCountry.addActionListener(this);
		  cmbState.addActionListener(this);
      }
       public void actionPerformed(ActionEvent ae)
      {
		 ClsDistrict temp=readUI();
           if(ae.getSource()== BTInsert)
           {
       	        ClsDistrict.addNewDistrict(temp);
	       }
	       else if(ae.getSource()==cmbCountry)
		   	       {
		   			   if(cmbCountry.getSelectedIndex()==0)
		   			   {
		   				   JOptionPane.showMessageDialog(this,"Please Select Country");
		   			   }
		   			   else
		   			   {
		   				   String item=(String)cmbCountry.getSelectedItem();
		   				   vCountryID=ClsCountry.getCountryIDFromCountryName(item);
		   				   JOptionPane.showMessageDialog(this,"CountryID"+vCountryID);
		   				 //  addStateRecord(cmbState,vCountryID);
		   			   }
		   }
	       else if(ae.getSource()==cmbCountry)
	       {
			   if(cmbCountry.getSelectedIndex()==0)
			   {
				   JOptionPane.showMessageDialog(this,"Please Select Country");
			   }
			   else
			   {
				   String item=(String)cmbCountry.getSelectedItem();
				   vCountryID=ClsCountry.getCountryIDFromCountryName(item);
				   JOptionPane.showMessageDialog(this,"CountryID"+vCountryID);
				   addStateRecord(cmbState,vCountryID);
			   }
		   }
		   		   else if(ae.getSource()==cmbState)
		   		   	       {
		   		   			   if(cmbState.getSelectedIndex()==0)
		   		   			   {
		   		   				   JOptionPane.showMessageDialog(this,"Please Select State");
		   		   			   }
		   		   			   else
		   		   			   {
		   		   				   String item=(String)cmbState.getSelectedItem();
		   		   				   vStateID=ClsState.getStateIDFromStateName(item);
		   		   				//   addStateRecord(cmbState,vStateID);
		   		   				   JOptionPane.showMessageDialog(this,"StateID"+vStateID);

		   		   			   }
		   		   }

		   else if(ae.getSource()==cmbState)
		   	       {
		   			   if(cmbState.getSelectedIndex()==0)
		   			   {
		   				   JOptionPane.showMessageDialog(this,"Please Select State");
		   			   }
		   			   else
		   			   {
		   				   String item=(String)cmbState.getSelectedItem();
		   				   vStateID=ClsState.getStateIDFromStateName(item);
		   				   addStateRecord(cmbState,vStateID);
		   				   JOptionPane.showMessageDialog(this,"StateID"+vStateID);

		   			   }
		   }
       }

       ClsDistrict readUI()
	   {
		   ClsDistrict temp=new ClsDistrict();
		   temp.setDistrictID(Integer.parseInt(txtDistrictID.getText()));
		   temp.setDistrictName(txtDistrictName.getText());

		   temp.setCountryID(vCountryID);
		   temp.setStateID(vStateID);
		   return(temp);
       }
       void addCountryRecord(JComboBox temp)
       {
		   temp.removeActionListener(this);
		   ClsCountry.addCountryRecord(temp);
		   temp.addActionListener(this);
	   }
	   void addStateRecord(JComboBox temp)
	          {
	   		   temp.removeActionListener(this);
	   		   ClsState.addStateRecord(temp);
	   		   temp.addActionListener(this);
	   }

	   /////////////////
	   void addStateRecord(JComboBox temp,int mCountryID)
	   	          {
	   	   		   temp.removeActionListener(this);
	   	   		   ClsState.addStateRecord(temp,mCountryID);
	   	   		   temp.addActionListener(this);
	   }
	   ///////////////
       public static void main(String args[])
       {
           FrmDistrict A=new FrmDistrict();
           A.show();
       }
 }












