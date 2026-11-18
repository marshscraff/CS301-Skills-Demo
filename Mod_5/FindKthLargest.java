package Mod_5;

import java.util.Arrays;

//Given an array of N elements, not necessarily in ascending order, 
// devise an algorithm to find the kth largest one. It should run in 
// O(N) time on random inputs. Name this program FindKthLargest.java.
public class FindKthLargest {
    public static int kthLargest(int[] a, int k){
        if (k>a.length) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(a);
        int d=a.length;
        int c=a[d-k];
        return c;
    }
    public static void main(String[] args) {
        int[] a={0,33,45,1,3,5,6,};
        System.out.println(kthLargest(a, 3));
    }
}
