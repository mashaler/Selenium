package part2.com.sauceddemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.sauceddemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsheaderIsDisplayed() {
        ProductsPage productsPage = loginPage.
                logintoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products header is Not Displayed\n");
    }
}
