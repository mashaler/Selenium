package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

public class SelectMenuPage extends WidgetsPage {
    private By standardMultiSelect  = By.id("cars");

    public void selectStandardMulti() {
        Select select = new select(find(standardMultiSelect));
        select.selectBy
    }
}
