
/* Write a program Banner.java that takes a string s 
from the command line and display it in banner style 
on the screen, moving from left to right and wrapping 
back to the beginning of the string as the end is reached. 
Add a second command-line argument to control the speed. 
Use the StdDraw library described in the textbook.*/
public class Banner {
    static void banner(String s,int speed){
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.enableDoubleBuffering();
        double x=-1,y=0;
        double px=.015;
        while (true) {
            if (x+px>1) {x=-1;}
            x+=px;
            StdDraw.clear();
            StdDraw.text(x, y, s);
            StdDraw.show();
            StdDraw.pause(speed);
        }
        
    }
    public static void main(String[] args) {
         banner("hi", 20);
        
    }
}
