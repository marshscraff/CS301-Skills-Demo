public class TwentyFivePerLine {
 /*Write a program TwentyFivePerLine.java that,
  using one for loop and one if statement,
   prints the integers from 1000 to 2000 with 25 integers per line.
    Hint: use the % operator. */   
    static void twentyFivePerLine(){
       for(int i=1000; i<2001;i++){
        if((i+1)%25==0){
            System.out.println(i+" ");
        }
        else{System.out.print(i+" ");}
       }
    }
    public static void main(String[] args) {
        twentyFivePerLine();
    }
}
