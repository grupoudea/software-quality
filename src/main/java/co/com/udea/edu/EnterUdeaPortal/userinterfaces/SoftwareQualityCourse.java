package co.com.udea.edu.EnterUdeaPortal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SoftwareQualityCourse {

    public static Target BTN_COURSE_SQC = Target.the("BTN for enter course")
            .locatedBy("(//span[contains(text(),'Calidad de Software')])[2]");

    public static Target BTN_ENTER_VIRTUALT= Target.the("BTN for enter tutorials")
            .locatedBy("(//a//img)[19]");

}
