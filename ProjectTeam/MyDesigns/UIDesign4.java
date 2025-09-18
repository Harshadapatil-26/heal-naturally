package MyDesigns;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UIDesign4 extends JPanel
{
     JPanel PnlTop,PnlBottom,PnlSubTop,PnlLeft,PnlLeft2,PnlRight,PnlCenter,PnlButton,PnlNew,PnlSave,PnlView,PnlEdit,PnlUpdate,PnlDelete,PnlCancel,Pnlcmb,Pnlcmb2,Pnlcmb3,Pnlcmb4;

     JButton BtnNew,BtnSave,BtnView,BtnEdit,BtnUpdate,BtnDelete,BtnCancel;
     JComboBox cmb1,cmb2,cmb3,cmb4;
     JLabel lblcmb1,lblcmb2,lblcmb3,lblcmb4,lblimage,lblTop,lblSubtop,lblBottom;
     public UIDesign4()
     {
             setLayout(null);
             setSize(1920,1080);

             PnlTop=new JPanel();
             PnlTop.setBounds(10,10,1882,50);
             PnlTop.setBackground(Color.orange);
             PnlTop.setLayout(null);
             add(PnlTop);

             lblTop=new JLabel();
			 lblTop.setBounds(750,10,400,40);
			 lblTop.setFont(new Font("Cambria",Font.BOLD,30));
             PnlTop.add(lblTop);

             PnlSubTop=new JPanel();
			 PnlSubTop.setBounds(10,70,1882,50);
			 PnlSubTop.setBackground(Color.red);
			 PnlSubTop.setLayout(null);
			 add(PnlSubTop);

			 lblSubtop=new JLabel();
			 lblSubtop.setBounds(850,10,400,40);
			 lblSubtop.setFont(new Font("Cambria",Font.BOLD,25));
             PnlSubTop.add(lblSubtop);

             PnlLeft=new JPanel();
			 PnlLeft.setBounds(10,130,350,830);
			 PnlLeft.setBackground(Color.orange);
			 PnlLeft.setLayout(null);
             add(PnlLeft);


             Pnlcmb=new JPanel();
			 Pnlcmb.setBounds(10,10,330,70);
			 Pnlcmb.setBackground(Color.white);
			 Pnlcmb.setLayout(null);
             PnlLeft.add(Pnlcmb);

             lblcmb1=new JLabel("Label 1");
             lblcmb1.setBounds(20,20,80,30);
             lblcmb1.setFont(new Font("Cambria",Font.BOLD,20));
             Pnlcmb.add(lblcmb1);

             cmb1=new JComboBox();
             cmb1.setBounds(110,20,200,30);
             Pnlcmb.add(cmb1);

             Pnlcmb2=new JPanel();
			 Pnlcmb2.setBounds(10,90,330,70);
			 Pnlcmb2.setBackground(Color.white);
			 Pnlcmb2.setLayout(null);
			 PnlLeft.add(Pnlcmb2);

			 lblcmb2=new JLabel("Label 2");
			 lblcmb2.setBounds(20,20,80,30);
			 lblcmb2.setFont(new Font("Cambria",Font.BOLD,20));
			 Pnlcmb2.add(lblcmb2);

			 cmb2=new JComboBox();
			 cmb2.setBounds(110,20,200,30);
             Pnlcmb2.add(cmb2);

             Pnlcmb3=new JPanel();
			 Pnlcmb3.setBounds(10,170,330,70);
			 Pnlcmb3.setBackground(Color.white);
			 Pnlcmb3.setLayout(null);
			 PnlLeft.add(Pnlcmb3);

			 lblcmb3=new JLabel("Label 3");
			 lblcmb3.setBounds(20,20,80,30);
			 lblcmb3.setFont(new Font("Cambria",Font.BOLD,20));
			 Pnlcmb3.add(lblcmb3);

			 cmb3=new JComboBox();
			 cmb3.setBounds(110,20,200,30);
             Pnlcmb3.add(cmb3);

             Pnlcmb4=new JPanel();
			 Pnlcmb4.setBounds(10,250,330,70);
			 Pnlcmb4.setBackground(Color.white);
			 Pnlcmb4.setLayout(null);
			 PnlLeft.add(Pnlcmb4);

			 lblcmb4=new JLabel("Label 4");
			 lblcmb4.setBounds(20,20,80,30);
			 lblcmb4.setFont(new Font("Cambria",Font.BOLD,20));
			 Pnlcmb4.add(lblcmb4);

			 cmb4=new JComboBox();
			 cmb4.setBounds(110,20,200,30);
             Pnlcmb4.add(cmb4);

             PnlLeft2=new JPanel();
			 PnlLeft2.setBounds(10,330,330,490);
			 PnlLeft2.setBackground(Color.white);
             PnlLeft.add(PnlLeft2);

             PnlCenter=new JPanel();
			 PnlCenter.setBounds(370,130,1131,750);
			 PnlCenter.setBackground(Color.pink);
             add(PnlCenter);

             PnlButton=new JPanel();
			 PnlButton.setBounds(370,890,1131,70);
			 PnlButton.setBackground(Color.white);
			 PnlButton.setBorder(BorderFactory.createLineBorder(Color.black));
			 PnlButton.setLayout(null);
             add(PnlButton);

             PnlNew=new JPanel();
			 PnlNew.setBounds(10,10,150,50);
			 PnlNew.setBackground(Color.black);
			 PnlNew.setLayout(null);
             PnlButton.add(PnlNew);

             BtnNew=new JButton("First");
             BtnNew.setBounds(10,10,130,30);
             PnlNew.add(BtnNew);

             PnlSave=new JPanel();
			 PnlSave.setBounds(170,10,150,50);
			 PnlSave.setBackground(Color.black);
			 PnlSave.setLayout(null);
             PnlButton.add(PnlSave);

             BtnSave=new JButton("Second");
			 BtnSave.setBounds(10,10,130,30);
             PnlSave.add(BtnSave);

             PnlView=new JPanel();
			 PnlView.setBounds(330,10,150,50);
			 PnlView.setBackground(Color.black);
			 PnlView.setLayout(null);
             PnlButton.add(PnlView);

             BtnView=new JButton("Third");
		     BtnView.setBounds(10,10,130,30);
             PnlView.add(BtnView);

             PnlEdit=new JPanel();
			 PnlEdit.setBounds(490,10,150,50);
			 PnlEdit.setBackground(Color.black);
			 PnlEdit.setLayout(null);
             PnlButton.add(PnlEdit);

             BtnEdit=new JButton("Fourth");
			 BtnEdit.setBounds(10,10,130,30);
             PnlEdit.add(BtnEdit);

             PnlUpdate=new JPanel();
			 PnlUpdate.setBounds(650,10,150,50);
			 PnlUpdate.setBackground(Color.black);
			 PnlUpdate.setLayout(null);
             PnlButton.add(PnlUpdate);

             BtnUpdate=new JButton("Fifth");
			 BtnUpdate.setBounds(10,10,130,30);
             PnlUpdate.add(BtnUpdate);

             PnlDelete=new JPanel();
			 PnlDelete.setBounds(810,10,150,50);
			 PnlDelete.setBackground(Color.black);
			 PnlDelete.setLayout(null);
             PnlButton.add(PnlDelete);

             BtnDelete=new JButton("Sixth");
			 BtnDelete.setBounds(10,10,130,30);
             PnlDelete.add(BtnDelete);

             PnlCancel=new JPanel();
			 PnlCancel.setBounds(970,10,150,50);
			 PnlCancel.setBackground(Color.black);
			 PnlCancel.setLayout(null);
             PnlButton.add(PnlCancel);

             BtnCancel=new JButton("Seventh");
			 BtnCancel.setBounds(10,10,130,30);
             PnlCancel.add(BtnCancel);

             PnlRight=new JPanel();
			 PnlRight.setBounds(1511,130,380,830);
			 PnlRight.setBackground(Color.orange);
			 PnlRight.setLayout(null);
             add(PnlRight);

             lblimage=new JLabel(new ImageIcon("Picture.JPG"));
             lblimage.setBounds(10,10,360,810);
             PnlRight.add(lblimage);

             PnlBottom=new JPanel();
			 PnlBottom.setBounds(10,970,1882,55);
			 PnlBottom.setBackground(Color.red);
			 PnlBottom.setLayout(null);
             add(PnlBottom);

             lblBottom=new JLabel();
			 lblBottom.setBounds(800,10,400,30);
			 lblBottom.setFont(new Font("Cambria",Font.BOLD,30));
             PnlBottom.add(lblBottom);



      }
      public static void main(String[] args)
      {
           UIDesign4 A=new UIDesign4();
           A.show();
       }
		public JPanel getCenterPanel()
		{
			return(PnlCenter);
		}
		public JPanel getTopPanel()
		{
			return(PnlTop);
        }
		public JPanel getSubTopPanel()
		{
			return(PnlSubTop);
        }
		public JPanel getLeftPanel()
		{
			return(PnlLeft);
        }
		public JPanel getcmbPanel()
		{
			return(Pnlcmb);
        }
		public JPanel getRightPanel()
		{
			return(PnlRight);
        }
		public JPanel getButtonPanel()
		{
			return(PnlButton);
        }
		public JPanel getNewPanel()
		{
			return(PnlNew);
        }
		public JPanel getSavePanel()
		{
			return(PnlSave);
        }
		public JPanel getViewPanel()
		{
			return(PnlView);
        }
		public JPanel getEditPanel()
		{
			return(PnlEdit);
        }
		public JPanel getUpdatePanel()
		{
			return(PnlUpdate);
        }
		public JPanel getDeletePanel()
		{
			return(PnlDelete);
        }
		public JPanel getCancelPanel()
		{
			return(PnlCancel);
        }
		public JPanel getBottomPanel()
		{
			return(PnlBottom);
        }
        public void setTopHeading(String msg)
        {
			lblTop.setText(msg);
		}
        public void setSubTopHeading(String msg)
        {
			lblSubtop.setText(msg);
		}
        public void setBottomHeading(String msg)
        {
			lblBottom.setText(msg);
		}

}
















