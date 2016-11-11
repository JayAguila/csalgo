
package strassen;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Strassen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int p1 , p2 , p3 , p4 , p5 , p6 , p7, c1,c2,c3,c4;
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        System.out.println("First Matrix ");
        for(int x = 0; x<2; x++){
            System.out.print("Input element: ");
            for(int y = 0; y < 2; y++){
                
        a[x][y] = read.nextInt();
        //b[x][y] = read.nextInt();
            }
            
        }
        System.out.println("Second Matrix ");
         for(int x = 0; x<2; x++){
             System.out.print("Input Element: ");
            for(int y = 0; y < 2; y++){
                
        //a[x][y] = read.nextInt();
        b[x][y] = read.nextInt();
            }
            
        }
        System.out.println("First Matrix");
        for(int row = 0; row <2; row++){
            for(int col = 0; col < 2; col++){
                System.out.print(a[row][col] + " ");
               
               // System.out.print(b[row][col] + " ");
            }
             System.out.println();
        }
        System.out.println("second Matrix");
        for(int row = 0; row <2; row++){
            for(int col = 0; col < 2; col++){
                //System.out.print(a[row][col] + " ");
               
                System.out.print(b[row][col] + " ");
            }
             System.out.println();
        }
        p1 = (a[0][0]+a[1][1])*(b[0][0]+b[1][1]);
        p2 = (a[1][0]+a[1][1])*b[0][0];
        p3 = a[0][0]*(b[0][1]-b[1][1]);
        p4 = a[1][1]*(b[1][0]-b[0][0]);
        p5 = (a[0][0]+a[0][1])*b[1][1];
        p6 = (a[1][0] - a[0][0])*(b[0][0] + b[0][1]);
        p7 = (a[0][1] - a[1][1])*(b[1][0] + b[1][1]);
        
        c1 = (p1 + p4) - (p5 + p7);
        c2 = p3 - p5;
        c3 = p2 + p4;
        c4 = ((p3 + p6)+ p2) - p1;
        
        c[0][0] = c1;
        c[0][1] = c2;
        c[1][0] = c3;
        c[1][1] = c4;
        System.out.println("Final matrix");
        for(int x = 0; x < 2; x++){
            for(int y = 0; y < 2; y++){
                System.out.print(c[x][y] + " ");
            }
            System.out.println();
        }
    }
    
}
