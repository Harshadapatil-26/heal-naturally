import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
class ClsStaffCombo
{
     private int StaffID;
     private String StaffName;

     public void setStaffID(int value)
          {
              StaffID=value;
          }
          public int getStaffID()
          {
               return(StaffID);
          }
          public void setStaffName(String value)
          {
               StaffName=value;
          }
          public String getStaffName()
          {
              return(StaffName);
          }
          public static int getAllStaffCount()
          {
	       return(DlsStaffCombo.getAllStaffCount());
          }
          public static void addStaffRecord(JComboBox temp)
          {
                  temp.removeAllItems();
                  temp.addItem("Select StaffName");
                  String data[]=ClsStaffCombo.getAllStaffName();
                  for(String x:data)
                  {
                         temp.addItem(x);
                   }
          }
          public static String[] getAllStaffName()
          {
                return(DlsStaffCombo.getAllStaffName());
          }


}














