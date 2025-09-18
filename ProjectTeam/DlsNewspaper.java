import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
class DlsNewspaper
{
	 public static int getAllPaperCount()
	 {
		 String query="select count(*) from tblNewspaper";
		 return(DataManage.getRecordCount(query));
	 }
     public static String[]getAllPaperName()
     {
             int rec=ClsNewspaper.getAllPaperCount();
             String query="Select * from tblNewspaper";
             return(DataManage.getFullColumn(query,rec));
      }
}