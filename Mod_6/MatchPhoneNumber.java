package Mod_6;
//Write a Java regular expression to match phone numbers, with or 
// without area codes. The area codes should be of the form 
// (609) 555-1234 or 555-1234. Name the program MatchPhoneNumber.java
public class MatchPhoneNumber {
    public static void main(String[] args) {
       String regexp = "(\\([0-9]{3}\\) )?[0-9]{3}-[0-9]{4}"; 
       System.out.println("(609) 555-1234".matches(regexp));
       System.out.println("555-1234".matches(regexp));
       System.out.println("5551234".matches(regexp));
    }
}
