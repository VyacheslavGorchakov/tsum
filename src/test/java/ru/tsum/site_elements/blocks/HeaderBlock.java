package ru.tsum.site_elements.blocks;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderBlock extends PageObject {

    private By lkLink = By.xpath("//a[@rel='nofollow']");

    public void checkUserName(String name) {
        waitForCondition()
                .until(ExpectedConditions.textToBe(lkLink, name));
    }

}
