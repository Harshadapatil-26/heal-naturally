import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsVillage
{
        public static int getAllVillageCount()
   	  	{
   	  		String Query="Select count(VillageID) from tblVillage";
   	  		return(DataManage.getRecordCount(Query));
   	  	}
   	  	public static int getAllVillageCount(int mTalukaID)
		{
			String Query="Select count(VillageID) from tblVillage where TalukaID="+String.valueOf(mTalukaID);
			return(DataManage.getRecordCount(Query));
		}
		public static int getVillageIDFromVillageName(String item)
	    {
			String Query="Select VillageID From tblVillage where VillageName ='" +item+"'";
			return(DataManage.getCodeFromName(Query));
	    }

   	  	public static String[]getAllVillage()
   	  	{

   	  		String Query="Select VillageName from tblVillage";
   	  		int rec=ClsVillage.getAllVillageCount();
   	  		String data[]=DataManage.getVillageColumn(Query,rec);
   	  		return(data);
	    }
		public static String[]getAllVillage(int mTalukaID)
	    {
		    String Query="Select VillageName from tblVillage where TalukaID="+String.valueOf(mTalukaID);
	    	int rec=ClsVillage.getAllVillageCount();
	    	String data[]=DataManage.getVillageColumn(Query,rec);
	    	return(data);
	    }
	    public void addVillageRecord(JComboBox temp,int mDistrictID)
		{
			String Query="Select TalukaName From tblTaluka where TalukaID="+String.valueOf(mDistrictID);
	    }

	    public static void addNewVillage(ClsVillage temp)
	    {
			String sq="'";
			String comma=",";
			String space=" ";

			String query="insert into tblVillage(VillageName,TalukaID)"+space +
			             "Values("+space +
			             sq+temp.getVillageName()+sq+comma+
			             sq+String.valueOf(temp.getTalukaID())+sq+")";

		   JOptionPane.showMessageDialog(null,query);
		   DataManage.processQuery(query);
        }
}











