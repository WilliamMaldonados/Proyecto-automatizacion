package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InfoUser {

    public static final Target NAME= Target.the("NAME")
            .located(By.id("firstName"));
    public static final Target lAST_NAME = Target.the("lAST_NAME")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("EMAIL")
            .located(By.id("email"));
    public static final Target MONTH = Target.the("MONTH")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target DAY = Target.the("DAY")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target YEAR = Target.the("YEAR")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target BOTON_NEXT= Target.the("BOTON_NEXT")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}


