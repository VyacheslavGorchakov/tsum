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

import static ru.tsum.site_elements.steps.ClientIdentificationSteps.Message.SUCCESSFUL_REGISTRATION;

@RunWith(SerenityRunner.class)
public class EmailRegistrationValidTest {

    @Managed
    private WebDriver driver;

    @Steps
    private ClientIdentificationSteps clientIdentificationSteps;

    private final ClientData generatedClient = ClientProvider.generateClient();

    @WithTag("5")
    @Test
    public void registrationValidEmail() {
        clientIdentificationSteps.registration(generatedClient);
        clientIdentificationSteps.checkMessage(SUCCESSFUL_REGISTRATION);
    }

}
