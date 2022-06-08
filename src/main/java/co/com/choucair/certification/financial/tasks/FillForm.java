package co.com.choucair.certification.financial.tasks;

import co.com.choucair.certification.financial.model.DataUser;
import co.com.choucair.certification.financial.util.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static co.com.choucair.certification.financial.userinterface.HomePageInterface.*;
import static co.com.choucair.certification.financial.util.Constants.CONSTANTS_TIME;

public class FillForm implements Task {

    private DataUser dataUser;

    public FillForm(DataUser dataUser) {
        this.dataUser = dataUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_JOIN_TODAY));
        actor.attemptsTo(Enter.theValue(dataUser.getFirstName()).into(INPUT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(dataUser.getLastName()).into(INPUT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(dataUser.getEmail()).into(INPUT_EMAIL));
        actor.attemptsTo(SelectFromOptions.byVisibleText(dataUser.getMonth()).from(SELECT_MONTH));
        actor.attemptsTo(SelectFromOptions.byVisibleText(dataUser.getDay()).from(SELECT_DAY));
        actor.attemptsTo(SelectFromOptions.byVisibleText(dataUser.getYear()).from(SELECT_YEAR));
        actor.attemptsTo(Click.on(BUTTON_NEXT));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Enter.theValue(dataUser.getCity()).into(INPUT_CITY));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Click.on(INPUT_CITY_CONFIRM));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Enter.theValue(dataUser.getPostalCode()).into(INPUT_POSTAL_CODE));
        actor.attemptsTo(Click.on(COUNTRY));
        actor.attemptsTo(Enter.theValue(dataUser.getCountry()).into(INPUT_COUNTRY));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Click.on(INPUT_COUNTRY_CONFIRM));
        actor.attemptsTo(Click.on(BUTTON_NEXT_DEVICE));
        actor.attemptsTo(Click.on(SELECT_MOBILE_DEVICE));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Click.on(INPUT_MOBILE_DEVICE.of(dataUser.getMobileDevice())));
        actor.attemptsTo(Click.on(SELECT_MODEL));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Click.on(INPUT_MODEL.of(dataUser.getModel())));
        actor.attemptsTo(Click.on(SELECT_OPERATING_SYSTEM));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Click.on(INPUT_OPERATING_SYSTEM.of(dataUser.getOperatingSystem())));
        actor.attemptsTo(Click.on(BUTTON_LAST_STEP));
        actor.attemptsTo(Enter.theValue(dataUser.getPassword()).into(INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue(dataUser.getConfirmPassword()).into(INPUT_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(CHECK_BOX_STAY));
        actor.attemptsTo(Click.on(CHECK_BOX_TERMS));
        actor.attemptsTo(Click.on(CHECK_BOX_PRIVACY));
        actor.attemptsTo(Click.on(BUTTON_COMPLETE_SETUP));
    }
    public static FillForm fillOut(DataUser dataUser){
        return Tasks.instrumented(FillForm.class,dataUser);
    }
}
