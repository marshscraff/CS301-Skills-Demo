//Write a program named RecursiveBinarySearch.java that uses 
// recursive binary search to determine whether a target value 
// occurs in a sorted integer array. Your solution must use recursion 
// and should repeatedly compare the target to the middle element of 
// the current search range. Based on that comparison, recursively 
// search either the left or right half of the array. Do not use a loop to search the array.
//numbers = {3, 8, 12, 17, 21, 35, 48}

//search(numbers, 17) → true
//search(numbers, 20) → false

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecursiveBinarySearch {
    static boolean recursiveBinarySearch(int[] num,int x){
        int a=num.length;
        if (a==0) {
            return false;
        }
        Arrays.sort(num);
        int b=a/2;
        int c=num[b];
        int[] left=Arrays.copyOfRange(num, 0, b);
        int[] right=Arrays.copyOfRange(num,b,a);
        return recursiveBinarySearch(right,c,left, x);
    }

    static boolean recursiveBinarySearch(int[] right,int c,int[] left,int x){
        if (right.length==0&&left.length==0) {
            return false;
        }
       
        if(x>c){
            int a=right.length;
            int b=a/2;
            int d =right[b];
            int[] lefttemp=Arrays.copyOfRange(right, 0, b);
            int[] righttemp=Arrays.copyOfRange(right, b+1, a);
            return recursiveBinarySearch(righttemp, d, lefttemp, x);
        }
        if (x<c) {
            int a=left.length;
            int b=a/2;
            int d =left[b];
            int[] lefttemp=Arrays.copyOfRange(left, 0, b);
            int[] righttemp=Arrays.copyOfRange(left, b+1, a);
            return recursiveBinarySearch(righttemp, d, lefttemp, x);
        } else{return true;}
        
       
    }
    public static void main(String[] args) {
        int[] temp={6,4,1,4,8,9,13};
        int[] empty={};
        recursiveBinarySearch(temp, 0);
        recursiveBinarySearch(temp, 9);
        recursiveBinarySearch(empty, 6);
    }
}
