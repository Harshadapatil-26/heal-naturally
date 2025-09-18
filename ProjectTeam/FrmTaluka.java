import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmTaluka extends JFrame implements ActionListener
{
     JLabel lblTalukaID,lblTalukaName;
     JTextField txtTalukaID,txtTalukaName;
     JComboBox cmbCountry,cmbState,cmbDistrict;
     JButton BTInsert;
     int vCountryID=0;
     int vStateID=0;
     int vDistrictID=0;
     int x=20;
     int h=30;
     int gap=20;
     public FrmTaluka()
     {
           setSize(500,500);
     	   setLocation(100,100);
	       setTitle("Taluka Information");
	       setLayout(null);

           x=x+h+gap;
	       lblTalukaID=new JLabel("TalukaID ");
           lblTalukaID.setBounds(10,x,100,h);
           add(lblTalukaID);

           txtTalukaID=new JTextField("0");
	       txtTalukaID.setBounds(120,x,200,h);
           add(txtTalukaID);

           x=x+h+gap;
           lblTalukaName=new JLabel("TalukaName ");
	       lblTalukaName.setBounds(10,x,100,h);
	       add(lblTalukaName);

	  	   txtTalukaName=new JTextField();
	       txtTalukaName.setBounds(120,x,200,h);
           add(txtTalukaName);

           x=x+h+gap;
           cmbCountry=new JComboBox();
           cmbCountry.setBounds(120,x,200,h);
		   add(cmbCountry);

           x=x+h+gap;
	       cmbState=new JComboBox();
	       cmbState.setBounds(120,x,200,h);
		   add(cmbState);

           x=x+h+gap;
	       cmbDistrict=new JComboBox();
	       cmbDistrict.setBounds(120,x,200,h);
		   add(cmbDistrict);

           x=x+h+gap;
		   BTInsert=new JButton("Insert");
		   BTInsert.setBounds(80,x,100,h);
		   add(BTInsert);

		   BTInsert.addActionListener(this);
		   addCountryRecord(cmbCountry);
		 //  addStateRecord(cmbState);
		   //addDistrictRecord(cmbDistrict);
		 //  cmbCountry.addActionListener(this);
		 //  cmbState.addActionListener(this);
		 //  cmbDistrict.addActionListener(this);
       }
       public void actionPerformed(ActionEvent ae)
       {
		   ClsTaluka temp=readUI();
           if(ae.getSource()== BTInsert)
           {
       	        ClsTaluka.addNewTaluka(temp);
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
				   addStateRecord(cmbState);
				   //addStateRecord(cmbState);
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
				// addDistrictRecord(cmbDistrict,vStateID);
				   String item=(String)cmbState.getSelectedItem();
				   vStateID=ClsState.getStateIDFromStateName(item);
				   addDistrictRecord(cmbDistrict);
				   JOptionPane.showMessageDialog(this,"StateID"+vStateID);


		   	  }
		   }
		   else if(ae.getSource()==cmbDistrict)
		   {
			   if(cmbDistrict.getSelectedIndex()==0)
			   {
				   JOptionPane.showMessageDialog(this,"Please Select District");
			   }
			   else
			   {

				   String item=(String)cmbDistrict.getSelectedItem();
				   vDistrictID=ClsDistrict.getDistrictIDFromDistrictName(item);
				  // addDistrictRecord(cmbDistrict,vDistrictID);
				   JOptionPane.showMessageDialog(this,"DistrictID"+vDistrictID);
			   }
		   }
       }
       ClsTaluka readUI()
	   {
		   ClsTaluka temp=new ClsTaluka();
		   temp.setTalukaID(Integer.parseInt(txtTalukaID.getText()));
		   temp.setTalukaName(txtTalukaName.getText());

		   temp.setCountryID(vCountryID);
		   temp.setStateID(vStateID);
		   temp.setDistrictID(vDistrictID);
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
	   	   ClsState.addStateRecord(temp,vCountryID);
	   	   temp.addActionListener(this);
	   }
	   void addDistrictRecord(JComboBox temp)
	   {
	   	   temp.removeActionListener(this);
	   	   ClsDistrict.addDistrictRecord(temp,vStateID);
	   	   temp.addActionListener(this);
	   }////////
	   void addStateRecord(JComboBox temp,int mCountryID)
	  {
	      temp.removeActionListener(this);
	      ClsState.addStateRecord(temp,mCountryID);
	      temp.addActionListener(this);
	   }
	   void addDistrictRecord(JComboBox temp,int mStateID)
	   {
		   temp.removeActionListener(this);
		   ClsDistrict.addDistrictRecord(temp,mStateID);
		   temp.addActionListener(this);
	   }
	   //////////////////
       public static void main(String args[])
       {
           FrmTaluka A=new FrmTaluka();
           A.show();
       }

 }


















