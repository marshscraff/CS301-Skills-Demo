
//Create a data type Date that represents a date. 
// You should be able to create a new Date by 
// specifying the month, day, and year. It should 
// supports methods to compute the number of days 
// between two dates, return the day of the week 
// that a day falls on, etc. The program should be named CustomDate.java.
public class CustumDate {
    private static int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    private static String[] daysWeek= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    private static String[] daysWeekRev= {"Saturday","Friday","Thursday","Wednesday","Tuesday","Monday","Sunday",};
    private int month;
    private int date;
    private int year;

    public CustumDate(int month0, int date0,int year0){
        month=month0;
        date=date0;
        year=year0;
    }
    public static boolean isLeap(CustumDate a){
         boolean isLeapYear=false;
        if (((a.year%400==0)||(a.year%4==0&&a.year%100!=0))) {//leap year check
                isLeapYear=true;
            }
            return isLeapYear; 
    }
    public static int leapNum(int start,int end){
        int a=0;
        for(int i=start+1;i<end;i++){
            if (((i%400==0)||(i%4==0&&i%100!=0))) {//leap year check
                a++;
            }
        }
        return a;
    }
    public static int dayofYear(CustumDate a){
        int b=0;
        for(int i=0;i<a.month-1;i++){
            if (isLeap(a)==true&&i==1) {//leap year check
                b+=1;
            }
            b+=days[i];
        }
        b+=a.date;
        return b;
    }
    public static int difference(CustumDate a,CustumDate b){
        int dif=0; int ydif=0; int mdif=0;
        if (a.year==b.year&&a.month==b.month&&a.date==b.date) {
            dif=0;
        }
        int aDayofYear=dayofYear(a);
        int bDayofYear=dayofYear(b);
        
        if (a.year>b.year) {
            ydif=(a.year-b.year-1);
            if (ydif<0) {
                ydif=0;
            }
            
            if (isLeap(b)==true) {
                 mdif=aDayofYear+(366-bDayofYear);
            }else{
                 mdif=aDayofYear+(365-bDayofYear);
            }
            mdif+=leapNum(b.year, a.year);
           dif=(ydif*365)+mdif;
            System.out.println(dif);
            
        }if (a.year<b.year) {
             ydif=(b.year-a.year-1);
             if (ydif<0) {
                ydif=0;
            }
            if (isLeap(a)==true) {
                 mdif=bDayofYear+(366-aDayofYear);
            }else{
                 mdif=bDayofYear+(365-aDayofYear);
            }mdif+=leapNum(a.year, b.year);
           dif=(ydif*365)+mdif;
            System.out.println(dif);
        }if (a.year==b.year) {
            ydif=0;
            if (aDayofYear>=bDayofYear) {
                mdif=aDayofYear-bDayofYear;
            }else{mdif=bDayofYear-aDayofYear;}
            dif=(ydif*365)+mdif;
        }
        return dif;
    }
    public static String dayOfWeek(CustumDate a){
        CustumDate b = new CustumDate(1, 1, 2000);
        int c=difference(a, b);
        int d=c%7;
        String e="";
        if (a.year<b.year) {
            e=daysWeekRev[d];
        }else{if (d==0) {
            return daysWeek[6];
        }
        e=daysWeek[d-1];
    }
        
        System.out.println(e);
        return e;
    }

    public static void main(String[] args) {
        CustumDate a= new CustumDate(11,16,2026);
        CustumDate b= new CustumDate(12,31,1999);
        CustumDate c = new CustumDate(1, 1, 2000);
        difference(a,c);
        dayOfWeek(a);
        dayOfWeek(b);

    }
}