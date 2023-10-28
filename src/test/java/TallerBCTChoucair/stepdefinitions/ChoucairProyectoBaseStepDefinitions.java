package TallerBCTChoucair.stepdefinitions;

import co.com.choucair.certification.ProyectoBase.model.AcademyChoucairData;
import TallerBCTChoucair.questions.Answer;
import TallerBCTChoucair.tasks.Login;
import TallerBCTChoucair.tasks.OpenUp;
import co.com.choucair.certification.ProyectoBase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairProyectoBaseStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
//HE ELIMINADO LAS TILDES
    //NO TENGO ACCESO AL CURSO DEL EJEMPLO (USE METODOLOGIA BANCOLOMBIA)

    @Given("^that Rose wants to learn automation at the academy Choucair$")
    public void thatBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(),Login.
                onThepage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }

                                    //Guías Técnicas - Analista Financial
    @When("^she search for the course on the Choucair academy platform$")
    public void heSearchForTheCourseMetodologíaBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }
                                    //Guías Técnicas - Analista Financia
    @Then("^she finds the course$")
    public void heFindsTheCourseCalledResourcesMetodologíaBancolombia(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}
