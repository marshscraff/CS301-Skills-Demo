package Mod_3;


//Write a static method areTriangular() that takes three double arguments
//  and returns true if they could be the sides of a triangle (that is, none 
// of them is greater than or equal to the sum of the other two).


public class triangular {
    static boolean areTriangular(double x,double y,double z){
        boolean isTri=true;
        if ((x+y<=z)|(x+z<=y)|(z+y<=x)) {
            isTri=false;
        }
        return isTri;
    }
    public static void main(String[] args) {
        areTriangular(3.0, 5.0, 10.0);//false
        areTriangular(3.0, 5.0, 3.0);//true
    }
}
