import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsPlace
{
     private int PlaceID;
     private String PlaceName;

     public void setPlaceID(int value)
     {
         PlaceID=value;
     }
     public int getPlaceID()
     {
         return(PlaceID);
     }
     public void setPlaceName(String value)
     {
         PlaceName=value;
     }
     public String getPlaceName()
     {
          return(PlaceName);
     }
     public static void showPlace(ClsPlace temp)
     {
    	  System.out.println("PlaceID         "+temp.getPlaceID());
	      System.out.println("PlaceName       "+temp.getPlaceName());
      }
       public static void main(String args[])
	        {
	             ClsPlace obj=new ClsPlace();
	             obj.setPlaceID(1);
	             obj.setPlaceName("shruti");
	             ClsPlace.showPlace(obj);
	             ClsPlace.addNewPlace(obj);
       }
      public static void addNewPlace(ClsPlace temp)
      {
     	  DlsPlace.addNewPlace(temp);
      }
      public static int getAllPlaceCount()
      {
      	   return(DlsPlace.getAllPlaceCount());
      }
      public static String[]getAllPlace()
      {
		  return(DlsPlace.getAllPlace());
	  }
	  public static void addPlaceRecord(JComboBox temp)
	  {
		  temp.removeAllItems();
		  temp.addItem("Select Place Name");
		  String data[]=ClsPlace.getAllPlace();
		  for(String x:data)
		  {
			  temp.addItem(x);
		  }
	  }
	  public static int getPlaceIDFromPlaceName(String item)
	  {
		  return(DlsPlace.getPlaceIDFromPlaceName(item));
	  }

}












