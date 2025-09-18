import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsMedia
{
	public static int getAllMediaCount()
	{
		String Query="Select count(MediaID) from tblMedia";
		return(DataManage.getRecordCount(Query));
	}
	public static String[]getAllMedia()
	{
		int rec=ClsMedia.getAllMediaCount();
		String Query="Select MediaName from tblMedia";
		String data[]=DataManage.getMediaColumn(Query,rec);
		return(data);
	}

    public static void addNewMedia(ClsMedia temp)
    {
		String sq="'";
		String comma=",";
		String space=" ";

		String query="insert into tblMedia(MediaName)"+space+
		             "values ("+space+
		             sq+temp.getMediaName()+sq+")";

		             JOptionPane.showMessageDialog(null,query);
		             DataManage.processQuery(query);
    }
    public static int getMediaIDFromMediaName(String item)
	{
		String Query="Select MediaID From tblMedia where MediaName ='" +item+"'";
		return(DataManage.getCodeFromName(Query));
	}
}