package co.com.choucair.certification.financial.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certification.financial.userinterface.HomePageInterface.WELCOME_MESSAGE;

public class ValidateMessage implements Question {
    private String message;

    public ValidateMessage(String message) {
        this.message = message;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return WELCOME_MESSAGE.resolveFor(actor).getText().equals(message);
    }

    public static ValidateMessage validate(String message){
        return new ValidateMessage(message);
    }
}
