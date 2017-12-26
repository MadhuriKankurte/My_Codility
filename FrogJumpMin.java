//https://app.codility.com/c/run/trainingCVY6VT-9N5


class FrogJumpMin {

    public static void main(String[] args) {
        FrogJumpMin frog = new FrogJumpMin();
      //  System.out.println(frog.solution(10000,1000000,2000));
       System.out.println(frog.getJumps(1000000-10000,2000));

    }

    public  int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int xx=0; int jumpsCtr = 0;
        while(Y>=xx){
             if(jumpsCtr==0){
                 xx = X+ D;
                 jumpsCtr++;
                 }else{
             xx = xx +D;
             if(xx>=Y){
              //   break;
                 }
             jumpsCtr++;}
            }
            return jumpsCtr;
    }

    public int getJumps(int m ,int D){
      return m/D + (((m%D)==0)? 0:1);
    }
}
