package demo1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Mytest {
    
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before Class Execution Check");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After class Execution check");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before execution of each test");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After execution of each test");
    }
    
    User user1 = new User("User1","Himanshu", "Agrawal", "himanshu2002@gmail.com", "91 7744870900", "himH@123");
    User user2 = new User("User2","himanmshu", "agrawal","himanshu@gmail.i","9177559898","hij@45");
    @Test
    public void firstname_validation() {
        try {
            user1.first_name_checker(); // Happy
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
        }
    
        try {
            user2.first_name_checker(); // Sad
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
            // Handle the exception as needed or just print the message
        }
    }
    
    @Test
    public void lastname_validation() {
        try {
            user1.last_name_checker(); // Happy
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
        }
    
        try {
            user2.last_name_checker(); // Sad
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
            // Handle the exception as needed or just print the message
        }
    }

    @Test
    public void email_validation(){
        try{
            user1.email_checker(); //Happy
        }
        catch(CustomException exception){
            System.out.println(exception.getMessage());
        }

        try{
            user2.email_checker(); //Sad
        }
        catch(CustomException exception){
            System.out.println(exception.getMessage());
        }
    }
    
    @Test
    public void phone_number_validation() {
        try {
            user1.phone_number_checker(); // Happy
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
        }
    
        try {
            user2.phone_number_checker(); // Sad
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
            // Handle the exception as needed or just print the message
        }
    }
    
    @Test
    public void password_validation() {
        try {
            user1.password_checker(); // Happy
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
            //fail("Exception not expected");
        }
    
        try {
            user2.password_checker(); // Sad
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
            // Handle the exception as needed or just print the message
        }
    }
    


    // @ParameterizedTest
    // @ValueSource(strings = {"himanshu@gmail.com","Himanshu123@gmail.com.in","himanshu.ag@ge.i"})
    // public void email_validation(String mail){
    //     User usertemp = new User(mail);
    //     assertTrue(usertemp.email_checker());
    // }
}

