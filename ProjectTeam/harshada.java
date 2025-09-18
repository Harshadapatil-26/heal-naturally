import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class harshada extends JFrame implements ActionListener
{
       JPanel pnlNew,pnlCenter;
       JLabel lblHeading,lblName;
       JTextField txtName;
       JButton BtnRegister;
       public harshada()
	   {
		   setSize(1920,1080);
		   setTitle("Yoga and Ayurveda");
	       setLayout(null);

	       pnlNew=new JPanel();
	       pnlNew.setLayout(null);
	       pnlNew.setBounds(1,1,1920,1080);
	       pnlNew.setBackground(Color.black);
	       add(pnlNew);

	       lblHeading=new JLabel("Yoga and Ayurveda");
	       lblHeading.setFont(new Font("Cambria",Font.BOLD,60));
	       lblHeading.setBounds(640,100,900,100);
	       lblHeading.setForeground(Color.white);
	       pnlNew.add(lblHeading);

		   pnlCenter=new JPanel();
		   pnlCenter.setLayout(null);
		   pnlCenter.setBounds(650,300,500,300);
		   pnlCenter.setBackground(Color.gray);
	       pnlNew.add(pnlCenter);

	       lblName=new JLabel("Name");
	       lblName.setForeground(Color.black);
	       lblName.setBounds(50,50,100,90);
	       lblName.setFont(new Font("Cambria",Font.BOLD,35));
	       pnlCenter.add(lblName);

	       txtName=new JTextField();
	       txtName.setBounds(160,70,300,50);
	       txtName.setFont(new Font("calibri",Font.BOLD,30));
	       pnlCenter.add(txtName);

	       BtnRegister=new JButton("Register");
	       BtnRegister.setBounds(170,170,200,50);
	       BtnRegister.setFont(new Font("Calibri",Font.BOLD,30));
	       pnlCenter.add(BtnRegister);
	       BtnRegister.addActionListener(this);
	   }
	   public void actionPerformed(ActionEvent ae)
	   {
		   if(ae.getSource()==BtnRegister)
		   {
			   JOptionPane.showMessageDialog(this,""+txtName.getText()+" Registered Sucessfully");
			   harshada1 B=new harshada1();
			   B.show();
		    }
	   }

	   public static void main(String[] args)
	   {
	      harshada A=new harshada();
	      A.show();
	   }
}















