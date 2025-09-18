import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmContent extends JFrame implements ActionListener
{
     JLabel lblContentID,lblContentName;
     JTextField txtContentID,txtContentName;
     JComboBox cmbRegionalLanguage,cmbMedia;
     JButton BTInsert;
     int vRegionalLanguageID=0;
     int vMediaID=0;
     int x=20;
     int h=30;
     int gap=20;
     public FrmContent()
     {
           setSize(500,500);
     	   setLocation(100,100);
	       setTitle("Content Information");
	       setLayout(null);

           x=x+h+gap;
	       lblContentID=new JLabel("ContentID ");
           lblContentID.setBounds(10,x,100,h);
           add(lblContentID);

           txtContentID=new JTextField();
	       txtContentID.setBounds(120,x,200,h);
           add(txtContentID);

           x=x+h+gap;
           lblContentName=new JLabel("ContentName ");
	       lblContentName.setBounds(10,x,100,h);
	       add(lblContentName);

	  	   txtContentName=new JTextField();
	       txtContentName.setBounds(120,x,200,h);
           add(txtContentName);

           x=x+h+gap;
           cmbRegionalLanguage=new JComboBox();
           cmbRegionalLanguage.setBounds(120,x,200,h);
		   add(cmbRegionalLanguage);

           x=x+h+gap;
		   cmbMedia=new JComboBox();
		   cmbMedia.setBounds(120,x,200,h);
		   add(cmbMedia);

           x=x+h+gap;
		   BTInsert=new JButton("Insert");
		   BTInsert.setBounds(80,x,100,h);
		   add(BTInsert);

		  BTInsert.addActionListener(this);
		  addRegionalLanguageRecord(cmbRegionalLanguage);
		  addMediaRecord(cmbMedia);
		  cmbRegionalLanguage.addActionListener(this);
		  cmbMedia.addActionListener(this);
       }
       public void actionPerformed(ActionEvent ae)
	   {
		   ClsContent temp=readUI();
		   if(ae.getSource()== BTInsert)
		   {
				ClsContent.addNewContent(temp);
		   }
		   else if(ae.getSource()==cmbRegionalLanguage)
		   {
			   if(cmbRegionalLanguage.getSelectedIndex()==0)
			   {
				   JOptionPane.showMessageDialog(this,"Please Select RegionalLanguage");
			   }
			   else
			   {
				   String item=(String)cmbRegionalLanguage.getSelectedItem();
				   vRegionalLanguageID=ClsRegionalLanguage.getRegionalLanguageIDFromRegionalLanguageName(item);
				   JOptionPane.showMessageDialog(this,"RegionalLanguageID"+vRegionalLanguageID);
				// addMediaRecord(cmbMedia,vRegionalLanguageID);
			   }
		   }
		   else if(ae.getSource()==cmbMedia)
		   {
			   if(cmbMedia.getSelectedIndex()==0)
			   {
				   JOptionPane.showMessageDialog(this,"Please Select Media");
			   }
			   else
			   {
				   String item=(String)cmbMedia.getSelectedItem();
				   vMediaID=ClsMedia.getMediaIDFromMediaName(item);
				// addMediaRecord(cmbMedia,vMediaID);
				   JOptionPane.showMessageDialog(this,"MediaID"+vMediaID);

			   }
		   }
	   }
       ClsContent readUI()
	   {
		   ClsContent temp=new ClsContent();
		   temp.setContentID(Integer.parseInt(txtContentID.getText()));
		   temp.setContentName(txtContentName.getText());

		   temp.setRegionalLanguageID(vRegionalLanguageID);
		   temp.setMediaID(vMediaID);
		   return(temp);
	   }
	   void addRegionalLanguageRecord(JComboBox temp)
	   {
		   temp.removeActionListener(this);
		   ClsRegionalLanguage.addRegionalLanguageRecord(temp);
		   temp.addActionListener(this);
	   }
	   void addMediaRecord(JComboBox temp)
	   {
		   temp.removeActionListener(this);
		   ClsMedia.addMediaRecord(temp);
		   temp.addActionListener(this);
	   }

	 /////////////////
	 /*  void addMediaRecord(JComboBox temp)
       {
		   temp.removeActionListener(this);
		   ClsMedia.addMediaRecord(temp);
		   temp.addActionListener(this);
	   }*/
	   ///////////////
	   public static void main(String args[])
	   {
		   FrmContent A=new FrmContent();
		   A.show();
	   }
 }




















