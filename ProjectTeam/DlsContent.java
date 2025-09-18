import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsContent
{
    public static int getAllContentCount()
	  	{
	  		String Query="Select count(ContentID) from tblContent";
	  		return(DataManage.getRecordCount(Query));
	  	}
	  	///////////
	/*	public static int getAllContentCount(int mMediaID)
		{
			String Query="Select count(ContentID) from tblContent where MediaID="+String.valueOf(mMediaID);
			return(DataManage.getRecordCount(Query));
		}*/
        ////////////
	  	public static String[]getAllContent()
	  	{
	  		int rec=ClsContent.getAllContentCount();
	  		String Query="Select ContentName from tblContent";
	  		String data[]=DataManage.getContentColumn(Query,rec);
	  		return(data);
	    }
	////////////////
	/*
	    public static String[]getAllContent(int mMediaID)
		{
			String Query="Select ContentName from tblContent where MediaID="+String.valueOf(mMediaID);
			int rec=ClsContent.getAllContentCount();
			String data[]=DataManage.getContentColumn(Query,rec);
			return(data);
		}
	/////////////////////////////
    	public void addContentRecord(JComboBox temp,int mRegionalLanguageID)
    	{
  		    String Query="Select MediaName From tblMedia where RegionalLanguageID="+String.valueOf(mRegionalLanguageID);
    	}
	////////////////////////*/
    	public static int getContentIDFromContentName(String item)
        {
   		    String Query="Select ContentID From tblContent where ContentName ='" +item+"'";
    	    return(DataManage.getCodeFromName(Query));
	    }
	    public static void addNewContent(ClsContent temp)
	    {
			String sq="'";
			String comma=",";
			String space=" ";

			String query="insert into tblContent(ContentName,RegionalLanguageID,MediaID)"+space +
			             "Values("+space +
			             sq+temp.getContentName()+sq+comma+
			             sq+String.valueOf(temp.getMediaID())+sq+comma+
			             sq+String.valueOf(temp.getMediaID())+sq+")";

			JOptionPane.showMessageDialog(null,query);
			DataManage.processQuery(query);
       }

}











