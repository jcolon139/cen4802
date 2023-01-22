public class FibonacciSequence {

    public static void main(String[] args) {

    int fInt = 10;

        System.out.print("The " + fInt + "th term of the Fibonacci sequence is: " + recursiveFibonacci(fInt));

    }

    /**
     * This is the Recursive Fibonacci sequence program that will use a given integer as an argument
     * to calculate its place in the Fibonacci sequence.
     * @author Javier Colon Morales
     * @param n the given integer to use as an argument in the calculation for its place in the
     *          Fibonacci sequence.
     * @return  returns the calculated Fibonacci sequence term using a given parameter greater than 1.
     */
    public static int recursiveFibonacci(int n) {
            if(n <= 1)
            {
                return 1;
            }
            else {
                return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
            }
        }

}