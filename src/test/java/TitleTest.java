
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest extends BaseTest {
    @Test
    @Description("Check logo name on the title page")
    public void checkLogoNameTest() {

        Assert.assertTrue(titlePage.logoName.isDisplayed());
    }
    @Test
    @Description("Check name")
    public void checkNameTest(){
        System.out.println("zhyldyz");
    @Test
    @Description("Just check git commands")
    public void get(){
        System.out.println("Aigerim");
    }

}
