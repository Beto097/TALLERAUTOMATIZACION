package TallerBCTChoucair.tasks;

import TallerBCTChoucair.userinterface.MedilappLoginPage;
import co.com.choucair.certification.ProyectoBase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Login onThepage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strUser).into(MedilappLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(MedilappLoginPage.INPUT_PASSWORD),
                Click.on(MedilappLoginPage.BTN_INGRESAR));
    }
}
