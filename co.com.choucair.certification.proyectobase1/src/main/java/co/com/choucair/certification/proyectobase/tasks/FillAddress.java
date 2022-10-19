package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.DataUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import co.com.choucair.certification.proyectobase.userinterface.Address;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillAddress implements Task {
    private List<DataUtest> dataUtestList;
    public FillAddress(List<DataUtest> dataUtestList) {
        this.dataUtestList = dataUtestList;
    }

       public static FillAddress ThePage(List<DataUtest> dataUtestList) {
        return Tasks.instrumented(FillAddress.class,dataUtestList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Enter.theValue(dataUtestList.get(0).getStrCITY()).into(Address.CITY),
        Hit.the(Keys.ARROW_DOWN).into(Address.CITY),
        Hit.the(Keys.ENTER).into(Address.CITY),
        Enter.theValue(dataUtestList.get(0).getStrZIP()).into(Address.ZIP),
                Click.on(Address.COUNTRY_CONTAINER),
                Enter.theValue(dataUtestList.get(0).getStrCOUNTRY()).into(Address.COUNTRY).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
        Click.on(Address.BOTON_DEVICES)
        );
    }
}



