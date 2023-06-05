
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest extends BaseTest {
    @Test
    @Description("Check logo name on the title page")
    public void checkLogoNameTest() {

        Assert.assertTrue(titlePage.logoName.isDisplayed());
    }

}
