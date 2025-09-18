import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
class ClsNewspaper
{
     private int PaperID;
     private String PaperName;

     public void setPaperID(int value)
          {
              PaperID=value;
          }
          public int getPaperID()
          {
               return(PaperID);
          }
          public void setPaperName(String value)
          {
               PaperName=value;
          }
          public String getPaperName()
          {
              return(PaperName);
          }
          public static int getAllPaperCount()
          {
	       return(DlsNewspaper.getAllPaperCount());
          }
          public static void addPaperRecord(JComboBox temp)
          {
                  temp.removeAllItems();
                  temp.addItem("Select Paper Name");
                  String data[]=ClsNewspaper.getAllPaperName();
                  for(String x:data)
                  {
                         temp.addItem(x);
                   }
          }
          public static String[] getAllPaperName()
          {
                return(DlsNewspaper.getAllPaperName());
          }


}














