

package tablecalculator;

import java.util.Scanner;


public class TableCalculator {

    public static void main(String[] args) {
        //new scanner object
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the first number of the table: ");
        int value1=input.nextInt();
        System.out.println("Please enter how high it will go: ");
        long value2=input.nextInt();
        // for loop explained for(declare long i and set value to 0: as long as i<value2, the program will continue: add whatever the user specified)
        for(long i=0; i<value2; i=i+value1){
            //i forgot what this does
            System.out.printf("%d\n",i);
        }
    }
    
}
