import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsCountry
{
	 public static int getAllCountryCount()
	 {
		 String query="select count(*) from tblCountry";
		 return(DataManage.getRecordCount(query));
	 }
	 public static String[]getAllCountryName()
	 {
		 int rec=ClsCountry.getAllCountryCount();
		 String query="Select * from tblCountry";
		 return(DataManage.getFullColumn(query,rec));
     }

     public static void addNewCountry(ClsCountry temp)
     {
		 String sq="'";
		 String comma=",";
		 String space=" ";

		 String query="insert into tblCountry(CountryName)"+space+
		             "values ("+space+
		             sq+temp.getCountryName()+sq+")";

		 JOptionPane.showMessageDialog(null,query);
		             DataManage.processQuery(query);
     }
     public static void DeleteCountry(ClsCountry temp)
     {
	  	String sq="'";
	  	String comma=",";
	  	String space=" ";

	  	String query="Delete * from tblCountry"+space+"where CountryID="+String.valueOf(temp.getCountryID()+"");

	  	JOptionPane.showMessageDialog(null,query);
				 DataManage.processQuery(query);
    }
    public static void UpdateCountry(ClsCountry temp)
    {
	  	String sq="'";
	  	String comma=",";
	  	String space=" ";

	  	String query="Update tblCountry set"+space+"CountryName="+sq+temp.getCountryName()+sq+space+
	  	             "where CountryID="+String.valueOf(temp.getCountryID()+"");

	    JOptionPane.showMessageDialog(null,query);
				 DataManage.processQuery(query);
	}

    public static int getCountryIDFromCountryName(String item)
	{
		String Query="Select CountryID From tblCountry where CountryName ='" +item+"'";
		return(DataManage.getCodeFromName(Query));
	}


}














