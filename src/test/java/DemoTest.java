import API.Helper;
import UI.dataProvider.ConfigReader;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test(enabled = true,description = "check sum of two numbers")
    @Description("Check sum of two numbers")
    @Severity(SeverityLevel.CRITICAL)
    public void sumTwoNumbersTest(){
        Assert.assertEquals(Helper.sum(4,8),11);

    }
   @Test
    public void getNamba(){
       ConfigReader.getProperty("url1");
   }
}
