import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmVillage extends JFrame implements ActionListener
{
     JLabel lblVillageID,lblVillageName;
     JTextField txtVillageID,txtVillageName;
     JComboBox cmbCountry,cmbState,cmbDistrict,cmbTaluka,cmbVillage;
     JButton BTInsert;
     int vCountryID=0;
     int vStateID=0;
     int vDistrictID=0;
     int vTalukaID=0;
     int vVillageID=0;

     int x=5;
     int h=30;
     int gap=20;
     public FrmVillage()
     {

           setSize(500,500);
     	   setLocation(100,100);
	       setTitle("Village Information");
	       setLayout(null);

           x=x+h+gap;
	       lblVillageID=new JLabel("VillageID ");
           lblVillageID.setBounds(10,x,100,h);
           add(lblVillageID);

           txtVillageID=new JTextField();
	       txtVillageID.setBounds(120,x,200,h);
           add(txtVillageID);

           x=x+h+gap;
           lblVillageName=new JLabel("VillageName ");
	       lblVillageName.setBounds(10,x,100,h);
	       add(lblVillageName);

	  	   txtVillageName=new JTextField();
	       txtVillageName.setBounds(120,x,200,h);
           add(txtVillageName);

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
		   cmbTaluka=new JComboBox();
		   cmbTaluka.setBounds(120,x,200,h);
		   add(cmbTaluka);

		   x=x+h+gap;
		   cmbVillage=new JComboBox();
		   cmbVillage.setBounds(120,x,200,h);
		   add(cmbVillage);

          x=x+h+gap;
		  BTInsert=new JButton("Insert");
		  BTInsert.setBounds(150,x,100,h);
		  add(BTInsert);

		  BTInsert.addActionListener(this);
		  addCountryRecord(cmbCountry);
		  //addStateRecord(cmbState);
		//  addDistrictRecord(cmbDistrict);
       //   addTalukaRecord(cmbTaluka);
      // addVillageRecord(cmbVillage);

      }
       public void actionPerformed(ActionEvent ae)
      {
		 ClsVillage temp=readUI();
           if(ae.getSource()== BTInsert)
           {
       	        ClsVillage.addNewVillage(temp);
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
		   				   JOptionPane.showMessageDialog(this,"StateID"+vStateID);
		   				   addDistrictRecord(cmbDistrict);

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

		   				   JOptionPane.showMessageDialog(this,"DistrictID"+vDistrictID);
		   				   addTalukaRecord(cmbTaluka);
		   			   }
		   }

		  else if(ae.getSource()==cmbTaluka)
	      {
		   	  if(cmbTaluka.getSelectedIndex()==0)
		     {
		   	   JOptionPane.showMessageDialog(this,"Please Select Taluka");
		     }
		     else
		     {
		    	   String item=(String)cmbTaluka.getSelectedItem();
		   		   vTalukaID=ClsTaluka.getTalukaIDFromTalukaName(item);
		   		   JOptionPane.showMessageDialog(this,"TalukaID"+vTalukaID);
		   		   addVillageRecord(cmbVillage);
		   	  }
		  }
		  else if(ae.getSource()==cmbVillage)
		  	      {
		  		   	  if(cmbVillage.getSelectedIndex()==0)
		  		     {
		  		   	   JOptionPane.showMessageDialog(this,"Please Select Village");
		  		     }
		  		     else
		  		     {
		  		    	   String item=(String)cmbVillage.getSelectedItem();
		  		   		   vVillageID=ClsVillage.getVillageIDFromVillageName(item);
		  		   		   JOptionPane.showMessageDialog(this,"VillageID"+vVillageID);
		  		   	  }
		  }
       }
       ClsVillage readUI()
	   {
		   ClsVillage temp=new ClsVillage();
		   temp.setVillageID(Integer.parseInt(txtVillageID.getText()));
		   temp.setVillageName(txtVillageName.getText());

		   temp.setCountryID(vCountryID);
		   temp.setStateID(vStateID);
		   temp.setDistrictID(vDistrictID);
		   temp.setTalukaID(vTalukaID);
		   temp.setVillageID(vVillageID);
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
	   }
	   void addTalukaRecord(JComboBox temp)
	   {
	   	   temp.removeActionListener(this);
	   	   ClsTaluka.addTalukaRecord(temp,vDistrictID);
	   	   temp.addActionListener(this);
	   }
	   void addVillageRecord(JComboBox temp)
	   	   {
	   	   	   temp.removeActionListener(this);
	   	   	   ClsVillage.addVillageRecord(temp,vTalukaID);
	   	   	   temp.addActionListener(this);
	   }
	   /////////////////////
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
	   void addTalukaRecord(JComboBox temp,int mDistrictID)
	   {
		   temp.removeActionListener(this);
		   ClsTaluka.addTalukaRecord(temp,mDistrictID);
		   temp.addActionListener(this);
		}
		 void addVillageRecord(JComboBox temp,int mTalukaID)
		{
		   temp.removeActionListener(this);
		   ClsVillage.addVillageRecord(temp,mTalukaID);
		   temp.addActionListener(this);
		}
	   /////////////////////
       public static void main(String args[])
       {
           FrmVillage A=new FrmVillage();
           A.show();
       }

 }












