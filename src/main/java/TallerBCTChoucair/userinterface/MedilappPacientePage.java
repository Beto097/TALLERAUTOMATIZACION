package TallerBCTChoucair.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class MedilappPacientePage extends PageObject {

    public static final Target BTN_DESPLEGAR_PACIENTE = Target.the("Boton para desplegar la lista del menú")
            .located(By.xpath("/html/body/div[2]/div[1]/div/ul/li[2]/a"));
    public static final Target BTN_MODULO_PACIENTES = Target.the("Boton para ingresar al módulo de pacientes")
            .locatedBy("//a[contains(text(),'Lista de Pacientes')]");
    public static final Target ENCABEZADO_TABLA_PACIENTES = Target.the("Tabla de pacientes")
            .locatedBy("//*[@id=\"datable_1\"]/thead");
    public static final Target BTN_ACTUALIZA_PACIENTE = Target.the("Boton para actualizar paciente")
            .located(By.id("editPaciente-330"));
    public static final Target CAMPO_TELEFONO = Target.the("Textfield de telefono del paciente")
            .located(By.id("inputtelefono"));
    public static final Target CAMPO_CORREO = Target.the("Textfield de correo del paciente")
            .located(By.xpath("//*[@id=\"editarPacienteModal330\"]/div/div/div[2]/div/div/div/form/div/div[7]/div/input"));
    public static final Target BTN_ACTUALIZA_PACIENTE_GUARDAR = Target.the("Boton para actualizar paciente")
            .located(By.id("btnCrearModal"));

    public static final Target LABEL_ACTUALIZACION_EXITOSA = Target.the("Boton para actualizar paciente")
            .located(By.className("pull-left"));




}
