import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsOwner
{
     private int OwnerID;
     private String OwnerName;
     private String email;
     private int Gender;
     private int Married;
     private int Age;

     public void setOwnerID(int value)
     {
         OwnerID=value;
     }
     public int getOwnerID()
     {
         return(OwnerID);
     }
     public void setOwnerName(String value)
     {
         OwnerName=value;
     }
     public String getOwnerName()
     {
          return(OwnerName);
     }
     public void setemail(String value)
     {
         email=value;
     }
     public String getemail()
     {
          return(email);
     }
     public void setGender(int value)
     {
         Gender=value;
     }
     public int getGender()
     {
           return(Gender);
      }
      public String getGenderText()
      {
            String text="Female";
            if(Gender==1)
            {
                 text="Male";
            }
            return(text);
      }
      public void setMarried(int value)
      {
            Married=value;
      }
      public int getMarried()
      {
             return(Married);
      }
      public String getMarriedText()
      {
            String text="UnMarried";
            if(Married==1)
            {
                text="Married";
             }
             return(text);
      }

     public void setAge(int value)
     {
         Age=value;
     }
     public int getAge()
     {
          return(Age);
     }

     public static void showOwner(ClsOwner temp)
     {
    	  System.out.println("OwnerID         "+temp.getOwnerID());
	      System.out.println("OwnerName       "+temp.getOwnerName());
	      System.out.println("email       "+temp.getemail());
	      System.out.println("Gender       "+temp.getGender());
	      System.out.println("Married       "+temp.getMarried());
	      System.out.println("Age       "+temp.getAge());
      }
      public static void main(String args[])
      {
		  ClsOwner obj=new ClsOwner();
		  obj.setOwnerID(1);
		  obj.setOwnerName("shruti");
		  ClsOwner.showOwner(obj);
		  ClsOwner.addNewOwner(obj);
      }
      public static void addNewOwner(ClsOwner temp)
      {
     	  DlsOwner.addNewOwner(temp);
      }
      public static void DeleteOwner(ClsOwner temp)
      {
		  DlsOwner.DeleteOwner(temp);
	  }
      public static int getAllOwnerCount()
      {
      	   return(DlsOwner.getAllOwnerCount());
      }
      public static String[] getAllOwnerName()
      {
		  return(DlsOwner.getAllOwnerName());
	  }
      public static void addOwnerRecord(JComboBox temp)
	  {
		  temp.removeAllItems();
		  temp.addItem("Select Owner Name");
		  String data[]=ClsOwner.getAllOwnerName();
		  for(String x:data)
		  {
				 temp.addItem(x);
		  }
	  }
	  public static int getOwnerIDFromOwnerName(String item)
	  {
		  return(DlsOwner.getOwnerIDFromOwnerName(item));
	  }
}












