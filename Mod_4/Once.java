//Write a program, Once.java, that reads in a string 
// and prints the first character that appears exactly 
// once in the string. Ex: ABCDBADDAB -> C.
public class Once {
    public static char once(String a){
        for (int i=0;i<a.length();i++){
            char b=a.charAt(i);
            for (int j=0;j<a.length();j++){
                if (j==a.length()-1&&a.charAt(j)!=b) {
                    System.out.println(b);
                    return b;
                }
                
            }
        }
        char c= '?';
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        once("ABCDBADDAB");
    }
}