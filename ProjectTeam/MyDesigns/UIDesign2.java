package MyDesigns;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UIDesign2 extends JPanel
{
     JPanel PnlTop,PnlBottom,PnlSubTop,PnlLeft,PnlLeft2,PnlRight,PnlCenter,PnlButton,PnlNew,PnlSave,PnlView,PnlEdit,PnlUpdate,PnlDelete,PnlCancel,Pnlcmb1,Pnlcmb2;

     JButton BtnNew,BtnSave,BtnView,BtnEdit,BtnUpdate,BtnDelete,BtnCancel;
     JComboBox cmb1,cmb2;
     JLabel lbl1,lbl2,lblimage,lblTop,lblSubtop,lblBottom;
     public UIDesign2()
     {
             setLayout(null);
             setSize(1920,1080);

             PnlTop=new JPanel();
             PnlTop.setBounds(10,10,1882,50);
             PnlTop.setBackground(Color.orange);
             add(PnlTop);

             lblTop=new JLabel();
			 lblTop.setBounds(750,10,400,30);
			 lblTop.setFont(new Font("Cambria",Font.BOLD,35));
             PnlTop.add(lblTop);

             PnlSubTop=new JPanel();
			 PnlSubTop.setBounds(10,70,1882,50);
			 PnlSubTop.setBackground(Color.red);
			 add(PnlSubTop);

			 lblSubtop=new JLabel();
			 lblSubtop.setBounds(800,10,400,30);
			 lblSubtop.setFont(new Font("Cambria",Font.BOLD,25));
             PnlSubTop.add(lblSubtop);

             PnlLeft=new JPanel();
			 PnlLeft.setBounds(10,130,350,830);
			 PnlLeft.setBackground(Color.orange);
			 PnlLeft.setLayout(null);
             add(PnlLeft);


             Pnlcmb1=new JPanel();
			 Pnlcmb1.setBounds(10,10,330,70);
			 Pnlcmb1.setBackground(Color.white);
			 Pnlcmb1.setLayout(null);
             PnlLeft.add(Pnlcmb1);

             lbl1=new JLabel("Label 1");
             lbl1.setBounds(20,20,80,30);
             lbl1.setFont(new Font("Cambria",Font.BOLD,20));
             Pnlcmb1.add(lbl1);

             cmb1=new JComboBox();
             cmb1.setBounds(110,20,200,30);
             Pnlcmb1.add(cmb1);

             Pnlcmb2=new JPanel();
			 Pnlcmb2.setBounds(10,90,330,70);
			 Pnlcmb2.setBackground(Color.white);
			 Pnlcmb2.setLayout(null);
			 PnlLeft.add(Pnlcmb2);

			 lbl2=new JLabel("Label 2");
			 lbl2.setBounds(20,20,80,30);
			 lbl2.setFont(new Font("Cambria",Font.BOLD,20));
			 Pnlcmb2.add(lbl2);

			 cmb2=new JComboBox();
			 cmb2.setBounds(110,20,200,30);
             Pnlcmb2.add(cmb2);


             PnlLeft2=new JPanel();
			 PnlLeft2.setBounds(10,170,330,650);
			 PnlLeft2.setBackground(Color.white);
             PnlLeft.add(PnlLeft2);

             PnlCenter=new JPanel();
			 PnlCenter.setBounds(370,130,1131,750);
			 PnlCenter.setBackground(Color.PINK);
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

             BtnNew=new JButton("NEW");
             BtnNew.setBounds(10,10,130,30);
             PnlNew.add(BtnNew);

             PnlSave=new JPanel();
			 PnlSave.setBounds(170,10,150,50);
			 PnlSave.setBackground(Color.black);
			 PnlSave.setLayout(null);
             PnlButton.add(PnlSave);

             BtnSave=new JButton("SAVE");
			 BtnSave.setBounds(10,10,130,30);
             PnlSave.add(BtnSave);

             PnlView=new JPanel();
			 PnlView.setBounds(330,10,150,50);
			 PnlView.setBackground(Color.black);
			 PnlView.setLayout(null);
             PnlButton.add(PnlView);

             BtnView=new JButton("VIEW");
		     BtnView.setBounds(10,10,130,30);
             PnlView.add(BtnView);

             PnlEdit=new JPanel();
			 PnlEdit.setBounds(490,10,150,50);
			 PnlEdit.setBackground(Color.black);
			 PnlEdit.setLayout(null);
             PnlButton.add(PnlEdit);

             BtnEdit=new JButton("EDIT");
			 BtnEdit.setBounds(10,10,130,30);
             PnlEdit.add(BtnEdit);

             PnlUpdate=new JPanel();
			 PnlUpdate.setBounds(650,10,150,50);
			 PnlUpdate.setBackground(Color.black);
			 PnlUpdate.setLayout(null);
             PnlButton.add(PnlUpdate);

             BtnUpdate=new JButton("UPDATE");
			 BtnUpdate.setBounds(10,10,130,30);
             PnlUpdate.add(BtnUpdate);

             PnlDelete=new JPanel();
			 PnlDelete.setBounds(810,10,150,50);
			 PnlDelete.setBackground(Color.black);
			 PnlDelete.setLayout(null);
             PnlButton.add(PnlDelete);

             BtnDelete=new JButton("DELETE");
			 BtnDelete.setBounds(10,10,130,30);
             PnlDelete.add(BtnDelete);

             PnlCancel=new JPanel();
			 PnlCancel.setBounds(970,10,150,50);
			 PnlCancel.setBackground(Color.black);
			 PnlCancel.setLayout(null);
             PnlButton.add(PnlCancel);

             BtnCancel=new JButton("CANCEL");
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

             lblBottom=new JLabel("Harshada Patil");
			 lblBottom.setBounds(800,10,400,30);
			 lblBottom.setFont(new Font("Cambria",Font.BOLD,30));
             PnlBottom.add(lblBottom);

      }
      public static void main(String[] args)
      {
           UIDesign2 A=new UIDesign2();
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
		public JPanel getLeft2Panel()
		{
			return(PnlLeft2);
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











