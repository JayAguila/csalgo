
package selection;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int elements;
        System.out.print("Enter number of Elements: ");
        elements = scan.nextInt();
        
        int[] stored = new int[elements];
        
        for(int x = 0 ; x< stored.length; x++){
            System.out.print("Enter data: ");
            stored[x] = scan.nextInt();
        }
        
        System.out.println();
        int[] saved = selectionSort(stored);
        System.out.println("Selection Sort: ");
        for (int x = 0 ; x < saved.length; x++){
            System.out.print(saved[x] + "  ");
            
        }
        
        
        
    }
    
    
    public static int[] selectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    
}
