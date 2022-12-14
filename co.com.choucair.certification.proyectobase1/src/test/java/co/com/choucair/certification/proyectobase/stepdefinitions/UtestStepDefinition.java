package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.model.DataUtest;
import co.com.choucair.certification.proyectobase.questions.Responder;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class UtestStepDefinition {

    @Before

    @Given("^than william want register in utest$")
    public void thanWilliamWantRegisterInUtest() throws Exception {
        OnStage.theActorCalled("william").wasAbleTo(Abrir.Page());
          }



    @When("^he enters the data into the form$")
    public void heEntersTheDataIntoTheForm(List<DataUtest> dataUtestList)throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FillData.ThePage(dataUtestList), FillAddress.ThePage(dataUtestList),
                Filldevices.ThePage(dataUtestList), Fillfinal.Thepage(dataUtestList)
        );

    }

    @Then("^registration is complete when we see the complete setup button$")
    public void registrationIsCompleteWhenWeSeeTheCompleteSetupButton(List<DataUtest> dataUtestList) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.alos(dataUtestList)));


    }

}
