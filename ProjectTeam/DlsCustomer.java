import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;
class DlsCustomer
{
	public static void addNewCustomer(ClsCustomer temp)
	    {
			String sq="'";
			String comma=",";
			String space=" ";

			String query="insert into tblCustomer(CustomerName,PlaceID)"+space +
			             "Values("+space +
			             sq+temp.getCustomerName()+sq+comma+
			             sq+String.valueOf(temp.getPlaceID())+sq+")";

			JOptionPane.showMessageDialog(null,query);
			             DataManage.processQuery(query);
      }
}











