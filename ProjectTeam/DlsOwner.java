import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsOwner
{
	 public static int getAllOwnerCount()
	 {
		 String query="select count(*) from tblOwner";
		 return(DataManage.getRecordCount(query));
	 }
	 public static String[]getAllOwnerName()
	 {
		 int rec=ClsOwner.getAllOwnerCount();
		 String query="Select * from tblOwner";
		 return(DataManage.getFullColumn(query,rec));
     }

     public static void addNewOwner(ClsOwner temp)
     {
		 String sq="'";
		 String comma=",";
		 String space=" ";

		 String query="insert into tblOwner(OwnerName,email,Gender,Married,Age)"+space+
		             "values ("+space+
		             sq+temp.getOwnerName()+sq+comma+
		             sq+temp.getemail()+sq+comma+
		             sq+String.valueOf(temp.getGender())+sq+comma+
		             sq+String.valueOf(temp.getMarried())+sq+comma+
		             sq+String.valueOf(temp.getAge())+sq+")";

		 JOptionPane.showMessageDialog(null,query);
		             DataManage.processQuery(query);
     }
     public static void DeleteOwner(ClsOwner temp)
     {
	  	String sq="'";
	  	String comma=",";
	  	String space=" ";

	  	String query="Delete * from tblOwner"+space+"where OwnerID="+String.valueOf(temp.getOwnerID()+"");

	  	JOptionPane.showMessageDialog(null,query);
				 DataManage.processQuery(query);
    }
    public static void UpdateOwner(ClsOwner temp)
    {
	  	String sq="'";
	  	String comma=",";
	  	String space=" ";

	  	String query="Update tblOwner set"+space+"OwnerName="+sq+temp.getOwnerName()+sq+space+
	  	             "where OwnerID="+String.valueOf(temp.getOwnerID()+"");

	    JOptionPane.showMessageDialog(null,query);
				 DataManage.processQuery(query);
	}

    public static int getOwnerIDFromOwnerName(String item)
	{
		String Query="Select OwnerID From tblOwner where OwnerName ='" +item+"'";
		return(DataManage.getCodeFromName(Query));
	}
}














