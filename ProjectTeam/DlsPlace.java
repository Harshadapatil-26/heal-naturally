import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsPlace
{
	public static int getAllPlaceCount()
	{
		String Query="Select count(PlaceID) from tblPlace";
		return(DataManage.getRecordCount(Query));
	}
	public static String[]getAllPlace()
	{
		int rec=ClsPlace.getAllPlaceCount();
		String Query="Select PlaceName from tblPlace";
		String data[]=DataManage.getPlaceColumn(Query,rec);
		return(data);
	}

    public static void addNewPlace(ClsPlace temp)
    {
		String sq="'";
		String comma=",";
		String space=" ";

		String query="insert into tblPlace(PlaceName)"+space+
		             "values ("+space+
		             sq+temp.getPlaceName()+sq+")";

		JOptionPane.showMessageDialog(null,query);
		             DataManage.processQuery(query);
      }
      public static int getPlaceIDFromPlaceName(String item)
	      {
	  		String Query="Select PlaceID From tblPlace where PlaceName ='" +item+"'";
	  		return(DataManage.getCodeFromName(Query));
	}


}