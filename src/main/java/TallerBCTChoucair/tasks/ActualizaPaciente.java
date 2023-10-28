package TallerBCTChoucair.tasks;

import TallerBCTChoucair.userinterface.MedilappPacientePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ActualizaPaciente implements Task {

    private String strTelefono;
    private String strCorreo;

    public ActualizaPaciente(String strTelefono, String strCorreo) {
        this.strTelefono = strTelefono;
        this.strCorreo = strCorreo;
    }

    public static ActualizaPaciente actualiza(String strTelefono, String strCorreo) {
        return Tasks.instrumented(ActualizaPaciente.class,strTelefono,strCorreo);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MedilappPacientePage.BTN_ACTUALIZA_PACIENTE),
                Enter.theValue(strTelefono).into(MedilappPacientePage.CAMPO_TELEFONO),
                Enter.theValue(strCorreo).into(MedilappPacientePage.CAMPO_CORREO),
                Click.on(MedilappPacientePage.BTN_ACTUALIZA_PACIENTE_GUARDAR));
    }
}
