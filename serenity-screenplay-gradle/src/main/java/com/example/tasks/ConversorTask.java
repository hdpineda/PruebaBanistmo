package main.java.com.example.tasks;

import main.java.com.example.userinterface.ConversorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Tasks;

public class ConversorTask implements Task {

    
    
  
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(ConversorUI.NEGOCIOS)
        );
    }

    public static ConversorTask with() {
        return Tasks.instrumented(ConversorTask.class);
    }
}