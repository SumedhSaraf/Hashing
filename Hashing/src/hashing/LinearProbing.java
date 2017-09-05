/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import java.util.Arrays;

/**
 *
 * @author sumed
 */
public class LinearProbing {

    int M;
    public LinearProbing(int M) {
       this.M = M;
        
    }


    
  
       public int hashKey(int i)
    {
        return ((i % 7)+1);
    }
    public void put(int s,int[] arr)
    {  
        int j = 0;
       
//         for (j = hashKey(s); arr[j] != 0; j = (j + 1) % M)
//         {
//              
//        
//         }

 j = hashKey(s);
  while(arr[j] != 0)
  {
      j = (j + 1) % M;
  }
         arr[j] = s;
    }
        public int filledElements(int[] arr)
    {  
        int t = 0;
         for (int y  = 0;y < arr.length;y = y+1)
         {
             if(arr[y] != 0)
             {
                 t = t +1;
             }
         }
       return t; 
    }
        
       public int[] resizearray(int[] arr)
                        
    {  
        int newSize = 2*arr.length;
     int[] newArray = Arrays.copyOf(arr, newSize);
      return newArray;
    }
    
}
