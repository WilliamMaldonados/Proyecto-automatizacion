package co.com.choucair.certification.proyectobase.tasks;
import co.com.choucair.certification.proyectobase.userinterface.UtestPage;
import  net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Click;

public class Abrir implements Task {

    private UtestPage Page;

    public static Abrir Page(){
         return Tasks.instrumented(Abrir.class);
    }
    @Override

    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(Page),
                Click.on(UtestPage.JOIN));
    }
}
