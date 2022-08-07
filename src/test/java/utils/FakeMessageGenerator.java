package utils;
import com.github.javafaker.Faker;

public class FakeMessageGenerator {

    public static String generateAccountName() {
        return new Faker().company().name();
    }

    public static String generatePhone() {
        return new Faker().phoneNumber().phoneNumber();
    }

    public static String generateDescription() {
        return new Faker().harryPotter().quote();
    }

    public static String generateWebSite() {
        return new Faker().internet().emailAddress();
    }

    public static int generateEmployeesNumber() {
        return new Faker().number().numberBetween(0, 1000000);
    }

    public static String generateStreet() {
        return new Faker().address().streetAddress();
    }

    public static String generateCity() {
        return new Faker().address().city();
    }

    public static String generateState() {
        return new Faker().address().state();
    }

    public static String generateZip() {
        return new Faker().address().zipCode();
    }

    public static String generateCountry() {
        return new Faker().address().country();
    }
}
