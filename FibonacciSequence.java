public class FibonacciSequence {
    public static void main(String[] args) {
    int fInt = 10;

        System.out.print("The " + fInt + "th term of the Fibonacci sequence is: " + recursiveFibonacci(fInt));

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


