import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class FrmStaffinfo extends JFrame implements ActionListener
{
     JLabel lblheading,lblstaffID,lblStaffName,lblGender,lblEducation,lblContact,lbleMail,lblBottom;
     JTextField txtID,txtName,txtEducation,txtContact,txteMail;
     ButtonGroup G;
     JRadioButton RBMale,RBFemale;
     JCheckBox CHKMarried;
     JButton BTSave,BTUpdate,BTDelete;
     JPanel PNLtop,PNLCenter,PNLButton,PNLBottom;
     FrmStaffinfo()
     {
		 setSize(590,570);
		 setLocation(100,100);
		 setTitle("FrmStaff info");
		 getContentPane().setBackground(Color.black);
		 setLayout(null);

		 PNLtop=new JPanel();
		 PNLtop.setBounds(10,10,550,80);
		 PNLtop.setLayout(null);
		 PNLtop.setBackground(Color.pink);
		 add(PNLtop);

		 lblheading=new JLabel("STAFF INFORMATION");
		 lblheading.setFont(new Font("Georgia",Font.BOLD,30));
		 lblheading.setBounds(100,25,400,30);
		 PNLtop.add(lblheading);

		 PNLCenter=new JPanel();
		 PNLCenter.setBounds(10,100,550,300);
		 PNLCenter.setLayout(null);
		 PNLCenter.setBackground(Color.pink);
		 add(PNLCenter);

		 lblstaffID=new JLabel("StaffID");
		 lblstaffID.setBounds(50,10,100,30);
		 lblstaffID.setFont(new Font("Georgia",Font.BOLD,20));
		 PNLCenter.add(lblstaffID);

		 txtID=new JTextField();
		 txtID.setBounds(200,10,100,30);
		 txtID.setFont(new Font("Georgia",Font.BOLD,20));
		 PNLCenter.add(txtID);

		 lblStaffName=new JLabel("Staff Name");
		 lblStaffName.setBounds(50,50,150,30);
		 lblStaffName.setFont(new Font("Georgia",Font.BOLD,20));
		 PNLCenter.add(lblStaffName);

         txtName=new JTextField();
         txtName.setBounds(200,50,300,30);
         txtName.setFont(new Font("Georgia",Font.BOLD,20));
         PNLCenter.add(txtName);

         lblGender=new JLabel("Gender");
         lblGender.setBounds(50,90,150,30);
         lblGender.setFont(new Font("Georgia",Font.BOLD,20));
         PNLCenter.add(lblGender);

         G=new ButtonGroup();


         RBMale=new JRadioButton("MALE");
         RBMale.setBounds(200,90,100,30);
         RBMale.setFont(new Font("Georgia",Font.BOLD,20));
         G.add(RBMale);
         PNLCenter.add(RBMale);

         RBFemale=new JRadioButton("FEMALE");
         RBFemale.setBounds(310,90,130,30);
         RBFemale.setFont(new Font("Georgia",Font.BOLD,20));
         G.add(RBFemale);
         PNLCenter.add(RBFemale);

         CHKMarried=new JCheckBox("I am Married");
         CHKMarried.setBounds(200,130,200,30);
		 CHKMarried.setFont(new Font("Georgia",Font.BOLD,20));
         PNLCenter.add(CHKMarried);

         lblEducation=new JLabel("Education");
         lblEducation.setBounds(50,170,150,30);
         lblEducation.setFont(new Font("Georgia",Font.BOLD,20));
         PNLCenter.add(lblEducation);

         txtEducation=new JTextField();
         txtEducation.setBounds(200,170,300,30);
         txtEducation.setFont(new Font("Georgia",Font.BOLD,20));
         PNLCenter.add(txtEducation);

         lblContact=new JLabel("Contact");
         lblContact.setBounds(50,210,150,30);
         lblContact.setFont(new Font("Georgia",Font.BOLD,20));
         PNLCenter.add(lblContact);

         txtContact=new JTextField();
		 txtContact.setBounds(200,210,200,30);
		 txtContact.setFont(new Font("Georgia",Font.BOLD,20));
         PNLCenter.add(txtContact);

         lbleMail=new JLabel("eMail");
		 lbleMail.setBounds(50,250,150,30);
		 lbleMail.setFont(new Font("Georgia",Font.BOLD,20));
         PNLCenter.add(lbleMail);

          txteMail=new JTextField();
		  txteMail.setBounds(200,250,200,30);
		  txteMail.setFont(new Font("Georgia",Font.BOLD,20));
          PNLCenter.add(txteMail);

          PNLButton=new JPanel();
          PNLButton.setBounds(10,410,550,100);
          PNLButton.setLayout(null);
		  PNLButton.setBackground(Color.pink);
		 add(PNLButton);

		  BTSave=new JButton("Save");
		  BTSave.setBounds(50,25,150,50);
		  BTSave.setFont(new Font("Georgia",Font.BOLD,20));
         PNLButton.add(BTSave);
         BTSave.addActionListener(this);

         BTUpdate=new JButton("Update");
		 BTUpdate.setBounds(200,25,150,50);
		 BTUpdate.setFont(new Font("Georgia",Font.BOLD,20));
		 PNLButton.add(BTUpdate);
         BTUpdate.addActionListener(this);

        BTDelete=new JButton("Delete");
		BTDelete.setBounds(350,25,150,50);
	    BTDelete.setFont(new Font("Georgia",Font.BOLD,20));
		PNLButton.add(BTDelete);
		BTDelete.addActionListener(this);

     }
     public void actionPerformed(ActionEvent ae)
     {
		 if(ae.getSource()==BTSave)
		 {
			 ClsStaff temp=readUI();
			 ClsStaff.addNewStaff(temp);
		 	 readUI();
		 }
		 if(ae.getSource()==BTUpdate)
		 {
			 ClsStaff temp=readUI();
			 ClsStaff.updateStaff(temp);
			 readUI();
		 }
		 if(ae.getSource()==BTDelete)
		 {
		 	 ClsStaff temp=readUI();
		 	 ClsStaff.deleteStaff(temp);
		 	 readUI();
		 }

	 }
	 ClsStaff readUI()
	 {
		 ClsStaff temp=new ClsStaff();
		 temp.setStaffID(Integer.parseInt(txtID.getText()));
		 temp.setStaffName(txtName.getText());
		 if(RBMale.isSelected())
		 {
			   temp.setGender(1);
		   }
		   else
		   {
			   temp.setGender(2);
		   }
		   if(CHKMarried.isSelected())
		   {
			   temp.setMarried(1);
		   }
		   else
		   {
			   temp.setMarried(2);
		   }
		   temp.setEducation(txtEducation.getText());
		   temp.setContact(txtContact.getText());
		   temp.seteMail(txteMail.getText());

		   return(temp);

	 }
     public static void main(String args[])
     {
		  FrmStaffinfo A=new FrmStaffinfo();
		  A.show();
	 }















}