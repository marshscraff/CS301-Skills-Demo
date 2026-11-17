//Create a data type SodaMachine that has methods 
// insertCoin(), getChange(), buy(), etc. The program should be named SodaMachine.java.

import java.util.HashMap;

public class SodaMachine {
    static HashMap<String,Integer> machineStock= new HashMap<>();
    static double moneyDue;
    double moneyInserted;
    static String selection;
    

    public static void addStock(String sodaNameString, int stock){
        if (machineStock.containsKey(sodaNameString)) {
            int a=machineStock.get(sodaNameString);
            machineStock.put(sodaNameString, a+stock);
        }else{
        machineStock.put(sodaNameString,stock);}
    }

    public static String checkStock(){
        return machineStock.toString();
    }

    public static String buy(String sodaNameString){
        if (machineStock.get(sodaNameString).equals(0)) {
            return "Out of Stock";
        }else{moneyDue=1.50;
            selection=sodaNameString;
        return "$1.50 due. Insert coins.";
    }   
    }

    public static String insertCoin(){
        if (moneyDue==0) {
            return "No money due. Make selection.";
        }else{
            moneyDue-=.25;
            if (moneyDue==0) {
                addStock(selection, -1);
                return "Bang! Crash! Enjoy Drink!";
            }else{
            return "Money due $"+moneyDue;}
        }
    }

    public static String getChange(){
        if (moneyDue<1.5&&moneyDue>0) {
            double change=1.5-moneyDue;
            moneyDue=0;
            return "$"+change+"returned!";  
        }else{return "No change.";}
    }
public static void main(String[] args) {
    String a= "Monster";
    int b=10;
    String c= "Sprite";
    addStock(a, b);
    addStock(c, b);
    System.out.println(checkStock());
    addStock(a, b);
    System.out.println(checkStock());
    System.out.println(buy(a));
    while (moneyDue!=0) {
        System.out.println(insertCoin());
    }
    System.out.println(checkStock());
    System.out.println(buy(c));
    System.out.println(insertCoin());
    System.out.println(getChange());
    System.out.println(checkStock());
}
}
