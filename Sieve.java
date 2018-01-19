
import java.util.ArrayList;

public class Sieve {

    public static ArrayList<Integer> sieve(int n){
      ArrayList<Integer> list = new ArrayList<Integer>();
      ArrayList<Integer> finaList = new ArrayList<Integer>();
      
      int j = 0;
      
        if (n < 2){
           return list;
       }
        list.add(0);
        list.add(0);
        
        for (int p = 2; p <= n; p++){
            list.add(p);
        }
       for (int index = 2; index < Math.sqrt(n); index++){
           if(list.get(index) != 0){
               j = index*index;
               while(j <= n){
                   list.set(j, 0);
                   j = j + index;
               }
           }   
       }
      
       for (int p = 2; p <=n; p++){
           if ( list.get(p)!= 0){
               finaList.add(list.get(p));
           }
           
       }
       
      return finaList;
        
    }

    
}
