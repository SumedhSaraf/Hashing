/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;


/**
 *
 * @author sumed
 */
public class Hashing {
  
   
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
                
              
              
           
        // int M = 20000;
         int M = 10000;
         int[] arr = new int[M];
         //LinearProbing lp = new LinearProbing(M);
           QuadraticProbing lp = new QuadraticProbing(M);
           //  DoubleHashing lp = new DoubleHashing(M);
        for (int i = 0; i < 5010; i++) 
           // System.out.println( ThreadLocalRandom.current().nextInt(0, 25));
        {
           
            if (i % 10 == 0 )
            {
               
                Stopwatch stopwatch = new Stopwatch().start();  
                 lp.put(ThreadLocalRandom.current().nextInt(1, 25), arr);
                 stopwatch.stop();
                long millis = stopwatch.elapsedTime(TimeUnit.MICROSECONDS);
                Double rd = lp.filledElements(arr)/10000.00;
              System.out.println(rd + ","+millis);
              
            }
            else
            {
                lp.put(ThreadLocalRandom.current().nextInt(1, 25), arr);
        }
        
//        for (int k = 0; k < M; k++) {
//            System.out.println(arr[k]);
//        }
    }
        
       int[] BigArray =  lp.resizearray(arr);
          
  
       lp.put(ThreadLocalRandom.current().nextInt(1, 25), BigArray);
       int k = lp.filledElements(BigArray);
     
        
               for (int i = 10001; i < 15000; i++) 
   
        {
           
            if (k % 20 == 1 )
            {
               
                Stopwatch stopwatch = new Stopwatch().start();  
                 lp.put(ThreadLocalRandom.current().nextInt(1, 25), BigArray);
                 stopwatch.stop();
                long millis = stopwatch.elapsedTime(TimeUnit.MICROSECONDS);
                Double rd = (k+1)/20000.00;
              System.out.println(rd + ","+millis);
              k = k + 1;
              
            }
            else
            {
                lp.put(ThreadLocalRandom.current().nextInt(1, 25), arr);
                k = k + 1;
        }
        
    }
    
}
}
