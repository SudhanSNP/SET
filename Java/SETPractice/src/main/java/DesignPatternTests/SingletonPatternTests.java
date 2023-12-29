package DesignPatternTests;

import DesignPattern.SingletonPattern.IPrintMessage;
import DesignPattern.SingletonPattern.PrintMessage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingletonPatternTests extends TestBase {
    IPrintMessage printMessage1;
    IPrintMessage printMessage2;

    @BeforeMethod(groups = {"design-pattern"})
    public void SetUp() {
        printMessage1 = PrintMessage.GetPrintMessage();
        printMessage2 = PrintMessage.GetPrintMessage();
    }

    @Test(groups = {"design-pattern"})
    @Parameters({"msg1", "msg2"})
    public void SingletonPattern(String msg_1, String msg_2) {
        printMessage1.Print(msg_1);
        printMessage2.Print(msg_2);

        Assert.assertEquals(printMessage1.hashCode(), printMessage2.hashCode());
    }
}
