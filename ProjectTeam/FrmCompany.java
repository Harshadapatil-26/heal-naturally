import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmCompany extends JFrame implements ActionListener
{
      JLabel LBLHeading,LBLCompanyID,LBLCompanyNm,LBLHeadOffice,LBLeMail,LBLWebpage,LBLFaceBookID,LBLTwitterID,LBLInstaID,LBLFaxNo,LBLTollFree,LBLContact,LBLOwnerName,LBLEstablishYear;
      JTextField TXTCompanyID,TXTCompanyNm,TXTHeadOffice,TXTeMail,TXTWebpage,TXTFaceBookID,TXTTwitterID,TXTInstaID,TXTFaxNo,TXTTollFree,TXTContact,TXTOwnerName,TXTEstablishYear;
      JButton BTNew,BTSave;
      JPanel PNLHeading,PNLInfo,PNLButton;
      FrmCompany()
      {
           setSize(520,800);
	   setLocation(100,100);
	   setTitle("FrmStaff");
	   getContentPane().setBackground(Color.black);
           setLayout(null);

           PNLHeading=new JPanel();
           PNLHeading.setLayout(null);
           PNLHeading.setBounds(20,10,460,50);
           add(PNLHeading);

           LBLHeading=new JLabel("Company Details");
           LBLHeading.setFont(new Font("Georgia",Font.BOLD,30));
           LBLHeading.setBounds(110,10,460,30);
           PNLHeading.add(LBLHeading);

           PNLInfo=new JPanel();
           PNLInfo.setLayout(null);
           PNLInfo.setBackground(Color.magenta);
         //  PNLInfo.setFont(new Font("Verdana",Font.ITALIC,10));
           PNLInfo.setBounds(20,70,460,550);
           add(PNLInfo);
           LBLCompanyID=new JLabel("CompanyID");
           LBLCompanyID.setBounds(20,20,100,30);
           PNLInfo.add(LBLCompanyID);

           TXTCompanyID=new JTextField();
           TXTCompanyID.setBounds(130,20,100,30);
           PNLInfo.add(TXTCompanyID);

           LBLCompanyNm=new JLabel("Company Name");
           LBLCompanyNm.setBounds(20,60,100,30);
           PNLInfo.add(LBLCompanyNm);

           TXTCompanyNm=new JTextField();
           TXTCompanyNm.setBounds(130,60,300,30);
           PNLInfo.add(TXTCompanyNm);

           LBLHeadOffice=new JLabel("HeadOffice");
           LBLHeadOffice.setBounds(20,100,300,30);
           PNLInfo.add(LBLHeadOffice);

           TXTHeadOffice=new JTextField();
           TXTHeadOffice.setBounds(130,100,300,30);
           PNLInfo.add(TXTHeadOffice);

           LBLeMail=new JLabel("e-Mail ID");
           LBLeMail.setBounds(20,140,100,30);
           PNLInfo.add(LBLeMail);

           TXTeMail=new JTextField();
           TXTeMail.setBounds(130,140,300,30);
           PNLInfo.add(TXTeMail);

           LBLWebpage=new JLabel("WebPage");
           LBLWebpage.setBounds(20,180,100,30);
           PNLInfo.add(LBLWebpage);

           TXTWebpage=new JTextField();
           TXTWebpage.setBounds(130,180,300,30);
           PNLInfo.add(TXTWebpage);

           LBLFaceBookID=new JLabel("Facebook ID");
           LBLFaceBookID.setBounds(20,220,100,30);
           PNLInfo.add(LBLFaceBookID);

           TXTFaceBookID=new JTextField();
           TXTFaceBookID.setBounds(130,220,300,30);
           PNLInfo.add(TXTFaceBookID);

           LBLTwitterID=new JLabel("Twitter ID");
           LBLTwitterID.setBounds(20,260,100,30);
           PNLInfo.add(LBLTwitterID);

           TXTTwitterID=new JTextField();
           TXTTwitterID.setBounds(130,260,300,30);
           PNLInfo.add(TXTTwitterID);

           LBLInstaID=new JLabel("InstagramID");
           LBLInstaID.setBounds(20,300,100,30);
           PNLInfo.add(LBLInstaID);

           TXTInstaID=new JTextField();
           TXTInstaID.setBounds(130,300,300,30);
           PNLInfo.add(TXTInstaID);

           LBLFaxNo=new JLabel("Fax No");
           LBLFaxNo.setBounds(20,340,100,30);
           PNLInfo.add(LBLFaxNo);

           TXTFaxNo=new JTextField();
           TXTFaxNo.setBounds(130,340,300,30);
           PNLInfo.add(TXTFaxNo);

           LBLTollFree=new JLabel("TollFree Number");
           LBLTollFree.setBounds(20,380,100,30);
           PNLInfo.add(LBLTollFree);

           TXTTollFree=new JTextField();
           TXTTollFree.setBounds(130,380,300,30);
           PNLInfo.add(TXTTollFree);

           LBLContact=new JLabel("Contact No");
           LBLContact.setBounds(20,420,100,30);
           PNLInfo.add(LBLContact);

           TXTContact=new JTextField();
           TXTContact.setBounds(130,420,300,30);
           PNLInfo.add(TXTContact);

           LBLOwnerName=new JLabel("OwnerName");
           LBLOwnerName.setBounds(20,460,100,30);
           PNLInfo.add(LBLOwnerName);

           TXTOwnerName=new JTextField();
           TXTOwnerName.setBounds(130,460,300,30);
           PNLInfo.add(TXTOwnerName);

           LBLEstablishYear=new JLabel("Established Year");
           LBLEstablishYear.setBounds(20,500,100,30);
           PNLInfo.add(LBLEstablishYear);

           TXTEstablishYear=new JTextField();
           TXTEstablishYear.setBounds(130,500,100,30);
           PNLInfo.add(TXTEstablishYear);

           PNLButton=new JPanel();
           PNLButton.setLayout(null);
           PNLButton.setBounds(20,630,460,100);
           add(PNLButton);

           BTNew=new JButton("New");
           BTNew.setBounds(50,25,100,50);
           PNLButton.add(BTNew);
           BTNew.addActionListener(this);

           BTSave=new JButton("Save");
           BTSave.setBounds(160,25,100,50);
           PNLButton.add(BTSave);
           BTSave.addActionListener(this);

      }
      public void actionPerformed(ActionEvent ae)
      {
		  if(ae.getSource()==BTNew)
		  {
			  TXTCompanyID.setText(" ");
			  TXTCompanyNm.setText(" ");
			  TXTHeadOffice.setText(" ");
			  TXTeMail.setText(" ");
			  TXTWebpage.setText(" ");
			  TXTFaceBookID.setText(" ");
			  TXTTwitterID.setText(" ");
			  TXTInstaID.setText(" ");
			  TXTFaxNo.setText(" ");
			  TXTTollFree.setText(" ");
			  TXTContact.setText(" ");
			  TXTOwnerName.setText(" ");
			  TXTEstablishYear.setText(" ");
		   }
	   }
      public static void main(String args[])
      {
           FrmCompany A=new FrmCompany();
           A.show();
       }
}

