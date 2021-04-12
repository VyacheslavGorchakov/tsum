package ru.tsum.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ru.tsum.data.ClientData;
import ru.tsum.data.ClientProvider;
import ru.tsum.site_elements.steps.ClientIdentificationSteps;

import static ru.tsum.site_elements.steps.ClientIdentificationSteps.Message.PASSWORD_MUST_BE_LONGER_8;

@RunWith(SerenityRunner.class)
public class PasswordRegistrationUnvalidTest {

    @Managed
    private WebDriver driver;

    @Steps
    private ClientIdentificationSteps clientIdentificationSteps;

    private final ClientData generatedClient;

    {
        generatedClient = ClientProvider.generateClient();
        generatedClient.setPassword("1234567");
    }

    @WithTag("7")
    @Test
    public void registrationEmailUnvalid() {
        clientIdentificationSteps.registration(generatedClient);
        clientIdentificationSteps.checkMessage(PASSWORD_MUST_BE_LONGER_8);
    }
}
