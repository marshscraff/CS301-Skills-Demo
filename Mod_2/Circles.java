/*Write a program Circles.java that draws filled 
circles of random size at random positions in the
unit square, producing images like those below. 
Your program should take four command-line arguments:
the number of circles, the probability that each circle
is black, the minimum radius, and the maximum radius. 
Use the StdDraw library described in the textbook. 
Feel free to reference the library's documentation as necessary. */
public class Circles {
   static void circles(int num, double prob,double min, double max){
    double scalemin=-5;
    double scalemax=5;
    StdDraw.setXscale(scalemin, scalemax);
    StdDraw.setYscale(scalemin, scalemax);
    for(int i=0;i<num;i++){
        double rad= (Math.random()*(max-min+1))+min;
        double color=Math.random();
        double y= (Math.random()*(scalemax-(scalemin)+1))+(scalemin);
        double x= (Math.random()*(scalemax-(scalemin)+1))+(scalemin);
        if (color>= prob) {
           StdDraw.setPenColor(StdDraw.WHITE);
        }else{ StdDraw.setPenColor(StdDraw.BLACK);}
        StdDraw.filledCircle(x, y, rad);
    }
    
   }
   public static void main(String[] args) {
    circles(200, 1, .01, .01);
    circles(200, 1, .01, .05);
    circles(200, .5, .01, .05);
    circles(50, .75, .1, .2);
   } 
}
