import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsTaluka
{
   public static int getAllTalukaCount()
   	  	{
   	  		String Query="Select count(TalukaID) from tblTaluka";
   	  		return(DataManage.getRecordCount(Query));
   	  	}
   	  	public static int getAllTalukaCount(int mDistrictID)
		{
			String Query="Select count(TalukaID) from tblTaluka where DistrictID="+String.valueOf(mDistrictID);
			return(DataManage.getRecordCount(Query));
		}
		public static int getTalukaIDFromTalukaName(String item)
	    {
			String Query="Select TalukaID From tblTaluka where TalukaName ='" +item+"'";
			return(DataManage.getCodeFromName(Query));
	    }

   	  	public static String[]getAllTaluka()
   	  	{

   	  		String Query="Select TalukaName from tblTaluka";
   	  		int rec=ClsTaluka.getAllTalukaCount();
   	  		String data[]=DataManage.getTalukaColumn(Query,rec);
   	  		return(data);
	    }
		public static String[]getAllTaluka(int mDistrictID)
	    {
		    String Query="Select TalukaName from tblTaluka where DistrictID="+String.valueOf(mDistrictID);
	    	int rec=ClsTaluka.getAllTalukaCount();
	    	String data[]=DataManage.getTalukaColumn(Query,rec);
	    	return(data);
	    }
	    public void addTalukaRecord(JComboBox temp,int mStateID)
		{
			String Query="Select DistrictName From tblDistrict where DistrictID="+String.valueOf(mStateID);
	    }

	    public static void addNewTaluka(ClsTaluka temp)
	    {
			String sq="'";
			String comma=",";
			String space=" ";

			String query="insert into tblTaluka(TalukaName,DistrictID)"+space +
			             "Values("+space +
			             sq+temp.getTalukaName()+sq+comma+
			             sq+String.valueOf(temp.getDistrictID())+sq+")";

		   JOptionPane.showMessageDialog(null,query);
		   DataManage.processQuery(query);
        }
}











