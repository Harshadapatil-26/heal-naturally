import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsRegionalLanguage
{
     private int RegionalLanguageID;
     private String RegionalLanguageName;

     public void setRegionalLanguageID(int value)
     {
         RegionalLanguageID=value;
     }
     public int getRegionalLanguageID()
     {
         return(RegionalLanguageID);
     }
     public void setRegionalLanguageName(String value)
     {
         RegionalLanguageName=value;
     }
     public String getRegionalLanguageName()
     {
          return(RegionalLanguageName);
     }
     public static void showRegionalLanguage(ClsRegionalLanguage temp)
     {
    	  System.out.println("RegionalLanguageID         "+temp.getRegionalLanguageID());
	      System.out.println("RegionalLanguageName       "+temp.getRegionalLanguageName());
     }
     public static void main(String args[])
     {
		 ClsRegionalLanguage obj=new ClsRegionalLanguage();
		 obj.setRegionalLanguageID(1);
		 obj.setRegionalLanguageName("shruti");
		 ClsRegionalLanguage.showRegionalLanguage(obj);
		 ClsRegionalLanguage.addNewRegionalLanguage(obj);
	 }
	 public static void addNewRegionalLanguage(ClsRegionalLanguage temp)
	 {
	     DlsRegionalLanguage.addNewRegionalLanguage(temp);
	 }
	 public static int getAllRegionalLanguageCount()
	 {
	     return(DlsRegionalLanguage.getAllRegionalLanguageCount());
	 }
	 public static String[]getAllRegionalLanguage()
	 {
	     return(DlsRegionalLanguage.getAllRegionalLanguage());
     }
     public static void addRegionalLanguageRecord(JComboBox temp)
     {
	      temp.removeAllItems();
	      temp.addItem("Select RegionalLanguage Name");
	      String data[]=ClsRegionalLanguage.getAllRegionalLanguage();
	      for(String x:data)
	      {
	    	  temp.addItem(x);
	      }
      }
      public static int getRegionalLanguageIDFromRegionalLanguageName(String item)
      {
	     return(DlsRegionalLanguage.getRegionalLanguageIDFromRegionalLanguageName(item));
       }
}









