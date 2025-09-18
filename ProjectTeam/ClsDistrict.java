import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsDistrict
{
     private int DistrictID;
     private String DistrictName;
     private int CountryID;
     private int StateID;


     public void setDistrictID(int value)
     {
         DistrictID=value;
     }
     public int getDistrictID()
     {
         return(DistrictID);
     }
     public void setDistrictName(String value)
     {
         DistrictName=value;
     }
     public String getDistrictName()
     {
          return(DistrictName);
     }
     public void setCountryID(int value)
	  {
		  CountryID=value;
	  }
	  public int getCountryID()
	  {
		  return(CountryID);
      }
     public void setStateID(int value)
	  {
		  StateID=value;
	  }
	  public int getStateID()
	  {
		  return(StateID);
      }
     public static void showDistrict(ClsDistrict temp)
     {
    	  System.out.println("DistrictID         "+temp.getDistrictID());
	      System.out.println("DistrictName       "+temp.getDistrictName());
	      System.out.println("CountryID         "+temp.getCountryID());
	      System.out.println("StateID         "+temp.getStateID());
      }
      public static void addNewDistrict(ClsDistrict temp)
	 {
	   	  DlsDistrict.addNewDistrict(temp);
	  }

      public static void main(String args[])
	  {
	       ClsDistrict obj=new ClsDistrict();
	       obj.setDistrictID(1);
	       obj.setDistrictName("Harshada");
	       ClsDistrict.showDistrict(obj);
	       ClsDistrict.addNewDistrict(obj);
       }
       public static void addStateRecord(JComboBox temp)
       {
		   temp.removeAllItems();
		   temp.addItem("Select State Name");
	   }
	   public static int getAllDistrictCount()
		{
		   return(DlsDistrict.getAllDistrictCount());
		}
		public static String[]getAllDistrict()
		{
		    return(DlsDistrict.getAllDistrict());
	    }
	   	public static void addDistrictRecord(JComboBox temp)
	   	{
			  temp.removeAllItems();
			  temp.addItem("Select District Name");
			  String data[]=ClsDistrict.getAllDistrict();
			  for(String x:data)
			  {
				  temp.addItem(x);
			  }
	   	 }
	  public static int getDistrictIDFromDistrictName(String item)
	  {
		  return(DlsDistrict.getDistrictIDFromDistrictName(item));
	  }
	  /////////////////
	   public static int getAllDistrictCount(int mStateID)
		 {
			   return(DlsDistrict.getAllDistrictCount(mStateID));
		 }
		 public static String[]getAllDistrict(int mStateID)
		 {
    		  return(DlsDistrict.getAllDistrict(mStateID));
         }

	  public static void addDistrictRecord(JComboBox temp, int mStateID)
	  {
		  temp.removeAllItems();
		  temp.addItem("Select District Name");
		  String data[]=ClsDistrict.getAllDistrict(mStateID);
		  for(String x:data)
		  {
			  temp.addItem(x);
		  }

	  }
	   	  /////////////////
  }












