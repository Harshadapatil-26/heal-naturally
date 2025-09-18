import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import MyDesigns.*;
public class FrmOwner extends JFrame implements ActionListener
{

     UIDesignCountrynew screen1;

     JPanel myUI;
     JLabel lblOwnerID,lblOwnerName,lblemail,lblGender,lblMarried,lblAge;
     JTextField txtOwnerID,txtOwnerName,txtemail,txtAge;
     JButton BtnSave,BtnView,BtnDelete;
     ButtonGroup G1,G2;
     JRadioButton rbMale,rbFemale,rbMarried,rbUnmarried;
     JComboBox cmb1;
     public FrmOwner()
     {
		 setLayout(null);
		 setSize(1920,1080);
		 setTitle("Menu ");

		 screen1=new UIDesignCountrynew();
		 add(screen1);

		 myUI=screen1.getCenterPanel();
		 screen1.setTopHeading("Owner Management");
		 screen1.setSubTopHeading("Owner");
		 screen1.setBottomHeading("Harshada Patil");


		 lblOwnerID=new JLabel("Owner ID : ");
		 lblOwnerID.setBounds(10,10,150,30);
		 lblOwnerID.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblOwnerID);

		 txtOwnerID=new JTextField("1");
		 txtOwnerID.setBounds(170,10,150,30);
		 txtOwnerID.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(txtOwnerID);

		 lblOwnerName=new JLabel("Owner Name : ");
		 lblOwnerName.setBounds(10,50,150,30);
		 lblOwnerName.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblOwnerName);

		 txtOwnerName=new JTextField();
		 txtOwnerName.setBounds(170,50,309,30);
		 txtOwnerName.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(txtOwnerName);

		 lblemail=new JLabel("Email : ");
		 lblemail.setBounds(10,90,150,30);
		 lblemail.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblemail);

		 txtemail=new JTextField(" @gmail.com");
		 txtemail.setBounds(170,90,309,30);
		 txtemail.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(txtemail);

		 lblGender=new JLabel("Gender :");
		 lblGender.setBounds(10,130,150,30);
		 lblGender.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblGender);

         G1=new ButtonGroup();
         rbMale=new JRadioButton("Male");
         rbMale.setBounds(170,130,150,30);
         rbMale.setFont(new Font("Cambria",Font.BOLD,20));
         G1.add(rbMale);
         myUI.add(rbMale);

         rbFemale=new JRadioButton("Female");
         rbFemale.setBounds(330,130,150,30);
         rbFemale.setFont(new Font("Cambria",Font.BOLD,20));
         G1.add(rbFemale);
         myUI.add(rbFemale);

		 lblMarried=new JLabel("Married Status :");
		 lblMarried.setBounds(10,170,150,30);
		 lblMarried.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblMarried);

         G2=new ButtonGroup();
         rbMarried=new JRadioButton("Married");
         rbMarried.setBounds(170,170,150,30);
         rbMarried.setFont(new Font("Cambria",Font.BOLD,20));
         G2.add(rbMarried);
         myUI.add(rbMarried);

         rbUnmarried=new JRadioButton("Unmarried");
         rbUnmarried.setBounds(330,170,150,30);
         rbUnmarried.setFont(new Font("Cambria",Font.BOLD,20));
         G2.add(rbUnmarried);
         myUI.add(rbUnmarried);

		 lblAge=new JLabel("Age :");
		 lblAge.setBounds(10,210,150,30);
		 lblAge.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblAge);

		 txtAge=new JTextField();
		 txtAge.setBounds(170,210,150,30);
		 txtAge.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(txtAge);



        BtnSave=screen1.getSaveButton();
         BtnSave.addActionListener(this);
         BtnView=screen1.getViewButton();
         BtnView.addActionListener(this);
         BtnDelete=screen1.getDeleteButton();
         BtnDelete.addActionListener(this);
         cmb1=screen1.getcmb1();
         cmb1.addActionListener(this);

      }
	   public void actionPerformed(ActionEvent ae)
	  {
		  if(ae.getSource()==BtnSave)
		  {
			  ClsOwner temp=readUI();
			  ClsOwner.addNewOwner(temp);
			  JOptionPane.showMessageDialog(this,"Record Inserted Sucessfully");
			  readUI();
		  }
		  else if(ae.getSource()==BtnView)
		  {
			  addOwnerRecord(cmb1);


		  }
		  else if(ae.getSource()==BtnDelete)
		  {
			  ClsOwner temp=readUI();
			  ClsOwner.DeleteOwner(temp);
			  JOptionPane.showMessageDialog(this,"Record Deleted Sucessfully");
		  }
	/*	  else if(ae.getSource()==cmb1)
		  {
			  String x=(String)cmb1.getSelectedItem();
		      int code=ClsOwner.getOwnerIDFromOwnerName(x);
			  ClsOwner temp=ClsOwner.getOwnerInfo(code);
			  writeUI(temp);
		  }*/
	}
	public void addOwnerRecord(JComboBox temp)
    {
		ClsOwner.addOwnerRecord(temp);
    }
	ClsOwner readUI()
	{
	   ClsOwner temp=new ClsOwner();
	   temp.setOwnerID(Integer.parseInt(txtOwnerID.getText()));
	   temp.setOwnerName(txtOwnerName.getText());
	   temp.setemail(txtemail.getText());
		 if(rbMale.isSelected())
		 {
			   temp.setGender(1);
		   }
		   else
		   {
			   temp.setGender(2);
		   }
		   if(rbMarried.isSelected())
		   {
			   temp.setMarried(1);
		   }
		   else
		   {
			   temp.setMarried(2);
		   }
        temp.setAge(Integer.parseInt(txtAge.getText()));
	   return(temp);
    }

    public static void main(String[] args)
    {
        FrmOwner A=new FrmOwner();
        A.show();
    }
}

















