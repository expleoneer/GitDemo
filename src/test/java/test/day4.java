package test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
    
    // The test waits xx seconds before it will fail --> used for API testing, when responses are expected to be slower 
    @Test(timeOut = 4000)
    public void WebLoginCarLoan(){
        System.out.println("WebLoginCarLoan");
    }
    
    @Test(groups={"Smoke"})
    public void MobileLoginCarLoan(){
        System.out.println("MobileLoginCarLoan");
    }

    @Parameters({"URL"})
    @Test(groups={"Smoke"})
    public void LoginCarLoanSmoke(String url){
        System.out.println("LoginCarLoanSmoke: " + url);
    }

    // The LoginAPICarLoan() now depends on the successfull execution of the WebLoginCarLoan()
    @Parameters({"URL"})
    @Test(dependsOnMethods = {"WebLoginCarLoan"})
    public void LoginAPICarLoan(String url){
        System.out.println("LoginAPICarLoan: " + url);
    }
}
