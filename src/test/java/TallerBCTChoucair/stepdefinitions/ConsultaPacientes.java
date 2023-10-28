package TallerBCTChoucair.stepdefinitions;

import TallerBCTChoucair.userinterface.MedilappPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConsultaPacientes implements Task {
    private MedilappPage medilappPage;

    public static ConsultaPacientes pacientes() {
        return Tasks.instrumented(ConsultaPacientes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();

    }
}
