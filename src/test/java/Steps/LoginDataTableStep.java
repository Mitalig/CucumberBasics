package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashwin on 28/12/16.
 */
 public class LoginDataTableStep {


    @And("^I enter following details$")
    public void iEnterFollowingDetails(DataTable table) throws Throwable {

       /* List<List<String>> data=table.raw();

        System.out.println("The user name is "+data.get(1).get(0));
        System.out.println("The password is "+data.get(1).get(1));
*/

        List<Users> user=new ArrayList<Users>();
        user=table.asList(Users.class);

        for(Users users:user) {

            System.out.println("The value of userName is"+users.username);
            System.out.println("The value of password is"+users.password);

        }

    }


    public class Users {

        public String username;
        public String password;


        public Users(String username, String password) {
            this.username = username;
            this.password = password;
        }


    }

}



