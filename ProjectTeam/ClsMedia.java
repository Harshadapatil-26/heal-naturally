import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsMedia
{
     private int MediaID;
     private String MediaName;

     public void setMediaID(int value)
     {
         MediaID=value;
     }
     public int getMediaID()
     {
         return(MediaID);
     }
     public void setMediaName(String value)
     {
         MediaName=value;
     }
     public String getMediaName()
     {
          return(MediaName);
     }
     public static void showMedia(ClsMedia temp)
     {
    	  System.out.println("MediaID         "+temp.getMediaID());
	      System.out.println("MediaName       "+temp.getMediaName());
      }
	  public static void main(String args[])
	  {
		 ClsMedia obj=new ClsMedia();
		 obj.setMediaID(1);
		 obj.setMediaName("shruti");
    	 ClsMedia.showMedia(obj);
		 ClsMedia.addNewMedia(obj);
	  }
	  public static void addNewMedia(ClsMedia temp)
	  {
		  DlsMedia.addNewMedia(temp);
	  }
	  public static int getAllMediaCount()
	  {
		   return(DlsMedia.getAllMediaCount());
	  }
	  public static String[]getAllMedia()
	  {
		  return(DlsMedia.getAllMedia());
	  }
	  public static void addMediaRecord(JComboBox temp)
	  {
		  temp.removeAllItems();
		  temp.addItem("Select Media Name");
		  String data[]=ClsMedia.getAllMedia();
		  for(String x:data)
		  {
			  temp.addItem(x);
		  }
	  }
	  public static int getMediaIDFromMediaName(String item)
	  {
		  return(DlsMedia.getMediaIDFromMediaName(item));
	  }

  }









