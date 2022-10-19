package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Login implements Task {
    public static  Login onThepage(){
        return Tasks.instrumented(Login.class);


}
@Override

public < T extends Actor> void performAs(T actor){

    }
}
