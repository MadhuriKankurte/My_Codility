// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] Atemp = new int[A.length];
        int k = K;
        int n = A.length;
        int xx = 0;

        while(k>0){
          for(int i=n-1;i>0;i--){
              xx = A[i];
              A[i] = A[i-1];
              A[i-1] =xx;
          }
              k--;
        }
        return A;
    }
}
