package TallerBCTChoucair.stepdefinitions;

import TallerBCTChoucair.model.MedilappData;
import TallerBCTChoucair.questions.AnswerExitoso;
import TallerBCTChoucair.tasks.ActualizaPaciente;
import TallerBCTChoucair.tasks.ConsultaPaciente;
import TallerBCTChoucair.userinterface.MedilappPacientePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

public class PacientesStepDefinitions {
    @When("^ingreso al modulo de pacientes$")
    public void ingresoAlModuloDePacientes(){
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultaPaciente.pacientes());
    }

    @Then("^el usuario deberia ver los siguientes campos de encabezados en pantalla$")
    public void elUsuarioDeberiaVerLosSiguientesCamposDeEncabezadosEnPantalla(List<String> encabezado_tabla) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(MedilappPacientePage.ENCABEZADO_TABLA_PACIENTES)
                .textValues().containsElementsFrom(encabezado_tabla));
    }

    @Then("^Ingreso a la opcion de actualizar paciente$")
    public void ingresoALaOpcionDeActualizarPaciente() {

    }

    @Then("^Ingreso a la opcion de actualizar paciente y modifico los datos$")
    public void ingresoALaOpcionDeActualizarPacienteYModificoLosDatos(List<MedilappData> medilappData) {
        OnStage.theActorInTheSpotlight().attemptsTo(ActualizaPaciente.actualiza(medilappData.get(0).getStrTelefono(),medilappData.get(0).getStrCorreo()));
    }

    @And("^se debe mostrar un mensaje de modificación exitosa$")
    public void seDebeMostrarUnMensajeDeModificacionExitosa(List<MedilappData> medilappData) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(AnswerExitoso.toThe(medilappData.get(0).getStrExitoso())));
    }
}
