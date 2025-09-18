import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class DataManage
{
     public static void processQuery(String query)
     {
		 int counting=0;
          String url="Jdbc:Odbc:DSNTesting";
		   try
		   {
		         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		         Connection con=DriverManager.getConnection(url);
		         Statement st=con.createStatement();

		         st.execute(query);
		         con.close();
		 	}
		 	catch(Exception p)
		 	{
		 		 System.out.println("exception"+p);
		    }
	  }
	  public static int getRecordCount(String Query)
	       {
	  		 int counting=0;
	            String url="Jdbc:Odbc:DSNTesting";
	  		   try
	  		   {
	  		         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	  		         Connection con=DriverManager.getConnection(url);
	  		         Statement st=con.createStatement();
	  		         ResultSet rs=st.executeQuery(Query);
	  		         if(rs.next())
	  		         {
	  					 counting=(int)rs.getInt(1);
	  				 }

	  		        // st.execute(query);
	  		         con.close();
	  		 	}
	  		 	catch(Exception p)
	  		 	{
	  		 		 System.out.println("exception"+p);
	  		    }
	  		    return(counting);
	  }
	  public static int getCodeFromName(String Query)
	  	 {
	  		 int ID=0;
	  		 String url="Jdbc:Odbc:DSNTesting";
	  		 	 	 	 	  	      try
	  		 	 	 	 	  	      {
	  		 	 	 	 	  	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	  		 	 	 	 	  	          Connection con=DriverManager.getConnection(url);
	  		 	 	 	 	  	          Statement st=con.createStatement();
	  		 	 	 	 	  	          ResultSet rs=st.executeQuery(Query);
	  		 	 	 	 	  	          if(rs.next())
	  		 	 	 	 	  	          {
	  		 	 	 	 	  	 			 ID=(int)rs.getInt(1);
	  		 	 	 	 	  	    	   }
	  		 	 	 	 	    	           con.close();
	  		 	 	 	 	  	 	  }
	  		 	 	 	 	  	 	  catch(Exception p)
	  		 	 	 	 	  	 	  {
	  		 	 	 	 	  	 	         System.out.println("exception"+p);
	  		 	 	 	 	  	 	  }
	  	 	 	 	  	 	  return(ID);
	}
	  public static int getAllStaffCount(String Query)
	  	 	 	  	 {
	  	 	 	  	 	  int counting=0;
	  	 	 	  	      String url="Jdbc:Odbc:DSNTesting";
	  	 	 	  	      try
	  	 	 	  	      {
	  	 	 	  	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	  	 	 	  	          Connection con=DriverManager.getConnection(url);
	  	 	 	  	          Statement st=con.createStatement();
	  	 	 	  	          ResultSet rs=st.executeQuery(Query);
	  	 	 	  	          if(rs.next())
	  	 	 	  	          {
	  	 	 	  	 			 counting=(int)rs.getInt(2);
	  	 	 	  	    	   }
	  	 	 	    	           con.close();
	  	 	 	  	 	  }
	  	 	 	  	 	  catch(Exception p)
	  	 	 	  	 	  {
	  	 	 	  	 	         System.out.println("exception"+p);
	  	 	 	  	 	  }
	  	 	 	  	 	  return(counting);
	 }
	  public static int getCountryAllCount(String Query)
	  	       {
	  	  		 int counting=0;
	  	            String url="Jdbc:Odbc:DSNTesting";
	  	  		   try
	  	  		   {
	  	  		         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	  	  		         Connection con=DriverManager.getConnection(url);
	  	  		         Statement st=con.createStatement();
	  	  		         ResultSet rs=st.executeQuery(Query);
	  	  		         if(rs.next())
	  	  		         {
	  	  					 counting=(int)rs.getInt(2);
	  	  				 }
	  	  		         con.close();
	  	  		 	}
	  	  		 	catch(Exception p)
	  	  		 	{
	  	  		 		 System.out.println("exception"+p);
	  	  		    }
	  	  		    return(counting);
	  }
	  public static String[] getFullColumn(String query,int rec)
	  {
		  String temp[]=new String[rec];
		  String url="Jdbc:Odbc:DSNTesting";
		  try
		  {
		       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		       Connection con=DriverManager.getConnection(url);
		       Statement st=con.createStatement();
		       st.executeQuery(query);
	  	       ResultSet rs=st.executeQuery(query);
	  	       int i=0;
	  	       while(rs.next())
	  	       {
           		 temp[i]=rs.getString(2);
				 i++;
		        }
				con.close();
		  }
		  catch(Exception p)
		  {
				System.out.println("Exeption"+p);
		  }
		  return(temp);
	 }
	 public static int getStateAllCount(String Query)
	 {
	 	  int counting=0;
	      String url="Jdbc:Odbc:DSNTesting";
	      try
	      {
	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	          Connection con=DriverManager.getConnection(url);
	          Statement st=con.createStatement();
	          ResultSet rs=st.executeQuery(Query);
	          if(rs.next())
	          {
	 			 counting=(int)rs.getInt(2);
	    	   }
  	           con.close();
	 	  }
	 	  catch(Exception p)
	 	  {
	 	         System.out.println("exception"+p);
	 	  }
	 	  return(counting);
	 }
      public static int getDistrictAllCount(String Query)
	  	 {
	  	 	  int counting=0;
	  	      String url="Jdbc:Odbc:DSNTesting";
	  	      try
	  	      {
	  	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	  	          Connection con=DriverManager.getConnection(url);
	  	          Statement st=con.createStatement();
	  	          ResultSet rs=st.executeQuery(Query);
	  	          if(rs.next())
	  	          {
	  	 			 counting=(int)rs.getInt(2);
	  	    	   }
	    	           con.close();
	  	 	  }
	  	 	  catch(Exception p)
	  	 	  {
	  	 	         System.out.println("exception"+p);
	  	 	  }
	  	 	  return(counting);
	 }
	  public static int getAllPaperCount(String Query)
	 	 	 	  	 {
	 	 	 	  	 	  int counting=0;
	 	 	 	  	      String url="Jdbc:Odbc:DSNTesting";
	 	 	 	  	      try
	 	 	 	  	      {
	 	 	 	  	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 	 	 	  	          Connection con=DriverManager.getConnection(url);
	 	 	 	  	          Statement st=con.createStatement();
	 	 	 	  	          ResultSet rs=st.executeQuery(Query);
	 	 	 	  	          if(rs.next())
	 	 	 	  	          {
	 	 	 	  	 			 counting=(int)rs.getInt(2);
	 	 	 	  	    	   }
	 	 	 	    	           con.close();
	 	 	 	  	 	  }
	 	 	 	  	 	  catch(Exception p)
	 	 	 	  	 	  {
	 	 	 	  	 	         System.out.println("exception"+p);
	 	 	 	  	 	  }
	 	 	 	  	 	  return(counting);
	 	 }

	 public static int getTalukaAllCount(String Query)
	 	  	 {
	 	  	 	  int counting=0;
	 	  	      String url="Jdbc:Odbc:DSNTesting";
	 	  	      try
	 	  	      {
	 	  	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 	  	          Connection con=DriverManager.getConnection(url);
	 	  	          Statement st=con.createStatement();
	 	  	          ResultSet rs=st.executeQuery(Query);
	 	  	          if(rs.next())
	 	  	          {
	 	  	 			 counting=(int)rs.getInt(2);
	 	  	    	   }
	 	    	           con.close();
	 	  	 	  }
	 	  	 	  catch(Exception p)
	 	  	 	  {
	 	  	 	         System.out.println("exception"+p);
	 	  	 	  }
	 	  	 	  return(counting);
	 }

	 public static int getAllCustomerCount(String Query)
	 	 	  	 {
	 	 	  	 	  int counting=0;
	 	 	  	      String url="Jdbc:Odbc:DSNTesting";
	 	 	  	      try
	 	 	  	      {
	 	 	  	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 	 	  	          Connection con=DriverManager.getConnection(url);
	 	 	  	          Statement st=con.createStatement();
	 	 	  	          ResultSet rs=st.executeQuery(Query);
	 	 	  	          if(rs.next())
	 	 	  	          {
	 	 	  	 			 counting=(int)rs.getInt(2);
	 	 	  	    	   }
	 	 	    	           con.close();
	 	 	  	 	  }
	 	 	  	 	  catch(Exception p)
	 	 	  	 	  {
	 	 	  	 	         System.out.println("exception"+p);
	 	 	  	 	  }
	 	 	  	 	  return(counting);
	 }
   /*  public static int getAllPlaceCount(String Query)
	 	 	 	  	 {
	 	 	 	  	 	  int counting=0;
	 	 	 	  	      String url="Jdbc:Odbc:DSNTesting";
	 	 	 	  	      try
	 	 	 	  	      {
	 	 	 	  	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 	 	 	  	          Connection con=DriverManager.getConnection(url);
	 	 	 	  	          Statement st=con.createStatement();
	 	 	 	  	          ResultSet rs=st.executeQuery(Query);
	 	 	 	  	          if(rs.next())
	 	 	 	  	          {
	 	 	 	  	 			 counting=(int)rs.getInt(2);
	 	 	 	  	    	   }
	 	 	 	    	           con.close();
	 	 	 	  	 	  }
	 	 	 	  	 	  catch(Exception p)
	 	 	 	  	 	  {
	 	 	 	  	 	         System.out.println("exception"+p);
	 	 	 	  	 	  }
	 	 	 	  	 	  return(counting);
	 }*/

	public static String[]getPlaceColumn(String Query,int rec)
	{
		String temp[]=new String[rec];
		String url="Jdbc:Odbc:DSNTesting";
        try
        {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					 	 	 	 	  	          Connection con=DriverManager.getConnection(url);
		 	 	 	 	  	          Statement st=con.createStatement();
		 	 	 	 	  	          st.execute(Query);
		 	ResultSet rs=st.executeQuery(Query);
		 	int i=0;
		 	while(rs.next())
		 	{
				temp[i]=rs.getString(1);
				i++;
			}
		}
		catch(Exception p)
				 	 	 	 	  	 	  {
				 	 	 	 	  	 	         System.out.println("exception"+p);
				 	 	 	 	  	 	  }
	 	 	 	  	 	  return(temp);
					  }
         public static String[]getCountryColumn(String Query,int rec)
		 	{
		 		String temp[]=new String[rec];
		 		String url="Jdbc:Odbc:DSNTesting";
		         try
		         {
		 			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 					 	 	 	 	  	          Connection con=DriverManager.getConnection(url);
		 		 	 	 	 	  	          Statement st=con.createStatement();
		 		 	 	 	 	  	          st.execute(Query);
		 		 	ResultSet rs=st.executeQuery(Query);
		 		 	int i=0;
		 		 	while(rs.next())
		 		 	{
		 				temp[i]=rs.getString(1);
		 				i++;
		 			}
		 		}
		 		catch(Exception p)
		 				 	 	 	 	  	 	  {
		 				 	 	 	 	  	 	         System.out.println("exception"+p);
		 				 	 	 	 	  	 	  }
		 	 	 	 	  	 	  return(temp);
					  }
					  public static String[]getStateColumn(String Query,int rec)
					  		 	{
					  		 		String temp[]=new String[rec];
					  		 		String url="Jdbc:Odbc:DSNTesting";
					  		         try
					  		         {
					  		 			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  		 					 	 	 	 	  	          Connection con=DriverManager.getConnection(url);
					  		 		 	 	 	 	  	          Statement st=con.createStatement();
					  		 		 	 	 	 	  	          st.execute(Query);
					  		 		 	ResultSet rs=st.executeQuery(Query);
					  		 		 	int i=0;
					  		 		 	while(rs.next())
					  		 		 	{
					  		 				temp[i]=rs.getString(1);
					  		 				i++;
					  		 			}
					  		 		}
					  		 		catch(Exception p)
					  		 				 	 	 	 	  	 	  {
					  		 				 	 	 	 	  	 	         System.out.println("exception"+p);
					  		 				 	 	 	 	  	 	  }
					  		 	 	 	 	  	 	  return(temp);
					  }
					  public static String[]getDistrictColumn(String Query,int rec)
					  					  		 	{
					  					  		 		String temp[]=new String[rec];
					  					  		 		String url="Jdbc:Odbc:DSNTesting";
					  					  		         try
					  					  		         {
					  					  		 			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  					  		 					 	 	 	 	  	          Connection con=DriverManager.getConnection(url);
					  					  		 		 	 	 	 	  	          Statement st=con.createStatement();
					  					  		 		 	 	 	 	  	          st.execute(Query);
					  					  		 		 	ResultSet rs=st.executeQuery(Query);
					  					  		 		 	int i=0;
					  					  		 		 	while(rs.next())
					  					  		 		 	{
					  					  		 				temp[i]=rs.getString(1);
					  					  		 				i++;
					  					  		 			}
					  					  		 		}
					  					  		 		catch(Exception p)
					  					  		 				 	 	 	 	  	 	  {
					  					  		 				 	 	 	 	  	 	         System.out.println("exception"+p);
					  					  		 				 	 	 	 	  	 	  }
					  					  		 	 	 	 	  	 	  return(temp);
					  }
					  public static String[]getTalukaColumn(String Query,int rec)
			{
				String temp[]=new String[rec];
				String url="Jdbc:Odbc:DSNTesting";
				 try
				 {
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
														  Connection con=DriverManager.getConnection(url);
											  Statement st=con.createStatement();
											  st.execute(Query);
					ResultSet rs=st.executeQuery(Query);
					int i=0;
					while(rs.next())
					{
						temp[i]=rs.getString(1);
						i++;
					}
				}
				catch(Exception p)
												  {
														 System.out.println("exception"+p);
												  }
								  return(temp);
					  }
					    public static String[]getVillageColumn(String Query,int rec)
					  			{
					  				String temp[]=new String[rec];
					  				String url="Jdbc:Odbc:DSNTesting";
					  				 try
					  				 {
					  					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  														  Connection con=DriverManager.getConnection(url);
					  											  Statement st=con.createStatement();
					  											  st.execute(Query);
					  					ResultSet rs=st.executeQuery(Query);
					  					int i=0;
					  					while(rs.next())
					  					{
					  						temp[i]=rs.getString(1);
					  						i++;
					  					}
					  				}
					  				catch(Exception p)
					  												  {
					  														 System.out.println("exception"+p);
					  												  }
					  								  return(temp);
					  }
             ///////////////////
              public static String[]getRegionalLanguageColumn(String Query,int rec)
			 			{
			 				String temp[]=new String[rec];
			 				String url="Jdbc:Odbc:DSNTesting";
			 				 try
			 				 {
			 					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			 														  Connection con=DriverManager.getConnection(url);
			 											  Statement st=con.createStatement();
			 											  st.execute(Query);
			 					ResultSet rs=st.executeQuery(Query);
			 					int i=0;
			 					while(rs.next())
			 					{
			 						temp[i]=rs.getString(1);
			 						i++;
			 					}
			 				}
			 				catch(Exception p)
			 												  {
			 														 System.out.println("exception"+p);
			 												  }
			 								  return(temp);
					  }
                 //////////////////
                 public static String[]getMediaColumn(String Query,int rec)
				 			 			{
				 			 				String temp[]=new String[rec];
				 			 				String url="Jdbc:Odbc:DSNTesting";
				 			 				 try
				 			 				 {
				 			 					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				 			 														  Connection con=DriverManager.getConnection(url);
				 			 											  Statement st=con.createStatement();
				 			 											  st.execute(Query);
				 			 					ResultSet rs=st.executeQuery(Query);
				 			 					int i=0;
				 			 					while(rs.next())
				 			 					{
				 			 						temp[i]=rs.getString(1);
				 			 						i++;
				 			 					}
				 			 				}
				 			 				catch(Exception p)
				 			 												  {
				 			 														 System.out.println("exception"+p);
				 			 												  }
				 			 								  return(temp);
					  }
					  ////////////////
					  public static String[]getContentColumn(String Query,int rec)
					  				 			 			{
					  				 			 				String temp[]=new String[rec];
					  				 			 				String url="Jdbc:Odbc:DSNTesting";
					  				 			 				 try
					  				 			 				 {
					  				 			 					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  				 			 														  Connection con=DriverManager.getConnection(url);
					  				 			 											  Statement st=con.createStatement();
					  				 			 											  st.execute(Query);
					  				 			 					ResultSet rs=st.executeQuery(Query);
					  				 			 					int i=0;
					  				 			 					while(rs.next())
					  				 			 					{
					  				 			 						temp[i]=rs.getString(1);
					  				 			 						i++;
					  				 			 					}
					  				 			 				}
					  				 			 				catch(Exception p)
					  				 			 												  {
					  				 			 														 System.out.println("exception"+p);
					  				 			 												  }
					  				 			 								  return(temp);
					  }

}

























