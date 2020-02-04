package CommonFunLibrary;

public class Dummy {

	public static void main(String[] args) throws Throwable {
		ERP_Functions erp=new ERP_Functions();
		
		String resultoflaunchapp=erp.lanchAPP("http://webapp.qedge.com/login.php");
		String resultoflogin=erp.login("admin", "master");
		
		 erp.supplier("demosupplier", "demoaddress", "democity", "democountry", "democontactperson", "demophnumber", "demoEmai", resultoflogin, resultoflogin);
		erp.supplier("demosupplier", "demoaddress", "democity", "democountry", "democontactperson", "demophnumber", "demoEmai", resultoflogin, resultoflogin);

	}

}
