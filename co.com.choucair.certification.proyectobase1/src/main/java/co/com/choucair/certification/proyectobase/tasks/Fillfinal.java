package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.model.DataUtest;

import co.com.choucair.certification.proyectobase.userinterface.Finalpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Fillfinal implements Task {


    private List<DataUtest> dataUtestList;


    public  Fillfinal (List<DataUtest> dataUtestList) {
        this.dataUtestList=dataUtestList;
    }

    public static Fillfinal Thepage(List<DataUtest> dataUtestList) {
        return Tasks.instrumented(Fillfinal.class,dataUtestList);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataUtestList.get(0).getStrPASSWORD()).into(Finalpage.PASSWORD),
                Enter.theValue(dataUtestList.get(0).getStrPASSWORD()).into(Finalpage.CONFIRM_PASSWORD),
                Click.on(Finalpage.CHEKC1),
                Click.on(Finalpage.CHEKC2),
                Click.on(Finalpage.CHEKC3),
                Click.on(Finalpage.BOTTON_CONF)
        );
    }

}