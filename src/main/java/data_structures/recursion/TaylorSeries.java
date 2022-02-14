package data_structures.recursion;

/**
 * created by ANEK on Monday 1/31/2022 at 11:37 AM
 */

public class TaylorSeries {
    static int p =1 ,f = 1  ;
    public static void main(String[] args) {

    // e*x = 1 + x + (x*2)/2!  + (x*3)/3! +  ..... +

        int result = taylorSeries(3,2);
        System.out.println("result :: "+result);

    }

    private static int taylorSeries(int x ,int n ) {

        int r;
        if(n == 0) return 1 ;
         r = taylorSeries(x,n-1);

         p = p * x ;
         f = f * n ;

         return r + p/f;
    }


    }
