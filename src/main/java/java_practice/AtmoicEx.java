package java_practice;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * created by ANEK on Tuesday 3/8/2022 at 6:33 PM
 */

public class AtmoicEx {
    public static void main(String[] args) throws InterruptedException {


        long t1 = System.currentTimeMillis();
        AtomicInteger aint = new AtomicInteger(0);

        System.out.println(Thread.currentThread().getName());
        System.out.println("Atomic value :: "+aint.getAndSet(10));
        System.out.println("Atomic value :: "+aint.getAndSet(10));

        System.out.println(""+aint.incrementAndGet());
        // t1 = System.currentTimeMillis();
        Thread.sleep(60000);
        long t2 = System.currentTimeMillis();

        System.out.println("t2 : "+t2+" t1 : "+ t1 +" :: "+ (t2-t1));
        System.out.println("t2 : "+t2+" t1 : "+ t1 +" :: "+ (t2-t1)/60000);


    }
}
