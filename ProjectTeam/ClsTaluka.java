import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsTaluka
{
     private int TalukaID;
     private String TalukaName;
     private int CountryID;
     private int StateID;
     private int DistrictID;

     public void setTalukaID(int value)
     {
         TalukaID=value;
     }
     public int getTalukaID()
     {
         return(TalukaID);
     }
     public void setTalukaName(String value)
     {
         TalukaName=value;
     }
     public String getTalukaName()
     {
          return(TalukaName);
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
     public void setDistrictID(int value)
     {
         DistrictID=value;
     }
     public int getDistrictID()
     {
         return(DistrictID);
     }
     public static void showTaluka(ClsTaluka temp)
     {
    	  System.out.println("TalukaID         "+temp.getTalukaID());
	      System.out.println("TalukaName       "+temp.getTalukaName());
	      System.out.println("CountryID         "+temp.getCountryID());
	      System.out.println("StateID         "+temp.getStateID());
	      System.out.println("DistrictID         "+temp.getDistrictID());
      }
      public static void addNewTaluka(ClsTaluka temp)
	  {
	      DlsTaluka.addNewTaluka(temp);
	  }
      public static void main(String args[])
	  {
	      ClsTaluka obj=new ClsTaluka();
	      obj.setTalukaID(1);
	      obj.setTalukaName("Harshada");

	      ClsTaluka.showTaluka(obj);
	      ClsTaluka.addNewTaluka(obj);
       }
      /* public static void addTalukaRecord(JComboBox temp)
       {
		   temp.removeAllItems();
		   temp.addItem("Select Taluka Name");
	   }*/
	   public static void addDistrictRecord(JComboBox temp)
	          {
	   		   temp.removeAllItems();
	   		   temp.addItem("Select District Name");
	   }
	    public static int getAllTalukaCount()
	   {
	   	   return(DlsTaluka.getAllTalukaCount());
	   }
	   public static String[]getAllTaluka()
	   {
	   	   return(DlsTaluka.getAllTaluka());
	   }
	   public static void addTalukaRecord(JComboBox temp)
	   {
	   	   temp.removeAllItems();
	   	   temp.addItem("Select Taluka Name");
	   	   String data[]=ClsTaluka.getAllTaluka();
	   	   for(String x:data)
	   	   {
	   	  	  temp.addItem(x);
	   	   }
	   }
	  public static int getTalukaIDFromTalukaName(String item)
	  {
	      return(DlsTaluka.getTalukaIDFromTalukaName(item));
	  }
	  ////////////////
	/*  public static int getAllTalukaCount(int mDistrict)
	  {
		  return(DlsTaluka.getAllTalukaCount(mDistrict));
      }*/
       public static int getAllTalukaCount(int mDistrictID)
	  		 {
	  			   return(DlsTaluka.getAllTalukaCount(mDistrictID));
		 }
	  public static String[]getAllTaluka(int mDistrict)
	  {
		  return(DlsTaluka.getAllTaluka(mDistrict));
	  }
	  public static void addTalukaRecord(JComboBox temp, int mDistrictID)
	  {
		  temp.removeAllItems();
		  temp.addItem("Select taluka");
		  String data[]=ClsTaluka.getAllTaluka(mDistrictID);
		  for(String x:data)
		  {
			  temp.addItem(x);
		  }
	  }


	   	  /////////////////////////
  }












