package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.DataUtest;
import co.com.choucair.certification.proyectobase.userinterface.PageDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class Filldevices implements Task {

    private List<DataUtest> dataUtestList;

    public Filldevices(List<DataUtest>dataUtestList){
        this.dataUtestList=dataUtestList;
    }
    public static Filldevices  ThePage(List<DataUtest> dataUtestList) {
        return Tasks.instrumented(Filldevices.class,dataUtestList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageDevices.CONTAINER_DEVICE),
                Enter.theValue(dataUtestList.get(0).getStrDEVICE()).into(PageDevices.DEVICE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                (Click.on(PageDevices.CONTAINER_MODEL)),
                        Enter.theValue(dataUtestList.get(0).getStrMOVIL()).into(PageDevices.MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                (Click.on(PageDevices.CONTAINER_OS)),
                        Enter.theValue(dataUtestList.get(0).getStrOS()).into(PageDevices.OS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(PageDevices.BOTTON_FN)
        );
    }
}
