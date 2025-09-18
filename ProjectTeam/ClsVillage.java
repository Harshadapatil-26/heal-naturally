import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsVillage
{
     private int VillageID;
     private String VillageName;
     private int CountryID;
     private int StateID;
     private int DistrictID;
     private int TalukaID;


     public void setVillageID(int value)
     {
         VillageID=value;
     }
     public int getVillageID()
     {
         return(VillageID);
     }
     public void setVillageName(String value)
     {
         VillageName=value;
     }
     public String getVillageName()
     {
          return(VillageName);
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
      public void setTalukaID(int value)
      {
	      TalukaID=value;
	  }
	  public int getTalukaID()
	  {
	      return(TalukaID);
     }
     public static void showVillage(ClsVillage temp)
     {
    	  System.out.println("VillageID         "+temp.getVillageID());
	      System.out.println("VillageName       "+temp.getVillageName());
	      System.out.println("CountryID         "+temp.getCountryID());
	      System.out.println("StateID         "+temp.getStateID());
	      System.out.println("DistrictID         "+temp.getDistrictID());
	      System.out.println("TalukaID         "+temp.getTalukaID());
	      System.out.println("VillageID         "+temp.getVillageID());
      }
      public static void addNewVillage(ClsVillage temp)
	  {
	      DlsVillage.addNewVillage(temp);
	  }

      public static void main(String args[])
	  {
          ClsVillage obj=new ClsVillage();
	      obj.setVillageID(1);
	      obj.setVillageName("Harshada");
	      ClsVillage.showVillage(obj);
	      ClsVillage.addNewVillage(obj);
       }
    /*   public static void addTalukaRecord(JComboBox temp)
	          {
	   		   temp.removeAllItems();
	   		   temp.addItem("Select Taluka Name");
	   }*/
       public static void addVillageRecord(JComboBox temp)
       {
		   temp.removeAllItems();
		   temp.addItem("Select Village Name");
	   }
	   public static int getAllVillageCount()
	   	   {
	   	   	   return(DlsVillage.getAllVillageCount());
	   	   }
	   	   public static String[]getAllVillage()
	   	   {
	   	   	   return(DlsVillage.getAllVillage());
	   	   }
	   	    public static int getVillageIDFromVillageName(String item)
		   	  	  {
		   	  		  return(DlsVillage.getVillageIDFromVillageName(item));
	  	  }
	   	  /* public static void addVillageRecord(JComboBox temp)
	   	   {
	   	   	   temp.removeAllItems();
	   	   	   temp.addItem("Select Village Name");
	   	   	   String data[]=ClsVillage.getAllVillage();
	   	   	   for(String x:data)
	   	   	   {
	   	   	  	  temp.addItem(x);
	   	   	   }
		   }*/


	   ////////////////
	    public static int getAllVillageCount(int mTalukaID)
	   		 {
	   			   return(DlsVillage.getAllVillageCount(mTalukaID));
		 }
	   public static String[]getAllVillage(int mTaluka)
	   	  {
	   		  return(DlsVillage.getAllVillage(mTaluka));
	   	  }
	   	  public static void addVillageRecord(JComboBox temp, int mTalukaID)
	   	  {
	   		  temp.removeAllItems();
	   		  temp.addItem("Select Village");
	   		  String data[]=ClsVillage.getAllVillage(mTalukaID);
	   		  for(String x:data)
	   		  {
	   			  temp.addItem(x);
	   		  }
	   	  }
	   	   	  /////////////////////////

  }












