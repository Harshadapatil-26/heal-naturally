import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmState extends JFrame implements ActionListener
{
     JLabel lblStateID,lblStateName;
     JTextField txtStateID,txtStateName;
     JComboBox cmbCountry;
     JButton BTInsert;
     int vCountryID=0;
     int x=20;
     int h=30;
     int gap=20;
     public FrmState()
     {
           setSize(500,500);
     	   setLocation(100,100);
	       setTitle("State Information");
	       setLayout(null);

           x=x+h+gap;
	       lblStateID=new JLabel("StateID ");
           lblStateID.setBounds(10,x,100,h);
           add(lblStateID);

           txtStateID=new JTextField();
	       txtStateID.setBounds(120,x,200,h);
           add(txtStateID);

           x=x+h+gap;
           lblStateName=new JLabel("StateName ");
	       lblStateName.setBounds(10,x,100,h);
	       add(lblStateName);

	  	   txtStateName=new JTextField();
	       txtStateName.setBounds(120,x,200,h);
           add(txtStateName);

           x=x+h+gap;
           cmbCountry=new JComboBox();
           cmbCountry.setBounds(120,x,200,h);
		   add(cmbCountry);

            x=x+h+gap;
		  BTInsert=new JButton("Insert");
		  BTInsert.setBounds(80,x,100,h);
		  add(BTInsert);

		  BTInsert.addActionListener(this);
		  addCountryRecord(cmbCountry);
		  cmbCountry.addActionListener(this);
      }
       public void actionPerformed(ActionEvent ae)
      {
		 ClsState temp=readUI();
           if(ae.getSource()== BTInsert)
           {
       	        ClsState.addNewState(temp);
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
			   }
		   }
		   //////////////// to select specific data
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
		   				   addCountryRecord(cmbCountry);
		   				   JOptionPane.showMessageDialog(this,"CountryID"+vCountryID);
			   }
		   }
		   /////////////////
       }
       ClsState readUI()
	   {
		   ClsState temp=new ClsState();
		   temp.setStateID(Integer.parseInt(txtStateID.getText()));
		   temp.setStateName(txtStateName.getText());

		   temp.setCountryID(vCountryID);
		   return(temp);
       }
       void addCountryRecord(JComboBox temp)
       {
		   temp.removeActionListener(this);
		   ClsCountry.addCountryRecord(temp);
		   temp.addActionListener(this);
	   }
       public static void main(String args[])
       {
           FrmState A=new FrmState();
           A.show();
       }
 }












