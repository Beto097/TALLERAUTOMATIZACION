package TallerBCTChoucair.questions;

import TallerBCTChoucair.userinterface.MedilappPacientePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerExitoso implements Question<Boolean> {

    private String question;

    public AnswerExitoso(String question) {
        this.question = question;
    }

    public static AnswerExitoso toThe(String question) {
        return new AnswerExitoso(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String actualizacionExitosa= Text.of(MedilappPacientePage.LABEL_ACTUALIZACION_EXITOSA).viewedBy(actor).asString();
        if (question.equals(actualizacionExitosa)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
