package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox() {
        var formspage = homePage.goToForms().clickPracticeForm();
        formspage.clickSportsCheckbox();
        formspage.clickReadingCheckbox();
        formspage.clickMusicCheckbox();
        formspage.unclickReadingCheckbox();

        boolean isReadingCheckboxSelected = formspage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected, "\n Reading Checkbox is Selected \n");
    }
}
