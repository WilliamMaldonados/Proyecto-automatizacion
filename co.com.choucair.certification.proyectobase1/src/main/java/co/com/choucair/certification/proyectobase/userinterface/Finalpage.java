package co.com.choucair.certification.proyectobase.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Finalpage {

    public static final Target PASSWORD = Target.the("Password user")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password")
            .located(By.id("confirmPassword"));
    public static final Target CHEKC1 = Target.the("Chek1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHEKC2 = Target.the("Chek2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHEKC3 = Target.the("Chek3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTTON_CONF=Target.the("BOTON COMNFIRM")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));


}
