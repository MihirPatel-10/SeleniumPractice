package SeleniumIntro;

public class Locators3 {
    public static void main(String[] args) {
        String s = "Please use temporary password 'rahulshettyacademy' to Login.";
        String [] passwordArray = s.split("'");
        System.out.println(passwordArray[1]);
    }
}
