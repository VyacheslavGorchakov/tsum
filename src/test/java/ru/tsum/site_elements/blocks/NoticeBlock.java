package ru.tsum.site_elements.blocks;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NoticeBlock extends PageObject {

    private By noticeText = By.xpath("//notice//span");

    public void checkNoticeText(String message) {
        waitForCondition()
                .until(ExpectedConditions.textToBe(noticeText, message));
    }
}
