
package fib;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Fib {
static long memory[] = new long[31];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        memory[0] = 1;
        Scanner scan = new Scanner(System.in);
        long after , before , fib;
        after = System.currentTimeMillis();
        before = System.currentTimeMillis();;
        System.out.print("input your desire fibonacci number: ");
        fib = scan.nextLong();
        System.out.println(" " + fibonacci(fib));
        System.out.println("Time taken(ms)" + (after - before));
        // TODO code application logic here
    }

    private static long fibonacci(long n) {
        if(n == 0){
        return 0;
        }
        
        else if (n == 1 || n == 2){
        return 1;
        }
        
        else if(memory[(int) n] != 0){
        return memory[(int) n];
        }
        
        else 
            memory[(int)n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memory[(int) n];
    
        }
    
}
