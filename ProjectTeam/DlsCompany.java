import javax.swing.*;
import java.awt.*;
import java.sql.*;
class DlsCompany
{
    public static void addNewCompany(ClsCompany temp)
    {
         String SQ="'";
         String comma=",";
         String space=" ";

         String query="insert into tblCompany (CompanyName,HeadOffice,eMail,WebPage,FaceBookID,TwitterID,InstaID,FaxNo,TollFree,ContactNo,OwnerName,EstablishedYear)"+space+
         "values ("+space+
         SQ+temp.getCompanyName()+SQ+comma+
         SQ+temp.getHeadOffice()+SQ+comma+
         SQ+temp.geteMail()+SQ+comma+
         SQ+temp.getWebPage()+SQ+comma+
         SQ+temp.getFaceBookID()+SQ+comma+
         SQ+temp.getTwitterID()+SQ+comma+
         SQ+temp.getInstaID()+SQ+comma+
         SQ+temp.getFaxNo()+SQ+comma+
         SQ+temp.getTollFree()+SQ+comma+
         SQ+temp.getContactNo()+SQ+comma+
         SQ+temp.getOwnerName()+SQ+comma+
         SQ+String.valueOf(temp.getEstablishedYear())+SQ+");";

         JOptionPane.showMessageDialog(null,query);
         }
}
