import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FrmMedia extends JFrame implements ActionListener
{
     JLabel lblMediaID,lblMediaName;
     JTextField txtMediaID,txtMediaName;
     JButton BTInsert;
     FrmMedia()
     {
           setSize(700,500);
     	   setLocation(100,100);
	       setTitle("Media Information");
	       setLayout(null);

	       lblMediaID=new JLabel("MediaID ");
           lblMediaID.setBounds(10,20,100,30);
           add(lblMediaID);

           txtMediaID=new JTextField();
	       txtMediaID.setBounds(120,20,200,30);
           add(txtMediaID);

           lblMediaName=new JLabel("MediaName ");
	       lblMediaName.setBounds(10,70,100,30);
	       add(lblMediaName);

	  	   txtMediaName=new JTextField();
	       txtMediaName.setBounds(120,70,200,30);
           add(txtMediaName);

		  BTInsert=new JButton("Insert");
		  BTInsert.setBounds(80,120,100,30);
		  add(BTInsert);

          BTInsert.addActionListener(this);
	  }
	  public void actionPerformed(ActionEvent ae)
	  {
	      if(ae.getSource()==BTInsert)
	      {
	          ClsMedia temp=readUI();
	          ClsMedia.addNewMedia(temp);
	  	  }
	  	  readUI();
       }
       ClsMedia readUI()
	   	   {
	   		   ClsMedia temp=new ClsMedia();
	   		   temp.setMediaID(Integer.parseInt(txtMediaID.getText()));
	   		   temp.setMediaName(txtMediaName.getText());
	   		   return(temp);
	          }
	          public static void main(String args[])
	          {
	              FrmMedia A=new FrmMedia();
	              A.show();
       }
}









