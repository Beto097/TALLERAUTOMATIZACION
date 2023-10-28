package TallerBCTChoucair.questions;

import TallerBCTChoucair.userinterface.MedilappLoginPage;
import co.com.choucair.certification.ProyectoBase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String strLogin= Text.of(MedilappLoginPage.TEXTO_DASHBOARD).viewedBy(actor).asString();
        if (question.equals(strLogin)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
