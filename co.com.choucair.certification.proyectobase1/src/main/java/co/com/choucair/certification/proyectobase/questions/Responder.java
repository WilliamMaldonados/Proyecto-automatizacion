package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.model.DataUtest;
import co.com.choucair.certification.proyectobase.userinterface.Finalpage;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;


public class Responder implements Question <Boolean>{

    private List<DataUtest>dataUtestList;

    public Responder(List<DataUtest>dataUtestList){
        this.dataUtestList=dataUtestList;
    }
    public static Responder alos(List<DataUtest> dataUtestList) {
        return new Responder(dataUtestList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String BOTTON_CONF = Text.of(Finalpage.BOTTON_CONF).viewedBy(actor).asString();
        return dataUtestList.get(0).getStrFinalText().equals(BOTTON_CONF);
    }
}
