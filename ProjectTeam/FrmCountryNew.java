import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import MyDesigns.*;
public class FrmCountryNew extends JFrame implements ActionListener
{

     UIDesignCountrynew screen1;

     JPanel myUI;
     JLabel lblCountryID,lblCountryName;
     JTextField txtCountryID,txtCountryName;
     JButton BtnNew,BtnSave,BtnView,BtnDelete,BtnUpdate,BtnCancel;
     JComboBox cmb1;
     public FrmCountryNew()
     {
		 setLayout(null);
		 setSize(1920,1080);
		 setTitle("Menu ");

		 screen1=new UIDesignCountrynew();
		 add(screen1);

		 myUI=screen1.getCenterPanel();
		 screen1.setTopHeading("Country Management");
		 screen1.setSubTopHeading("Country");
		 screen1.setBottomHeading("Harshada Patil");


		 lblCountryID=new JLabel("Country ID : ");
		 lblCountryID.setBounds(10,10,150,30);
		 lblCountryID.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblCountryID);

		 txtCountryID=new JTextField("1");
		 txtCountryID.setBounds(170,10,100,30);
		 txtCountryID.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(txtCountryID);

		 lblCountryName=new JLabel("Country Name : ");
		 lblCountryName.setBounds(10,50,150,30);
		 lblCountryName.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(lblCountryName);

		 txtCountryName=new JTextField();
		 txtCountryName.setBounds(170,50,200,30);
		 txtCountryName.setFont(new Font("Cambria",Font.BOLD,20));
		 myUI.add(txtCountryName);

         BtnSave=screen1.getSaveButton();
         BtnSave.addActionListener(this);

         BtnView=screen1.getViewButton();
         BtnView.addActionListener(this);

         BtnDelete=screen1.getDeleteButton();
         BtnDelete.addActionListener(this);

         BtnNew=screen1.getNewButton();
         BtnNew.addActionListener(this);

         cmb1=screen1.getcmb1();
         cmb1.addActionListener(this);

         BtnUpdate=screen1.getUpdateButton();
         BtnUpdate.addActionListener(this);

         BtnCancel=screen1.getCancelButton();
         BtnCancel.addActionListener(this);


      }
	  public void actionPerformed(ActionEvent ae)
	  {
		  if(ae.getSource()==BtnSave)
		  {
			  ClsCountry temp=readUI();
			  ClsCountry.addNewCountry(temp);
			  JOptionPane.showMessageDialog(this,"Record Inserted Sucessfully");
			  readUI();
		  }
		  else if(ae.getSource()==BtnView)
		  {
			  addCountryRecord(cmb1);
		  }
		  else if(ae.getSource()==BtnDelete)
		  {
			  ClsCountry temp=readUI();
			  ClsCountry.DeleteCountry(temp);
			  JOptionPane.showMessageDialog(this,"Record Deleted Sucessfully");
		  }
		  else if(ae.getSource()==cmb1)
		  {
			  String name=(String)cmb1.getSelectedItem();
		      int ID=ClsCountry.getCountryIDFromCountryName(name);
              txtCountryID.setText(String.valueOf(ID));
              txtCountryName.setText(name);
		  }
		  else if(ae.getSource()==BtnNew)
		  {
			  ClsCountry temp=readUI();
			  txtCountryID.setText("1");
			  txtCountryName.setText(" ");
			  cmb1.removeAllItems();
		  }
		  else if(ae.getSource()==BtnUpdate)
		  {
			  ClsCountry temp=readUI();
			  ClsCountry.UpdateCountry(temp);
			  JOptionPane.showMessageDialog(this,"Record Updated Sucessfully");
		  }
		  else if(ae.getSource()==BtnCancel)
		  {
			  System.exit(0);
		  }

	}
	ClsCountry readUI()
	{
	   ClsCountry temp=new ClsCountry();
	   temp.setCountryID(Integer.parseInt(txtCountryID.getText()));
	   temp.setCountryName(txtCountryName.getText());
	   return(temp);
    }
       void addCountryRecord(JComboBox temp)
       {
		   temp.removeActionListener(this);
		   ClsCountry.addCountryRecord(temp);
		   temp.addActionListener(this);
	   }

    public static void main(String[] args)
    {
        FrmCountryNew A=new FrmCountryNew();
        A.show();
    }
}

















