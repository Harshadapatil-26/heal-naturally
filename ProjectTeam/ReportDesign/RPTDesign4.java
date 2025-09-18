package ReportDesign;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RPTDesign4 extends JPanel
{
      JPanel pnlTop,pnlOption,pnlShow,pnlCancel,pnlSubOption1,pnlSubOption2,pnlSubOption3,pnlSubOption4,pnlAction,pnlLeft,pnlRight,pnlCenterHeading,pnlCenter,pnlBottom;
      JLabel lblTop,lblSubOption1,lblSubOption2,lblSubOption3,lblSubOption4,lblLeftImage,lblRightImage,lblCenterHeading;
      JComboBox cmbSubOption1,cmbSubOption2,cmbSubOption3,cmbSubOption4;
      JButton btnShow,btnCancel;
      public RPTDesign4()
      {
           setLayout(null);
           setSize(1920,1080);

           pnlTop=new JPanel();
           pnlTop.setBounds(10,10,1882,50);
		   pnlTop.setBackground(Color.orange);
		   pnlTop.setLayout(null);
		   add(pnlTop);

		   lblTop=new JLabel("REPORT DETAILS");
		   lblTop.setBounds(800,5,300,50);
		   lblTop.setFont(new Font("Cambria",Font.BOLD,30));
		   pnlTop.add(lblTop);

		   pnlOption=new JPanel();
		   pnlOption.setBounds(10,70,1490,100);
		   pnlOption.setBackground(Color.pink);
		   pnlOption.setLayout(null);
		   add(pnlOption);

		   pnlSubOption1=new JPanel();
		   pnlSubOption1.setBounds(10,10,290,80);
		   pnlSubOption1.setBackground(Color.white);
		   pnlSubOption1.setLayout(null);
		   pnlOption.add(pnlSubOption1);

		   lblSubOption1=new JLabel("Label 1");
		   lblSubOption1.setBounds(100,5,100,30);
		   lblSubOption1.setFont(new Font("Cambria",Font.BOLD,20));
		   pnlSubOption1.add(lblSubOption1);

		   cmbSubOption1=new JComboBox();
		   cmbSubOption1.setBounds(20,40,250,30);
		   pnlSubOption1.add(cmbSubOption1);

		   pnlSubOption2=new JPanel();
		   pnlSubOption2.setBounds(305,10,290,80);
		   pnlSubOption2.setBackground(Color.white);
		   pnlSubOption2.setLayout(null);
		   pnlOption.add(pnlSubOption2);

		   lblSubOption2=new JLabel("Label 2");
		   lblSubOption2.setBounds(100,5,100,30);
		   lblSubOption2.setFont(new Font("Cambria",Font.BOLD,20));
		   pnlSubOption2.add(lblSubOption2);

		   cmbSubOption2=new JComboBox();
		   cmbSubOption2.setBounds(20,40,250,30);
		   pnlSubOption2.add(cmbSubOption2);

		   pnlSubOption3=new JPanel();
		   pnlSubOption3.setBounds(600,10,290,80);
		   pnlSubOption3.setBackground(Color.white);
		   pnlSubOption3.setLayout(null);
		   pnlOption.add(pnlSubOption3);

		   lblSubOption3=new JLabel("Label 3");
		   lblSubOption3.setBounds(100,5,100,30);
		   lblSubOption3.setFont(new Font("Cambria",Font.BOLD,20));
		   pnlSubOption3.add(lblSubOption3);

		   cmbSubOption3=new JComboBox();
		   cmbSubOption3.setBounds(20,40,250,30);
		   pnlSubOption3.add(cmbSubOption3);

		   pnlSubOption4=new JPanel();
		   pnlSubOption4.setBounds(895,10,290,80);
		   pnlSubOption4.setBackground(Color.white);
		   pnlSubOption4.setLayout(null);
		   pnlOption.add(pnlSubOption4);

		   lblSubOption4=new JLabel("Label 4");
		   lblSubOption4.setBounds(100,5,100,30);
		   lblSubOption4.setFont(new Font("Cambria",Font.BOLD,20));
		   pnlSubOption4.add(lblSubOption4);

		   cmbSubOption4=new JComboBox();
		   cmbSubOption4.setBounds(20,40,250,30);
		   pnlSubOption4.add(cmbSubOption4);

		   pnlAction=new JPanel();
		   pnlAction.setBounds(1505,70,387,100);
		   pnlAction.setBackground(Color.pink);
		   pnlAction.setLayout(null);
		   add(pnlAction);

		   pnlShow=new JPanel();
		   pnlShow.setBounds(10,10,180,80);
		   pnlShow.setBackground(Color.white);
		   pnlShow.setLayout(null);
		   pnlAction.add(pnlShow);

		   btnShow=new JButton("Show");
		   btnShow.setBounds(10,10,160,60);
		   btnShow.setFont(new Font("Cambria",Font.BOLD,20));
		   pnlShow.add(btnShow);

		   pnlCancel=new JPanel();
		   pnlCancel.setBounds(195,10,182,80);
		   pnlCancel.setBackground(Color.white);
		   pnlCancel.setLayout(null);
		   pnlAction.add(pnlCancel);

		   btnCancel=new JButton("Cancel");
		   btnCancel.setBounds(10,10,160,60);
		   btnCancel.setFont(new Font("Cambria",Font.BOLD,20));
		   pnlCancel.add(btnCancel);

		   pnlLeft=new JPanel();
		   pnlLeft.setBounds(10,180,370,772);
		   pnlLeft.setBackground(Color.black);
		   pnlLeft.setLayout(null);
		   add(pnlLeft);

		   lblLeftImage=new JLabel(new ImageIcon("sun.JPG"));
           lblLeftImage.setBounds(10,10,350,752);
           pnlLeft.add(lblLeftImage);

		   pnlCenterHeading=new JPanel();
		   pnlCenterHeading.setBounds(386,180,1114,60);
		   pnlCenterHeading.setBackground(Color.white);
		   pnlCenterHeading.setLayout(null);
		   pnlCenterHeading.setBorder(BorderFactory.createLineBorder(Color.black,2));
		   add(pnlCenterHeading);

		   lblCenterHeading=new JLabel("REPORT");
		   lblCenterHeading.setBounds(500,10,200,40);
		   lblCenterHeading.setFont(new Font("Cambria",Font.BOLD,30));
		   pnlCenterHeading.add(lblCenterHeading);

		   pnlCenter=new JPanel();
		   pnlCenter.setBounds(386,250,1114,702);
		   pnlCenter.setBackground(Color.gray);
		   pnlCenter.setLayout(null);
		   add(pnlCenter);

		   pnlRight=new JPanel();
		   pnlRight.setBounds(1505,180,387,772);
		   pnlRight.setBackground(Color.black);
		   pnlRight.setLayout(null);
		   add(pnlRight);

		   lblRightImage=new JLabel(new ImageIcon("sun2.JPG"));
		   lblRightImage.setBounds(10,10,366,752);
           pnlRight.add(lblRightImage);

		   pnlBottom=new JPanel();
		   pnlBottom.setBounds(10,963,1882,60);
		   pnlBottom.setBackground(Color.orange);
		   pnlBottom.setLayout(null);
		   add(pnlBottom);

      }
      public static void main(String args[])
      {
           RPTDesign4 A=new RPTDesign4();
           A.show();
       }
}