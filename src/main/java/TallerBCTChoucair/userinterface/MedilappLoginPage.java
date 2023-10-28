package TallerBCTChoucair.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class MedilappLoginPage extends PageObject {

    public static final Target BTN_INGRESAR = Target.the("Boton para inicio de sesion")
            .locatedBy("//button[contains(text(),'ingresar')]");
    public static final Target INPUT_USER = Target.the("Campo usuario")
            .located(By.id("exampleInputEmail_2"));
    public static final Target INPUT_PASSWORD = Target.the("Campo Contrasena")
            .located(By.id("exampleInputpwd_2"));
    public static final Target TEXTO_DASHBOARD = Target.the("Label para verificar que ha ingresado al sistema")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div[5]/div/div[1]/div[1]/h6"));
    public static final Target ALERTA_ERROR = Target.the("Label para verificar login errado")
            .located(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div[1]/h3"));

}
