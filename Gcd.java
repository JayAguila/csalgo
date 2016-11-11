
package gcd;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.print("Input First Number:");
        firstNumber = scan.nextInt();
        System.out.print("Input Second Number:");
        secondNumber = scan.nextInt();
        System.out.println(gcd(firstNumber , secondNumber));
        
        
       
    }

    private static int gcd(int m, int n) {
    if(n == 0){
        return m;
    }
    else return gcd(n,m%n);
    
    
    }
    
}
