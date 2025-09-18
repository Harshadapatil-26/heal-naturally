import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
public class Displayname extends JFrame implements ActionListener
{
        JLabel lblCountry,lblState,lblDistrict,lblTaluka;
        JComboBox cmbCountry,cmbState,cmbDistrict,cmbTaluka;
        JButton BTCountry,BTState,BTDistrict,BTTaluka;
        Displayname()
        {
              setSize(500,500);
              setLocation(100,100);
              setTitle("Displaying name");
              setLayout(null);

              lblCountry=new JLabel("Country");
              lblCountry.setBounds(50,50,100,30);
              add(lblCountry);

              cmbCountry=new JComboBox();
              cmbCountry.setBounds(160,50,150,30);
              add(cmbCountry);

              BTCountry=new JButton("Read");
              BTCountry.setBounds(320,50,100,30);
              add(BTCountry);

              lblState=new JLabel("State");
	      lblState.setBounds(50,100,100,30);
	      add(lblState);

	      cmbState=new JComboBox();
	      cmbState.setBounds(160,100,150,30);
	      add(cmbState);

	      BTState=new JButton("Read");
	      BTState.setBounds(320,100,100,30);
              add(BTState);

              lblDistrict=new JLabel("District");
	      lblDistrict.setBounds(50,150,100,30);
	      add(lblDistrict);

	      cmbDistrict=new JComboBox();
	      cmbDistrict.setBounds(160,150,150,30);
	      add(cmbDistrict);

	      BTDistrict=new JButton("Read");
	      BTDistrict.setBounds(320,150,100,30);
              add(BTDistrict);

              lblTaluka=new JLabel("Taluka");
	      lblTaluka.setBounds(50,200,100,30);
	      add(lblTaluka);

	      cmbTaluka=new JComboBox();
	      cmbTaluka.setBounds(160,200,150,30);
	      add(cmbTaluka);

	      BTTaluka=new JButton("Read");
	      BTTaluka.setBounds(320,200,100,30);
              add(BTTaluka);

              BTCountry.addActionListener(this);
              BTState.addActionListener(this);
              BTDistrict.addActionListener(this);
              BTTaluka.addActionListener(this);

         }
         public void actionPerformed(ActionEvent ae)
         {
			 if(ae.getSource()==BTCountry)
			 {
				 addCountryRecord(cmbCountry);
			 }
			 if(ae.getSource()==BTState)
			 {
				 addStateRecord(cmbState);
			 }
			 if(ae.getSource()==BTDistrict)
			 {
				 addDistrictRecord(cmbDistrict);
			 }
			 if(ae.getSource()==BTTaluka)
			 {
				 addTalukaRecord(cmbTaluka);
			 }
	     }
	     public void addCountryRecord(JComboBox temp)
	     {
			 ClsCountry.addCountryRecord(temp);
		 }
		 public void addStateRecord(JComboBox temp)
		 {
		 	 ClsState.addStateRecord(temp);
		 }
		 public void addDistrictRecord(JComboBox temp)
		 {
		 	 ClsDistrict.addDistrictRecord(temp);
		 }
		 public void addTalukaRecord(JComboBox temp)
		 {
		 	 ClsTaluka.addTalukaRecord(temp);
		 }
         public static void main(String args[])
         {
                  Displayname A=new Displayname();
                  A.show();
          }
 }




