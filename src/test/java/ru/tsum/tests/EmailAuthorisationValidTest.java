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

@RunWith(SerenityRunner.class)
public class EmailAuthorisationValidTest {

    @Managed
    private WebDriver driver;

    @Steps
    private ClientIdentificationSteps clientIdentificationSteps;

    private final ClientData registeredClient = ClientProvider.registeredClient();

    @WithTag("1")
    @Test
    public void authorisationValidEmail() {
        clientIdentificationSteps.authorisation(registeredClient);
        clientIdentificationSteps.checkAuthorization(registeredClient);
    }
}
