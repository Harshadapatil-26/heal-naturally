import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsState
{
  public static int getAllStateCount()
  	{
  		String Query="Select count(StateID) from tblState";
  		return(DataManage.getRecordCount(Query));
  	}
  	public static String[]getAllState()
  	{
  		int rec=ClsState.getAllStateCount();
  		String Query="Select StateName from tblState";
  		String data[]=DataManage.getStateColumn(Query,rec);
  		return(data);
	}
	public static int getStateIDFromStateName(String item)
		  	      {
		  	  		String Query="Select StateID From tblState where StateName ='" +item+"'";
		  	  		return(DataManage.getCodeFromName(Query));
	}
	///////////////////////////
	public static int getAllStateCount(int mCountryID)
	  	{
	  		String Query="Select count(StateID) from tblState where CountryID="+String.valueOf(mCountryID);
	  		return(DataManage.getRecordCount(Query));
	  	}
	  	public static String[]getAllState(int mCountryID)
	  	{
	  		int rec=ClsState.getAllStateCount(mCountryID);
	  		String Query="Select StateName from tblState where CountryID="+String.valueOf(mCountryID);
	  		String data[]=DataManage.getStateColumn(Query,rec);
	  		return(data);
	}
	////////////////////////
	public static void addNewState(ClsState temp)
	    {
			String sq="'";
			String comma=",";
			String space=" ";

			String query="insert into tblState(StateName,CountryID)"+space +
			             "Values("+space +
			             sq+temp.getStateName()+sq+comma+
			             sq+String.valueOf(temp.getCountryID())+sq+")";

			JOptionPane.showMessageDialog(null,query);
			             DataManage.processQuery(query);
      }

}











