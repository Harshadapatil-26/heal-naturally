import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class ClsStaff
{
     private int StaffID;
     private String StaffName;
     private int Gender;
     private int Married;
     private String Education;
     private String Contact;
     private String eMail;

     public void setStaffID(int value)
     {
         StaffID=value;
     }
     public int getStaffID()
     {
          return(StaffID);
     }
     public void setStaffName(String value)
     {
          StaffName=value;
     }
     public String getStaffName()
     {
         return(StaffName);
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
      public void setEducation(String value)
      {
		  Education=value;
	  }
	  public String getEducation()
	  {
		  return(Education);
	  }
	  public void setContact(String value)
	  {
		    Contact=value;
	  }
	  public String getContact()
	  {
		     return(Contact);
	  }
	  public void seteMail(String value)
	  {
		     eMail=value;
	  }
	  public String geteMail()
	  {
		   return(eMail);
	   }
	  public static void showStaff(ClsStaff temp)
	  {
		  System.out.println("StaffID         "+temp.getStaffID());
		  System.out.println("StaffName       "+temp.getStaffName());
		  System.out.println("Gender          "+temp.getGender());
		  System.out.println("Married         "+temp.getMarried());
		  System.out.println("Education       "+temp.getEducation());
		  System.out.println("Contact         "+temp.getContact());
		  System.out.println("eMail           "+temp.geteMail());
	  }
	  public static void addNewStaff(ClsStaff temp)
	  {
		  DlsStaff.addNewStaff(temp);
	  }
	   public static int getAllStaffCount()
	  	 {
	  		 return(DlsStaff.getAllStaffCount());
	  	 }

	  public static void main(String args[])
	  {
		  ClsStaff obj=new ClsStaff();

		  ClsStaff.showStaff(obj);
		  ClsStaff.addNewStaff(obj);
		  ClsStaff.updateStaff(obj);
		  ClsStaff.deleteStaff(obj);
		  System.out.println(ClsStaff.getAllStaffCount());
	  }
	 public static void updateStaff(ClsStaff temp)
	 {
		 DlsStaff.updateStaff(temp);
	 }
	 public static void deleteStaff(ClsStaff temp)
	 {
		 DlsStaff.deleteStaff(temp);
	 }


}















