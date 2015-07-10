// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
      int lSum = A[0];
      int rSum = sum(A) - lSum;
      int minDiff = Integer.MAX_VALUE;
      
      for(int p = 1; p < A.length; p++) {
        int diff = Math.abs(lSum - rSum);
        if(diff < minDiff) {
          minDiff = diff;
        }
        
        lSum += A[p];
        rSum -= A[p];
      }
      
      return minDiff;
    }
    
    private static int sum(int[] A) {
      int s = 0;
      for(int a : A) {
        s += a;
      }
      
      return s;
    }
}