import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsContent
{
     private int ContentID;
     private String ContentName;
     private int RegionalLanguageID;
     private int MediaID;

     public void setContentID(int value)
     {
         ContentID=value;
     }
     public int getContentID()
     {
         return(ContentID);
     }
     public void setContentName(String value)
     {
         ContentName=value;
     }
     public String getContentName()
     {
          return(ContentName);
     }
     public void setRegionalLanguageID(int value)
	 {
	      RegionalLanguageID=value;
	 }
	 public int getRegionalLanguageID()
	 {
	      return(RegionalLanguageID);
     }
     public void setMediaID(int value)
	 {
		  MediaID=value;
	 }
	 public int getMediaID()
	 {
	      return(MediaID);
     }
     public static void showContent(ClsContent temp)
     {
    	  System.out.println("ContentID         "+temp.getContentID());
	      System.out.println("ContentName       "+temp.getContentName());
	      System.out.println("RegionalLanguageID         "+temp.getRegionalLanguageID());
	      System.out.println("MediaID         "+temp.getMediaID());
     }
     public static void addNewContent(ClsContent temp)
	 {
	   	  DlsContent.addNewContent(temp);
	 }

     public static void main(String args[])
	 {
	      ClsContent obj=new ClsContent();
	      obj.setContentID(1);
	      obj.setContentName("Harshada");
	      ClsContent.showContent(obj);
	      ClsContent.addNewContent(obj);
     }
     public static void addMediaRecord(JComboBox temp)
     {
	      temp.removeAllItems();
	      temp.addItem("Select Media Name");
     }
	 public static int getAllContentCount()
	 {
	     return(DlsContent.getAllContentCount());
	 }
	 public static String[]getAllContent()
	 {
	    return(DlsContent.getAllContent());
	 }
	 public static void addContentRecord(JComboBox temp)
	 {
		  temp.removeAllItems();
		  temp.addItem("Select Content Name");
		  String data[]=ClsContent.getAllContent();
		  for(String x:data)
		  {
			  temp.addItem(x);
		  }
	 }
	 public static int getContentIDFromContentName(String item)
	 {
    	  return(DlsContent.getContentIDFromContentName(item));
	 }
	  /////////////////
	/* public static int getAllContentCount(int mMediaID)
	 {
		   return(DlsContent.getAllContentCount(mMediaID));
     }
	 public static String[]getAllContent(int mMediaID)
	 {
    	  return(DlsContent.getAllContent(mMediaID));
     }

	 public static void addContentRecord(JComboBox temp, int mMediaID)
	 {
		  temp.removeAllItems();
		  temp.addItem("Select Media Name");
		  String data[]=ClsContent.getAllContent();
		  for(String x:data)
		  {
			  temp.addItem(x);
		  }

	  }*/
	   	  /////////////////
  }












