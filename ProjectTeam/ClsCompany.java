class ClsCompany
{
     private int CompanyID;
     private String CompanyName;
     private String HeadOffice;
     private String eMail;
     private String WebPage;
     private String FaceBookID;
     private String TwitterID;
     private String InstaID;
     private String FaxNo;
     private String TollFree;
     private String ContactNo;
     private String OwnerName;
     private int EstablishedYear;

     public void setCompanyID(int value)
     {
          CompanyID=value;
      }
      public int getCompanyID()
      {
          return(CompanyID);
       }
       public void setCompanyName(String value)
       {
		   CompanyName=value;
	   }
	   public String getCompanyName()
	   {
		   return(CompanyName);
	   }
	   public void setHeadOffice(String value)
	   {
		   HeadOffice=value;
	   }
	   public String getHeadOffice()
	   {
		   return(HeadOffice);
	   }
	   public void seteMail(String value)
	   {
		   eMail=value;
	   }
	   public String geteMail()
	   {
		   return(eMail);
	   }
	   public void setWebPage(String value)
	   {
		   WebPage=value;
	   }
	   public String getWebPage()
	   {
		   return(WebPage);
	   }
	   public void setFaceBookID(String value)
	   {
		   FaceBookID=value;
	   }
	   public String getFaceBookID()
	   {
		   return(FaceBookID);
	   }
	   public void setTwitterID(String value)
	   {
		   TwitterID=value;
	   }
	   public String getTwitterID()
	   {
		   return(TwitterID);
	   }
	   public void setInstaID(String value)
	   {
		   InstaID=value;
	   }
	   public String getInstaID()
	   {
		   return(InstaID);
	   }
	   public void setFaxNo(String value)
	   {
		   FaxNo=value;
	   }
	   public String getFaxNo()
	   {
		   return(FaxNo);
	   }
	   public void setTollFree(String value)
	   {
		   TollFree=value;
	   }
	   public String getTollFree()
	   {
		   return(TollFree);
	   }
	   public void setContactNo(String value)
	   {
		   ContactNo=value;
	   }
	   public String getContactNo()
	   {
		    return(ContactNo);
		}
		public void setOwnerName(String value)
		{
			OwnerName=value;
		}
		public String getOwnerName()
		{
			return(OwnerName);
		}
		public void setEstablishedYear(int value)
		{
			EstablishedYear=value;
		}
		public int getEstablishedYear()
		{
			return(EstablishedYear);
		}
		public static void showCompany(ClsCompany temp)
		{
			  System.out.println("CompanyID         "+temp.getCompanyID());
			  System.out.println("CompanyName       "+temp.getCompanyName());
			  System.out.println("HeadOffice        "+temp.getHeadOffice());
			  System.out.println("eMail             "+temp.geteMail());
			  System.out.println("WebPage           "+temp.getWebPage());
			  System.out.println("FaceBookID        "+temp.getFaceBookID());
			  System.out.println("TwitterID         "+temp.getTwitterID());
			  System.out.println("InstaID           "+temp.getInstaID());
			  System.out.println("FaxNo             "+temp.getFaxNo());
			  System.out.println("TollFree          "+temp.getTollFree());
			  System.out.println("ContactNo         "+temp.getContactNo());
			  System.out.println("OwnerName         "+temp.getOwnerName());
			  System.out.println("EstablishedYear   "+temp.getEstablishedYear());
		  }
		  public static void main(String args[])
		  {
			  ClsCompany obj=new ClsCompany();

			  obj.setCompanyID(1);
			  obj.setCompanyName("TCS");
			  obj.setHeadOffice("Pune");
			  obj.seteMail("tcs12@gmail.com");
			  obj.setWebPage("www.tcs.com");
			  obj.setFaceBookID("FB_tcs12");
			  obj.setTwitterID("TW_tcs12");
			  obj.setInstaID("tcs12");
			  obj.setFaxNo("323 765 2345");
			  obj.setTollFree("9767634551");
			  obj.setContactNo("9765423267");
			  obj.setOwnerName("Ratan Tata");
			  obj.setEstablishedYear(1965);

			  ClsCompany.showCompany(obj);
			  ClsCompany.addNewCompany(obj);
		  }
		  public static void addNewCompany(ClsCompany temp)
		  {
			  DlsCompany.addNewCompany(temp);
		  }



}


















