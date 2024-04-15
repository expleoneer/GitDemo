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

    @Test
    public void testcase1(){
        System.out.println("testcase1");
    }

    @Test
    public void testcase2(){
        System.out.println("testcase2");
    }

    @Test
    public void testcase3(){
        System.out.println("testcase3");
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
