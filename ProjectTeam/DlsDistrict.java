import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsDistrict
{
    public static int getAllDistrictCount()
	  	{
	  		String Query="Select count(DistrictID) from tblDistrict";
	  		return(DataManage.getRecordCount(Query));
	  	}
	  	///////////
		public static int getAllDistrictCount(int mStateID)
		{
			String Query="Select count(DistrictID) from tblDistrict where StateID="+String.valueOf(mStateID);
			return(DataManage.getRecordCount(Query));
		}
        ////////////
	  	public static String[]getAllDistrict()
	  	{
	  		int rec=ClsDistrict.getAllDistrictCount();
	  		String Query="Select DistrictName from tblDistrict";
	  		String data[]=DataManage.getDistrictColumn(Query,rec);
	  		return(data);
	    }
	////////////////
	    public static String[]getAllDistrict(int mStateID)
		{

            int rec=ClsDistrict.getAllDistrictCount(mStateID);
			String Query="Select DistrictName from tblDistrict where StateID="+String.valueOf(mStateID);
			String data[]=DataManage.getDistrictColumn(Query,rec);
			return(data);
		}

	/////////////////////////////
    /*	public void addDistrictRecord(JComboBox temp,int mCountryID)
    	{
  		    String Query="Select StateName From tblState where CountryID="+String.valueOf(mCountryID);
    	}*/
	////////////////////////
    	public static int getDistrictIDFromDistrictName(String item)
        {
   		   String Query="Select DistrictID From tblDistrict where DistrictName ='" +item+"'";
    	   return(DataManage.getCodeFromName(Query));
	    }
	    public static void addNewDistrict(ClsDistrict temp)
	    {
			String sq="'";
			String comma=",";
			String space=" ";

			String query="insert into tblDistrict(DistrictName,StateID)"+space +
			             "Values("+space +
			             sq+temp.getDistrictName()+sq+comma+
			             sq+String.valueOf(temp.getStateID())+sq+")";

			JOptionPane.showMessageDialog(null,query);
			DataManage.processQuery(query);
      }

}











