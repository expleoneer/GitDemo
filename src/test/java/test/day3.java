package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

    // The scope is only within the class defined in the xml file
    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before class methods get executed");
    }
    
    // The scope is only within the class defined in the xml file
    @AfterClass
    public void AfterClass(){
        System.out.println("After Class methods get executed");
    }

    // is always called before every Testmethod of the testclass
    @BeforeMethod
    public void BeforeEvery(){
        System.out.println("Im called before every method in the day3 testclass");
    }

    // is always called after every Testmethod of the testclass
    @AfterMethod
    public void AfterEvery(){
        System.out.println("Im called after every method in the day3 testclass");
    }    

    @Test(groups={"Smoke"})
    public void WebloginHomeLoan(){
        System.out.println("WebloginHomeLoan");
    }

    // For each Set of LoginData provided by the dataProvider the method gets called once
    @Test(dataProvider = "GetData")
    public void MobileLoginHomeLoan(String username, String password){
        System.out.println("MobileLoginHomeLoan");
        System.out.println("Username:" + username);
        System.out.println("password: " + password);
    }

    @Parameters({"URL", "APIKey/username"})
    @Test
    public void LoginAPIHomeLoan(String url, String key){
        System.out.println("LoginAPIHomeLoan: " + url);
        System.out.println("Username: " + key);
    }

    // Defines a DataSet that can be used in methods within the respective class
    @DataProvider
    public Object GetData(){
        Object[][] data = new Object[3][2];

        // 1st combination - username & password
        data[0][0] = "firstsetusername";
        data[0][1] = "firstsetpassword";
        // 2st combination - username & password, no credit history
        data[1][0] = "secondsetusername";
        data[1][1] = "secondsetpassword";
        // 3st combination - username & password, credit history
        data[2][0] = "thirdsetusername";
        data[2][1] = "thirdsetpassword";

        return data;
    }
}
