

package tablecalculator;

import java.util.Scanner;


public class TableCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner object
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the first number of the table: ");
        int value1=input.nextInt();
        System.out.println("Please enter how high it will go: ");
        long value2=input.nextInt();
        
        for(long i=0; i<value2; i=i+value1){
            System.out.printf("%d\n",i);
        }
    }
    
}
