package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

    @Test(groups={"Smoke"})
    public void Ploan(){
        System.out.println("day2");
    }

    // The scope of @BeforeTest is the within the <test></test> of the xml file
    @BeforeTest
    public void Prerequisite(){
        System.out.println("Im going to execute first");
        System.out.println("Update1");
        System.out.println("Update2");
        System.out.println("Update3");

        System.out.println("Update 4");
        System.out.println("Update 5");
        System.out.println("Update 6");
        System.out.println("Update 7");
    }

    // The scope of @BeforeSuite is the entire xml file
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before Suite");

        System.out.println("Update 4");
        System.out.println("Update 5");
        System.out.println("Update 6");
        System.out.println("Update 7");
    }

    // The scope of @AfterSuite also is the entire xml file
    @AfterSuite
    public void AfterSuite(){
        System.out.println("After Suite");
    }
}
