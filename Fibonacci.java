
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long after , before , fib;
        after = System.currentTimeMillis();
        before = System.currentTimeMillis();;
        System.out.print("input your desire fibonacci number: ");
        fib = scan.nextLong();
        System.out.println(" " + fibonacci(fib));
        System.out.println("Time taken(ms)" + (after - before));
        
    }

    private static long fibonacci(long n) {
        if( n <= 1){
            return n;
        }
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
