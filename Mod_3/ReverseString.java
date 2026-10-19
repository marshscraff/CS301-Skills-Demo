//Write a program ReverseString.java that takes a string and reverses it using recursion.

public class ReverseString {
    static String reverseString(String a){
        String b="";
        return reverseStringHelper(a, b);
    }

    static String reverseStringHelper(String a,String b){
        if (a.length()==0) {
            return b;
        }
        b=a.charAt(0)+b;
        a=a.substring(1, a.length());
        return reverseStringHelper(a, b);
    }
    public static void main(String[] args) {
        reverseString("xoxo gossip girl");
    }
}
