package Mod_5;
//Given an array a[] of N distinct integers (positive or negative) in 
// ascending order. Devise an algorithm (hint: binary search!) to find 
// an index i such that a[i] = i if such an index exists. Name this program BinarySearch.java.
public class BinarySearch {
    public static boolean binarySearch(int[] a){
        boolean found=false;
        for(int i=0;i<a.length;i++){
            if (a[i]==i) {
                found=true;
            }
        }return found;
    }
    public static void main(String[] args) {
        int[] a={0,1,3,5,6,};
        int[] b={1,3,4,5,6};
        System.out.println(binarySearch(a));
        System.out.println(binarySearch(b));
    }
}
