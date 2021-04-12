package ru.tsum.site_elements.steps;

import net.thucydides.core.annotations.Step;
import ru.tsum.data.ClientData;
import ru.tsum.site_elements.blocks.HeaderBlock;
import ru.tsum.site_elements.blocks.NoticeBlock;
import ru.tsum.site_elements.pages.LoginPage;
import ru.tsum.site_elements.pages.RegistrationPage;

public class ClientIdentificationSteps {

    private LoginPage loginPage;
    private RegistrationPage registrationPage;
    private HeaderBlock headerBlock;
    private NoticeBlock noticeBlock;

    @Step
    public void authorisation(ClientData client) {
        loginPage.open();
        loginPage.setEmail(client.getLogin());
        loginPage.setPassword(client.getPassword());
        loginPage.submit();
    }

    @Step
    public void registration(ClientData client) {
        registrationPage.open();
        registrationPage.setEmail(client.getLogin());
        registrationPage.setPassword(client.getPassword());
        registrationPage.submit();
    }

    @Step
    public void checkAuthorization(ClientData client) {
        headerBlock.checkUserName(client.getLogin());
    }

    @Step
    public void checkMessage(Message message) {
        noticeBlock.checkNoticeText(message.getText());
    }

    public enum Message{
        SUCCESSFUL_REGISTRATION("Успешная регистрация"),
        PASSWORD_MUST_BE_LONGER_8("Пароль должен быть не менее 8 символов длиной"),
        INCORRECT_EMAIL("Указан некорректный email");

        private String message;
        Message(String message){
            this.message = message;
        }
        public String getText(){ return message;}
    }
}
