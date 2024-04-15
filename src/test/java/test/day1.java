package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

    // Test will be skipped safely with this annotation, to not trigger errors of the framework that have not been resolved yet
    @Test(enabled = false)
    public void Demo(){
        System.out.println("Hello");
    }

    @BeforeSuite(groups = {"Smoke"})
    public void BeforeSuite3(){
        System.out.println("------------------------");
    }

    @Parameters({"URL"})
    @Test
    public void SecondTest(String url){
        System.out.println("Bye: " + url);
    }

    // The scope of @AfterTest also is the within the <test></test> of the xml file
    @AfterTest
    public void Postrequisite(){
        System.out.println("I will execute last");
    }
}
