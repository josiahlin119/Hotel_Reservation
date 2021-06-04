package model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    protected String firstName;
    protected String lastName;
    protected String email;

    public Customer(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        emailValidation();
    }
    @Override
    public String toString() {
        return "The information of this customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public void emailValidation(){
        String emailReg = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailReg);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()) throw new IllegalArgumentException("The format of your email isn't correct");

    }
}
