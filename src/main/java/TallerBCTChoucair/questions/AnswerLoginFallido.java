package TallerBCTChoucair.questions;

import TallerBCTChoucair.userinterface.MedilappLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerLoginFallido implements Question<Boolean> {

    private String question;

    public AnswerLoginFallido(String question) {
        this.question = question;
    }

    public static AnswerLoginFallido toThe(String question) {
        return new AnswerLoginFallido(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String errorLogin= Text.of(MedilappLoginPage.ALERTA_ERROR).viewedBy(actor).asString();
        if (question.equals(errorLogin)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
