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
public class QuadraticProbing {
    int M;
    
    public QuadraticProbing(int M) {
       this.M = M;
        
    }


    
  
       public int hashKeyValue(int z)
    {
        
        
         int p = z % 7;
         return (p+1);
    }
    public void put(int s,int[] arr)
    {
        Integer j = 0;
         int k = 0;
       
        try
        {
        j = 0;
        k =1;
        
//         for (j = hashKeyValue(s); arr[j] != 0; j = (hashKeyValue(s) + k*k) % M)
//         {
//            k = k+1;
//            
//           
//         }
 j = hashKeyValue(s);
  while(arr[j] != 0)
  {
      j = (j + k*k) % M;
      k = k+1;
      if (k > 45000)
      {
          k = 1;
          j = j + 1;
          
      }
  }
         arr[j] = s;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
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
