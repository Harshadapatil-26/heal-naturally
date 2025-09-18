import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsCustomer
{
     private int CustomerID;
     private String CustomerName;
     private int PlaceID;

     public void setCustomerID(int value)
     {
         CustomerID=value;
     }
     public int getCustomerID()
     {
         return(CustomerID);
     }
     public void setCustomerName(String value)
     {
         CustomerName=value;
     }
     public String getCustomerName()
     {
          return(CustomerName);
     }
     public void setPlaceID(int value)
	      {
	          PlaceID=value;
	      }
	      public int getPlaceID()
	      {
	          return(PlaceID);
     }
     public static void showCustomer(ClsCustomer temp)
     {
    	  System.out.println("CustomerID         "+temp.getCustomerID());
	      System.out.println("CustomerName       "+temp.getCustomerName());
	      System.out.println("PlaceID         "+temp.getPlaceID());
      }
      public static void main(String args[])
	        {
	             ClsCustomer obj=new ClsCustomer();
	             obj.setCustomerID(1);
	             obj.setCustomerName("Harshada");

	             ClsCustomer.showCustomer(obj);
	             ClsCustomer.addNewCustomer(obj);
       }
      public static void addNewCustomer(ClsCustomer temp)
      {
     	  DlsCustomer.addNewCustomer(temp);
      }

       public static void addCustomerRecord(JComboBox temp)
       {
		   temp.removeAllItems();
		   temp.addItem("Select Customer Name");
	   }
  }












