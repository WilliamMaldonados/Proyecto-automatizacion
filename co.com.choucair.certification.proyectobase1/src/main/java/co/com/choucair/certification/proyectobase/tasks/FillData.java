package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.model.DataUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import co.com.choucair.certification.proyectobase.userinterface.InfoUser;

import javax.naming.Name;



import java.util.List;

import static co.com.choucair.certification.proyectobase.userinterface.InfoUser.*;

public class FillData implements Task {

    private List<DataUtest> dataUtestList;

        public FillData (List<DataUtest> dataUtestList){
        this.dataUtestList = dataUtestList;
    }

    public static FillData ThePage(List<DataUtest> dataUtestList) {
        return Tasks.instrumented(FillData.class, dataUtestList);
    }

    @Override
    public < T extends Actor> void performAs (T actor){
        actor.attemptsTo(Enter.theValue(dataUtestList.get(0).getStrNAME()).into(NAME),
                Enter.theValue(dataUtestList.get(0).getStrLAST_NAME()).into(lAST_NAME),
                Enter.theValue(dataUtestList.get(0).getStrEMAIL()).into(EMAIL),
                SelectFromOptions.byVisibleText(dataUtestList.get(0).getStrMONTH()).from(MONTH),
                SelectFromOptions.byVisibleText(dataUtestList.get(0).getStrDAY()).from(DAY),
             SelectFromOptions.byVisibleText(dataUtestList.get(0).getStrYEAR()).from(YEAR),
                Click.on(BOTON_NEXT)
                );

         }
}
