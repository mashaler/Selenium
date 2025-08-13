package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class WidgetsPage extends HomePage {
    private By selectMenuItem =By.xpath("//li[@id='item-8']/span[text()='Select menu']");
    
    public SelectMenuPage selectMenuPage () {
        scrollToElement(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
        }
}