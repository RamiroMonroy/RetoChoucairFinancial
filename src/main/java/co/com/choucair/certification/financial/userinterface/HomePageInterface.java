package co.com.choucair.certification.financial.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageInterface {

public static final Target BUTTON_JOIN_TODAY= Target.the("button_join_today").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
public static final Target INPUT_FIRST_NAME= Target.the("input_first_name").locatedBy("//input[@id='firstName']");
public static final Target INPUT_LAST_NAME= Target.the("input_last_name").locatedBy("//input[@id='lastName']");
public static final Target INPUT_EMAIL= Target.the("input_email").locatedBy("//input[@id='email']");
public static final Target SELECT_MONTH= Target.the("select_month").locatedBy("//select[@id='birthMonth']");
public static final Target SELECT_DAY= Target.the("select_day").locatedBy("//select[@id='birthDay']");
public static final Target SELECT_YEAR= Target.the("select_year").locatedBy("//select[@id='birthYear']");
public static final Target BUTTON_NEXT= Target.the("button_next").locatedBy("//a[@class='btn btn-blue']");
public static final Target INPUT_CITY= Target.the("input_city").locatedBy("//input[@id='city']");
public static final Target INPUT_CITY_CONFIRM= Target.the("input_city_confirm").locatedBy("//span[@class='pac-matched']");
public static final Target COUNTRY= Target.the("country").locatedBy("//div[@class='ui-select']");
public static final Target INPUT_COUNTRY= Target.the("input_country").locatedBy("//div[@class='ui-select']/div/div/input");
public static final Target INPUT_COUNTRY_CONFIRM= Target.the("input_country_confirm").locatedBy("//div[@ng-bind-html='country.name | highlight: $select.search']");
public static final Target INPUT_POSTAL_CODE= Target.the("input_postal_code").locatedBy("//input[@id='zip']");
public static final Target BUTTON_NEXT_DEVICE= Target.the("button_next_device").locatedBy("//a[@class='btn btn-blue pull-right']");
public static final Target SELECT_MOBILE_DEVICE= Target.the("select_mobile_device").locatedBy("//div[@id='mobile-device']/div/div[2]/div/div/span");
public static final Target INPUT_MOBILE_DEVICE= Target.the("input_mobile_device").locatedBy("//div[contains(text(),'{0}')]");
public static final Target SELECT_MODEL= Target.the("select_model").locatedBy("//div[@id='mobile-device']/div[2]/div/div/div/span");
public static final Target INPUT_MODEL= Target.the("input_model").locatedBy("//div[contains(text(),'{0}')]");
public static final Target SELECT_OPERATING_SYSTEM= Target.the("select_operating_system").locatedBy("//div[@id='mobile-device']/div[3]/div/div/div/span");
public static final Target INPUT_OPERATING_SYSTEM= Target.the("input_operating_system").locatedBy("//div[contains(text(),'{0}')]");
public static final Target BUTTON_LAST_STEP= Target.the("button_last_step").locatedBy("//div[@class='pull-right next-step']");
public static final Target INPUT_PASSWORD= Target.the("input_password").locatedBy("//input[@id='password']");
public static final Target INPUT_CONFIRM_PASSWORD= Target.the("input_confirm_password").locatedBy("//input[@id='confirmPassword']");
public static final Target CHECK_BOX_STAY= Target.the("check_box_stay").locatedBy("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']");
public static final Target CHECK_BOX_TERMS= Target.the("check_box_terms").locatedBy("//input[@id='termOfUse']");
public static final Target CHECK_BOX_PRIVACY= Target.the("check_box_privacy").locatedBy("//input[@id='privacySetting']");
public static final Target BUTTON_COMPLETE_SETUP= Target.the("button_complete_setup").locatedBy("//a[@id='laddaBtn']");
public static final Target WELCOME_MESSAGE= Target.the("welcome_message").locatedBy("//div[@class='image-box-header']/h1");
}
