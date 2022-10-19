package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.Openup;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;



public class ChoucairproyectobaseStepDefinitions {
@Before
public void setStage(){  OnStage.setTheStage (new OnlineCast());}




    @Given("^than Diana wants to learn automation at the academy Choucair$")
    public void thanDianaWantsToLearnAutomationAtTheAcademyChoucair() {

    }


    @When("^she search for the course Recursos Automatizacion Bancolombia on the Choucair Academy Platform$")
    public void sheSearchForTheCourseRecursosAutomatizacionancolombiaOnTheChoucairAcademyPlatform() {


    }

    @Then("^she finds the course called resuorces Recursos Automatizacion Bancolombia$")
  public void sheFindsTheCourseCalledResuorcesRecursosAutomatizacionBancolombia() {
        System.out.println("then");

  }
    }