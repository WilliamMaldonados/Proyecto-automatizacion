package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Address {

    public static final net.serenitybdd.screenplay.targets.Target CITY = Target.the("CITY")
            .located(By.id("city"));
    public static final Target ZIP = Target.the("Postal Code")
            .located(By.id("zip"));
    public static final Target COUNTRY_CONTAINER= Target.the("Country Container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target COUNTRY = Target.the("Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_DEVICES = Target.the("BOTON DEVICE")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
