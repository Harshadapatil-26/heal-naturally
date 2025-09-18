import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
class DlsStaffCombo
{
	 public static int getAllStaffCount()
	 {
		 String query="select count(*) from tblStaff";
		 return(DataManage.getRecordCount(query));
	 }
     public static String[]getAllStaffName()
     {
             int rec=ClsStaffCombo.getAllStaffCount();
             String query="Select * from tblStaff";
             return(DataManage.getFullColumn(query,rec));
      }
}