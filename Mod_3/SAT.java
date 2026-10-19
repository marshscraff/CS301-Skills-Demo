//A prominent northeastern university receives 20,000 student applications. 
// Assume that the SAT scores of these individuals is normally distributed 
// with mean 1200 and standard deviation 100. Suppose the university decides 
// to admit the 5,000 students with the best SAT scores. Write a Java program 
// named SAT.java to estimate the lowest score that will still be admitted.

public class SAT {
    static double sat(){
        double mean=1200;
        double sd=100;
        double result=(mean+((25/34.13)*sd))/1;
        result=Math.round(result);
        return result;
    }
    public static void main(String[] args) {
        sat();
    }
}
