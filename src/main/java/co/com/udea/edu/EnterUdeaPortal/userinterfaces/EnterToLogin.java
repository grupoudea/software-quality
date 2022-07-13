package co.com.udea.edu.EnterUdeaPortal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EnterToLogin {

    public static final Target BTN_STUDENT = Target.the("BTN Student")
            .locatedBy("(//li//a)[15]");

    public static final Target BTN_ENTER_PLATFORM = Target.the("BTN enter to platform")
            .locatedBy("(//div[@class='elementor-widget-container']//a)[4]");

    public static final Target BTN_SCROLL = Target.the("BTN allow make to scroll")
            .locatedBy("(//div[@class='elementor-widget-container']//a)[2]");
}
