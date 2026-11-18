package Mod_5;

import java.util.Scanner;
import java.util.Stack;

//Write a stack client Parentheses.java that reads a string 
// of parentheses, square brackets, and curly braces from 
// standard input and uses a stack to determine whether they 
// are properly balanced. For example, your program should print 
// true for [()]{}{[()()]()} and false for [(]).
public class Parentheses {
    public static boolean parentheses(String a){
        boolean balanced=true;
        Stack<Character> b= new Stack<>();
        for(int i=0; i<a.length();i++){
            char c=a.charAt(i);
            if (c=='('||c=='['||c=='{') {
                b.push(c);
            }else if (c==')'||c==']'||c=='}') {
                if (b.isEmpty()) {
                    balanced=false;
                }
                char d=b.pop();
                if (c==')'&&d!='('||c==']'&&d!='['||c=='}'&&d!='{') {
                    balanced=false;
                }
            }
        }
        return balanced;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String e=input.nextLine();
        System.out.println(parentheses(e));
    }
}