import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsStaff
{
    public static void addNewStaff(ClsStaff temp)
    {
		String sq="'";
		String comma=",";
		String space=" ";

		String query="insert into tblStaff(StaffName,Gender,Married,Education,Contact,eMail)"+space+
		             "values ("+space+
		             sq+temp.getStaffName()+sq+comma+
		             sq+String.valueOf(temp.getGender())+sq+comma+
		             sq+String.valueOf(temp.getMarried())+sq+comma+
		             sq+temp.getEducation()+sq+comma+
		             sq+temp.getContact()+sq+comma+
		             sq+temp.geteMail()+sq+");";

		             JOptionPane.showMessageDialog(null,query);
		             DataManage.processQuery(query);
    }
    public static void updateStaff(ClsStaff temp)
    {
		String sq="'";
		String comma=",";
		String space=" ";
		String query="update tblStaff set"+space+
		             "StaffName="+sq+temp.getStaffName()+sq+comma+
		             "Gender="+sq+String.valueOf(temp.getGender())+sq+comma+
		             "Married="+sq+String.valueOf(temp.getMarried())+sq+comma+
		             "Education="+sq+temp.getEducation()+sq+comma+
		             "Contact="+sq+temp.getContact()+sq+comma+
		             "eMail="+sq+temp.geteMail()+sq+space+
		             "where StaffID="+sq+String.valueOf(temp.getStaffID());

        JOptionPane.showMessageDialog(null,query);
        DataManage.processQuery(query);
	}
    public static void deleteStaff(ClsStaff temp)
    {
		String space=" ";
		String query="delete * from tblStaff"+space+
			         "where StaffID="+String.valueOf(temp.getStaffID());

		JOptionPane.showMessageDialog(null,query);
		DataManage.processQuery(query);
	}
	public static int getAllStaffCount()
	{
		String query="select count(*)from tblStaff";
		return(DataManage.getRecordCount(query));
	}

}










