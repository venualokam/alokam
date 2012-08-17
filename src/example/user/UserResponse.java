package example.user;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 22 Jun, 2011
 * Time: 11:07:54 AM
 */
public class UserResponse {

    private String firstName;
    private String lastName;
    private String userName;
    private String emailAddress;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


}
