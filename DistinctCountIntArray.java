//https://app.codility.com/demo/results/trainingYMTPHS-SDS/
import java.util.Set;
import java.util.HashSet;
class DistinctCountIntArray(){

      public  int solution(int[] A) {
          Set<Integer> set = new HashSet<Integer>();
         for(int m : A){
           set.add(m);
         }
         return set.size();
      }

}
