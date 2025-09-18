import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsState
{
     private int StateID;
     private String StateName;
     private int CountryID;

     public void setStateID(int value)
     {
         StateID=value;
     }
     public int getStateID()
     {
         return(StateID);
     }
     public void setStateName(String value)
     {
         StateName=value;
     }
     public String getStateName()
     {
          return(StateName);
     }
     public void setCountryID(int value)
	      {
	          CountryID=value;
	      }
	      public int getCountryID()
	      {
	          return(CountryID);
     }
     public static void showState(ClsState temp)
     {
    	  System.out.println("StateID         "+temp.getStateID());
	      System.out.println("StateName       "+temp.getStateName());
	      System.out.println("CountryID         "+temp.getCountryID());
      }
      public static void main(String args[])
	        {
	             ClsState obj=new ClsState();
	             obj.setStateID(1);
	             obj.setStateName("Harshada");

	             ClsState.showState(obj);
	             ClsState.addNewState(obj);
       }
      public static void addNewState(ClsState temp)
      {
     	  DlsState.addNewState(temp);
      }
/////////
       public static void addCountryRecord(JComboBox temp)
       {
		   temp.removeAllItems();
		   temp.addItem("Select Country Name");
	   }
	   /////////////
	   public static int getAllStateCount()
	         {
	         	   return(DlsState.getAllStateCount());
	         }
	         public static String[]getAllState()
	         {
	   		  return(DlsState.getAllState());
	   	  }
	   	  public static void addStateRecord(JComboBox temp)
	   	  {
	   		  temp.removeAllItems();
	   		  temp.addItem("Select State Name");
	   		  String data[]=ClsState.getAllState();
	   		  for(String x:data)
	   		  {
	   			  temp.addItem(x);
	   		  }
	   	  }
	   	  public static int getStateIDFromStateName(String item)
	   	  {
	   		  return(DlsState.getStateIDFromStateName(item));
	  }
	  ////////////////////
	  public static int getAllStateCount(int mCountryID)
	  	         {
	  	         	   return(DlsState.getAllStateCount(mCountryID));
	  	         }
	  	         public static String[]getAllState(int mCountryID)
	  	         {
	  	   		  return(DlsState.getAllState(mCountryID));
	  	   	  }
	  	   	  public static void addStateRecord(JComboBox temp,int mCountryID)
	  	   	  {
	  	   		  temp.removeAllItems();
	  	   		  temp.addItem("Select State Name");
	  	   		  String data[]=ClsState.getAllState(mCountryID);
	  	   		  for(String x:data)
	  	   		  {
	  	   			  temp.addItem(x);
	  	   		  }
	   	  }
  }












