/**
 * 
 */
package com.learning.samplers;

/**
 * @author Mayank
 *
 */
public class AmazonCodility2 {

	public static void main(String args[]) {
		int[] arr = {1,5,4,9,8,7,12,13,14};
		System.out.println(equi(arr));
 	}
	
	public static int equi ( int[] A ) {
	    int result = -1;
	    for(int i = 0; i < A.length; i++) {
	        if (lowerBound(A,i) == upperBound(A,i)) {
	            result = i;
	            break;
	        }
	    }   
	    
	    return result;
	  }
	  public static int lowerBound(int[] A,int index) {
	      int sum = 0;
	      for(int i = 0; i < index; i++) {
	          sum += A[i];
	      }
	      
	      return sum;
	  }
	  
	  public static int upperBound(int[] A,int index) {
	      int sum = 0;
	      for(int i = index+1; i < A.length; i++) {
	          sum += A[i];
	      }
	      
	      return sum;
	  }
}
