
public class FibonacciSequence {

    public static void main(String[] args) {

    int fiboInt = 10;

        System.out.print("The " + fiboInt + "th term of the Fibonacci sequence is: " + recursiveFibonacci(fiboInt));

    }

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