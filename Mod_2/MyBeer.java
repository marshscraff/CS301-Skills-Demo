
/*A large number of college students are attending a party. 
Each guest is drinking a can of beer (or soda of they are under 
21). An emergency causes the lights to go out and the fire alarm 
to go off. The guests calmly put down their beer and exit the building. 
When the alarm goes off, they re-enter and try to retrieve their beer. 
However, the lights are still off, so each student randomly grabs a bottle 
of beer. What are the chances that at least one student gets his or her 
original beer? Write a program MyBeer.java that takes a command-line 
argument n and runs 1,000 simulations this event, assuming their are 
n guests. Print the fraction of times that at least one guest gets 
their original beer.   */


public class MyBeer {
    static void myBeer(int n){
        int[] perm=new int[n];
        int z=0;
        
        for(int j=0;j<1000;j++){
            for(int i=0;i<n;i++){
            perm[i]=i;
        } 
        for(int i=0;i<n;i++){
            int r=(int)(Math.random()*(n-1));
            int t=perm[r];
            perm[r]=perm[i];
            perm[i]=t;
        }
       
        for(int i=0;i<n;i++){
            
            if (perm[i]==i) {
              z++;
              break;  
            }else{continue;}
        }
        }
        System.out.println(z+"/1000");
        
    }
    public static void main(String[] args) {
        myBeer(50);
    }
}
