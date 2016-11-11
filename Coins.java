
package coin;

/**
 *
 * @author Lenovo
 */
public class Coin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double  money = 572.75;

    int tenthdollars = (int) Math.floor(money/10);
    money -= tenthdollars * 10;

    int fifthdollars = (int) Math.floor(money/5);
    money -= fifthdollars * 5;

    int dollar = (int) Math.floor(money/1);
    money -= dollar * 1;

    int cents = (int) Math.floor(money/0.25);
    money -= cents * 0.05;

   // int pennies = (int) Math.round(money * 100);

    System.out.println("Ten Dollars: " + tenthdollars);
    System.out.println("Five Dollars: " + fifthdollars);
    System.out.println("Dollar: " + dollar);
    System.out.println("Cents: " + cents);
    //System.out.println("Pennies: " + pennies);
  }
         
        }
    
    
