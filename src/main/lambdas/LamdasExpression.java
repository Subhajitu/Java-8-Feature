package main.lambdas;

import java.util.Comparator;

public class LamdasExpression {

    public static void main(String[] args) {

        /**
         * Implement Runnable using lambdas
         */

        /**
         * Regular Expression
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Stawars is an average movie : Yes");

            }
        };
        new Thread(runnable).start();

        /**
         * Lambda Expression
         */

        Runnable runnable1 = () -> System.out.println("Stawars is an average movie : No");
        new Thread(runnable1).start();

        /**
         * End of Runnable implementation
         */

        /**
         * Implement Comparator using Lambdas
         */

        /**
         * Regular Expression
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer S1, Integer S2) {
                return S1.compareTo(S2);
            }
        };
        System.out.println("Print the comparison:" + comparator.compare(2,4));

        /**
         * Lambda Expression
         */

        Comparator<Integer> comparator1 = (a,b) -> {return  a.compareTo(b);};
        Comparator<Integer> comparator2 = (c,d) -> c.compareTo(d);

        System.out.println("Print the comparison:" + comparator1.compare(4,4));

        System.out.println("Print the comparison:" + comparator2.compare(7,4));

}

}
