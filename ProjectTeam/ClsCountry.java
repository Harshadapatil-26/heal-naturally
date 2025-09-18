import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsCountry
{
     private int CountryID;
     private String CountryName;

     public void setCountryID(int value)
     {
         CountryID=value;
     }
     public int getCountryID()
     {
         return(CountryID);
     }
     public void setCountryName(String value)
     {
         CountryName=value;
     }
     public String getCountryName()
     {
          return(CountryName);
     }
     public static void showCountry(ClsCountry temp)
     {
    	  System.out.println("CountryID         "+temp.getCountryID());
	      System.out.println("CountryName       "+temp.getCountryName());
      }
      public static void main(String args[])
      {
		  ClsCountry obj=new ClsCountry();
		  obj.setCountryID(1);
		  obj.setCountryName("shruti");
		  ClsCountry.showCountry(obj);
		  ClsCountry.addNewCountry(obj);
      }
      public static void addNewCountry(ClsCountry temp)
      {
     	  DlsCountry.addNewCountry(temp);
      }
      public static void DeleteCountry(ClsCountry temp)
      {
		  DlsCountry.DeleteCountry(temp);
	  }
      public static void UpdateCountry(ClsCountry temp)
      {
		  DlsCountry.UpdateCountry(temp);
	  }
      public static int getAllCountryCount()
      {
      	   return(DlsCountry.getAllCountryCount());
      }
      public static String[] getAllCountryName()
      {
		  return(DlsCountry.getAllCountryName());
	  }
      public static void addCountryRecord(JComboBox temp)
	  {
		  temp.removeAllItems();

		  temp.addItem("Select Country Name");
		  String data[]=ClsCountry.getAllCountryName();
		  for(String x:data)
		  {
				 temp.addItem(x);
		  }
	  }
	  public static int getCountryIDFromCountryName(String item)
	  {
		  return(DlsCountry.getCountryIDFromCountryName(item));
	  }
}












