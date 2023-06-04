
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
    @Description("Check the search button")
    public void checkFoodButtonTest() {
        webElementActions.click(titlePage.foodButton);
        Assert.assertEquals(titlePage.foodButton.getText(), "ЕДА");
    }

    @Test
    @Description("Check that user can click delivery button in menu link")
    public void checkMenuLinkTest() {
        webElementActions.moveToElement(titlePage.menuLink);
        webElementActions.pause(3000);
        webElementActions.click(titlePage.deliveryBtn);
        Assert.assertTrue(titlePage.deliveryBtn.isEnabled());
    }
    @Test
    public void sliderTest(){

    }
}
