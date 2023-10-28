package TallerBCTChoucair.tasks;

import TallerBCTChoucair.userinterface.MedilappPacientePage;
import co.com.choucair.certification.ProyectoBase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConsultaPaciente implements Task {

    public ConsultaPaciente() {

    }

    public static ConsultaPaciente pacientes() {
        return Tasks.instrumented(ConsultaPaciente.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MedilappPacientePage.BTN_DESPLEGAR_PACIENTE),
                Click.on(MedilappPacientePage.BTN_MODULO_PACIENTES));
    }
}
