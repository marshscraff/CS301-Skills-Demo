package Mod_2;

/*Write a program Circles.java that draws filled 
circles of random size at random positions in the
unit square, producing images like those below. 
Your program should take four command-line arguments:
the number of circles, the probability that each circle
is black, the minimum radius, and the maximum radius. 
Use the StdDraw library described in the textbook. 
Feel free to reference the library's documentation as necessary. */
public class Circles {
   static void circles(int num, int prob,double min, double max){
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    for(int i=0;i<num;i++){
        double rad= (Math.random()*(max-min+1))+min;
    }
    
   }
   public static void main(String[] args) {
    
   } 
}
