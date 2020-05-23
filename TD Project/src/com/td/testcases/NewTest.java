package com.td.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;
import com.td.pages.bankaccounts;

public class NewTest extends browserlaunch
{
	
	
@Test

public void bankingaccountstest()
{
	 try {
		 bankaccounts ba = new bankaccounts(driver);
         ba.producthover();
         ba.Scrollpage();
         ba.openaccountclicking();
         Thread.sleep(1000);
         ba.cancelapplication();
         Thread.sleep(5000);
         ba.SwitchCancelWindow();
         ba.ClickOnCancel();
        }
     catch(Exception e)
	 {
         Assert.fail("Should not have thrown any exception" + e.getStackTrace());
     }
	

}
 
}
