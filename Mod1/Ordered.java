/*Write a program Ordered.java that reads in three 
integer command line arguments, x, y, and z. Create
 a boolean variable b that is true if the three values 
 are either in ascending or in descending order, 
 and false otherwise. Print the variable b. */
public class Ordered {
    static boolean ordered(int x,int y,int z){
        boolean b=false;
        if ((x<=y&&y<=z)||(x>=y&&y>=z)) {
            b=true;
        }
        System.out.println(b);
        return b;
    }
    public static void main(String[] args) {
        
    }
}
