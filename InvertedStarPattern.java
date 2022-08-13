package Patterns;

public class InvertedStarPattern {
    public static void main(String args[]) {
        /*
         * print ****
         *       ***
         *       **
         *       *
         */
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=0; j<=n-i; j++) {//another condition would be n-i+1(when j strat with 1).
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
