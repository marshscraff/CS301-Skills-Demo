
/* Write a program Stats.java that takes an integer 
command-line argument n, reads n floating-point numbers 
from standard input, and prints their mean (average value) 
and sample standard deviation (square root of the sum of the 
squares of their differences from the average, divided by n−1).  
Use the StdIn library described by the textbook.*/



public class Stats {
    static void stats(int n){
       double sum=0.0;
       double[] value=new double[n];
       double mean=0.0;
       for (int i=0;i<n;i++){
        value[i]= (Math.random()*30);
        sum+=value[i];
    }
        mean=sum/n;
        sum=0.0;
        for(int i=0;i<n;i++){
            sum+=Math.pow(value[i]-mean, 2);
        }
        double sd=Math.sqrt(sum/(n-1));
        System.out.println("Average: "+ mean+" Standard Deveation: "+sd);
        }
        
        
    
    public static void main(String[] args) {
        stats(5);
    }
}
