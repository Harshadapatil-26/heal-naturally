import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsRegionalLanguage
{
	public static int getAllRegionalLanguageCount()
	{
		String Query="Select count(RegionalLanguageID) from tblRegionalLanguage";
		return(DataManage.getRecordCount(Query));
	}
	public static String[]getAllRegionalLanguage()
	{
		int rec=ClsRegionalLanguage.getAllRegionalLanguageCount();
		String Query="Select RegionalLanguageName from tblRegionalLanguage";
		String data[]=DataManage.getRegionalLanguageColumn(Query,rec);
		return(data);
	}

    public static void addNewRegionalLanguage(ClsRegionalLanguage temp)
    {
		String sq="'";
		String comma=",";
		String space=" ";

		String query="insert into tblRegionalLanguage(RegionalLanguageName)"+space+
		             "values ("+space+
		             sq+temp.getRegionalLanguageName()+sq+")";

		             JOptionPane.showMessageDialog(null,query);
		             DataManage.processQuery(query);
      }
      public static int getRegionalLanguageIDFromRegionalLanguageName(String item)
	  {
	  		String Query="Select RegionalLanguageID From tblRegionalLanguage where RegionalLanguageName ='" +item+"'";
	  		return(DataManage.getCodeFromName(Query));
	  }
}