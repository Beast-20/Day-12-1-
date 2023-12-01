package demo1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{
    String id = null;
    String first_name = null;
    String last_name = null;
    String email_id = null;
    String phone_number = null;
    String password = null;

    public User(String id,String first_name, String last_name, String email_id, String phone_number, String password){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_id = email_id;
        this.phone_number = phone_number;
        this.password = password;
    }

    public User(String email){
           this.email_id = email;
    }

    public void first_name_checker() throws CustomException {
        String first_name_regex = "[A-Z]{1}+[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(first_name_regex);
        Matcher matcher = pattern.matcher(first_name);
        if (!matcher.matches()) {
            throw new CustomException("Invalid First Name of "+id);
        }
    }
    
    public void last_name_checker() throws CustomException {
        String last_name_regex = "[A-Z]{1}+[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(last_name_regex);
        Matcher matcher = pattern.matcher(last_name);
        if (!matcher.matches()) {
            throw new CustomException("Invalid Last Name of "+id);
        }
    }
    
    public void email_checker() throws CustomException {
        String email_regex = "[A-Za-z0-9_%+-]+(\\.[A-Za-z0-9_%+-]+)*@[A-Za-z0-9]+(\\.[a-zA-Z]{2,}){1,2}";
        Pattern pattern = Pattern.compile(email_regex);
        Matcher matcher = pattern.matcher(email_id);
        if (!matcher.matches()) {
            throw new CustomException("Invalid Email Address of "+id);
        }
    }
    
    public void phone_number_checker() throws CustomException {
        String phone_number_regex = "[0-9]{1,2}+\\s{1}[0-9]{10}";
        Pattern pattern = Pattern.compile(phone_number_regex);
        Matcher matcher = pattern.matcher(phone_number);
        if (!matcher.matches()) {
            throw new CustomException("Invalid Phone Number of "+id);
        }
    }
    
    public void password_checker() throws CustomException {
        String password_regex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!])(.{8,})";
        Pattern pattern = Pattern.compile(password_regex);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new CustomException("Invalid Password of "+id);
        }
    }
    

}


