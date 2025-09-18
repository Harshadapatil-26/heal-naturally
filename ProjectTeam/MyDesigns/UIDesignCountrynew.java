package MyDesigns;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UIDesignCountrynew extends JPanel
{
	  JPanel PnlTop,PnlBottom,PnlSubTop,PnlLeft,Pnlcmb,PnlRight,PnlCenter,PnlButton,PnlNew,PnlSave,PnlView,PnlEdit,PnlUpdate,PnlDelete,PnlCancel;
	  JButton BtnNew,BtnSave,BtnView,BtnEdit,BtnUpdate,BtnDelete,BtnCancel;
	  JComboBox cmb1;
      JLabel lblcmb,lblimage,lblTop,lblSubtop,lblBottom;

      public UIDesignCountrynew()
	  {
		   setLayout(null);
		   setSize(1920,1080);
		 // setTitle("UI Design1");

		   PnlTop=new JPanel();
		   PnlTop.setBounds(10,10,1882,50);
		   PnlTop.setBackground(Color.orange);
		   PnlTop.setLayout(null);
		   add(PnlTop);

		   lblTop=new JLabel();
		   lblTop.setBounds(850,5,400,50);
		   lblTop.setFont(new Font("Cambria",Font.BOLD,30));
		   PnlTop.add(lblTop);

		   PnlSubTop=new JPanel();
		   PnlSubTop.setBounds(10,70,1882,50);
		   PnlSubTop.setBackground(Color.red);
		   PnlSubTop.setLayout(null);
		   add(PnlSubTop);

		   lblSubtop=new JLabel();
		   lblSubtop.setBounds(940,10,400,30);
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

		   lblcmb=new JLabel("Label 1");
		   lblcmb.setBounds(20,20,80,30);
		   lblcmb.setFont(new Font("Cambria",Font.BOLD,20));
		   Pnlcmb.add(lblcmb);

		   cmb1=new JComboBox();
		   cmb1.setBounds(110,20,200,30);
		   Pnlcmb.add(cmb1);

		   PnlCenter=new JPanel();
		   PnlCenter.setBounds(370,130,1131,750);
		   PnlCenter.setBackground(Color.pink);
		   PnlCenter.setLayout(null);
		   add(PnlCenter);


		   PnlButton=new JPanel();
		   PnlButton.setBounds(370,890,1131,70);
		   PnlButton.setBackground(Color.white);
		   PnlButton.setLayout(null);
		   PnlButton.setBorder(BorderFactory.createLineBorder(Color.black));
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

		   lblBottom=new JLabel();
		   lblBottom.setBounds(860,10,400,30);
		   lblBottom.setFont(new Font("Cambria",Font.BOLD,30));
		   PnlBottom.setLayout(null);
		   PnlBottom.add(lblBottom);

	    }
	    public static void main(String[] args)
	    {
			UIDesignCountrynew A=new UIDesignCountrynew();
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
        public JButton getNewButton()
        {
			return(BtnNew);
		}
        public JButton getUpdateButton()
        {
			return(BtnUpdate);
		}

        public JButton getSaveButton()
        {
			return(BtnSave);
		}
		public JButton getViewButton()
		{
			return(BtnView);
		}
		public JButton getDeleteButton()
		{
			return(BtnDelete);
		}
		public JButton getCancelButton()
		{
			return(BtnCancel);
		}

		public JComboBox getcmb1()
		{
			return(cmb1);
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















