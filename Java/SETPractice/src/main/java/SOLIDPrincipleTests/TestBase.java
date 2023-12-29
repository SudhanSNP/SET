package SOLIDPrincipleTests;

import org.testng.annotations.*;


public class TestBase {
    @BeforeClass
    public void BeforeClass() {
        System.out.println("------------ BEFORE CLASS ------------");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("------------ AFTER CLASS ------------");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("------------ BEFORE TEST ------------");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("------------ AFTER TEST ------------");
    }

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("------------ BEFORE SUITE ------------");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("------------ AFTER SUITE ------------");
    }
}
