
//Rot13 is a very simple encryption scheme used on 
// some Internet newsgroups to conceal potentially 
// offensive postings. It works by cyclically shifting 
// each lowercase or uppercase letter 13 positions. So, 
// the letter 'a' is replaced by 'n' and the letter 'n' 
// is replaced by 'a'. For example, the string "Encryption" 
// is encoded as "Rapelcgvba." Write a program ROT13.java that 
// reads in a String as a command line parameter and encodes it using Rot13.
public class ROT13 {
    public static String rot13(String a){
        String b="";
        for (int i=0;i<a.length();i++){
            char c=a.charAt(i);

            if (c>='a'&&c<= 'z') {
                b+= (char)('a'+(c- 'a'+13)%26);
            }
            else if (c>='A'&&c<= 'Z') {
                b+= (char)('A'+(c- 'A'+13)%26);
            }
            else{
            b+=c;
        }
        }
        System.out.println(b);
        return b;
    }
    public static void main(String[] args) {
        rot13(args[0]);
    
    }
}