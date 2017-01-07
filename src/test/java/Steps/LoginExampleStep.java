package Steps;

import Base.BaseUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.testng.Assert;

/**
 * Created by ashwin on 07/01/17.
 */
public class LoginExampleStep extends BaseUtils {

    private BaseUtils base;

    public LoginExampleStep(BaseUtils base) {
        this.base = base;
    }

    @And("^I enter ([^\"]*) and ([^\"]*) details$")
    public void iEnterUsernameAndPasswordDetails(String username, String password) throws Throwable {

        System.out.println("The userName is "+username);
        System.out.println("The password is "+password);

        System.out.println("The driver is"+base.stepInfo);

        Assert.assertEquals(username,password);


    }
}
