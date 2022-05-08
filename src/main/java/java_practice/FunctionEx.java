package java_practice;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * created by ANEK on Thursday 5/5/2022 at 2:49 PM
 */

public class FunctionEx {
    /*
    public static int compute(Function...f) {
        Function t = null;
        for (Function ff :f ){
            t.andThen(ff);
        }
        return t
    } */
    public static void main(String[] args) {

        int x = 14;
        //Supplier<Integer> supplier  = () -> compute(x);
        //System.out.println(supplier.get());
        // composition
        Function<Integer,Integer> inc = e -> e+1 ;
        Function<Integer,Integer> doub = e -> e*2 ;
        System.out.println(inc);





    }

}
