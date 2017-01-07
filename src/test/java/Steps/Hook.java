package Steps;

import Base.BaseUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by ashwin on 07/01/17.
 */
public class Hook extends BaseUtils {

    private BaseUtils base;

    public Hook(BaseUtils base) {
        this.base = base;
    }


    @Before
    public void intializeTest()  {


        System.out.println("Initialize the test");
        base.stepInfo="FirefoxDriver";
    }

    @After
    public void tearDownTest(Scenario scenario)  {



        if(scenario.isFailed()==true)  {

            System.out.println("Take Screenshot");
        }


    }
}
