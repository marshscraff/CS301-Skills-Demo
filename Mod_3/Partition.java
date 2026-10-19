//Write a program Partition.java that takes a positive integer N 
// as a command-line argument and prints out all partitions of N. 
// A partition of N is a way to write N as a sum of positive integers. 
// Two sums are considered the same if they only differ in the order of 
// their constituent summands.
//% java Partition 4      % java Partition 6
//4                       6
//3 1                     5 1
//2 2                     4 2
//2 1 1                   4 1 1
//1 1 1 1                 3 3
//                        3 2 1
//                        3 1 1 1
//                        2 2 2
//                        2 2 1 1
//                        2 1 1 1 1
//                        1 1 1 1 1 1

public class Partition {
    static void partition(int x){
        System.out.println(x);
        int cnt=x;
        int a=0;
        while (cnt!=1) {
            cnt=cnt-1;
            a=x-cnt;
            if (a>cnt) {
                int d=a-1;
                while (d>cnt) {
                    d=d-1;
                }
                System.out.println(cnt+" "+d+" "+(a-d));
            }else{System.out.println(cnt+" "+a);}
            
            
            if (a!=1&&a<=cnt){
                int b=a-1;
                System.out.println(cnt+" "+b+" 1"+"m");
                if (b!=1) {
                    System.out.println(cnt+" "+(b-1)+" 1 1");
                }
            }
            if (cnt==2) {
                System.out.println("butts");
            }
        }
    }
    public static void main(String[] args) {
        partition(9);
    }
}
