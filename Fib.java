/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    // When asked to find the nth term of a Fibonacci sequence, the 
    // recursive abstraction can find the sum of the (n-1)th and the
    // (n-2)th term of the Fibonacci sequence.
    public static long fib_recurrence( int n) {
        // decision between base case and recursive case
        if (n <= 2) {
            // solution to the base case
            return 1;
        }
        else {
            // solution to the recursive case
            return fib_recurrence( n - 1) + fib_recurrence( n - 2);
        }
    }
     /* There are no fields in Fib.java
    */
     // highest index is 45.


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int first = 1;
        int second = 1;
        int oldSecond = 0;
        for (int i = 2; i < n; i++) {
            oldSecond = second;
            second = first + second;
            first = oldSecond;
        }
        return second;
    }
    /* Time complexity:
       Consider the size of the problem to be linear
       
       As the proxy for the time required, count each
       time the loop is iterated.
       
       Then cost of the the recurrence algorithm
       grows linearly by n
       as the size of the problem increases,
       because the loop happens 1 more time each 
       time the problem size increases by 1.
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double golden = (1.0 - Math.sqrt(5.0)) / 2.0;
        return ((Math.pow(golden, n)) - (Math.pow(golden * -1, n * -1)))
               /
               (2 * golden - 1);
    }
    /* Time complexity:
       Consider the size of the problem to be constant
       
       As the proxy for the time required, count the return statement
       
       Then cost of the the Binet algorithm
       does not grow
       as the size of the problem increases,
       because it only does one operation each time.
     */
}
