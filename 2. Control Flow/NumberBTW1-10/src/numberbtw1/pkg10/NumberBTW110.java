//Antonio Yamir Ledesma Briones
package numberbtw1.pkg10;

import java.util.Scanner;

public class NumberBTW110 {

    public static void main(String[] args) {
        System.out.print("Pick a number between 1 and 10: ");
        
        Scanner scanner  = new Scanner(System.in);
        int inputtedNum =scanner.nextInt();
        System.out.println("");
        
        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        }
        else{
            System.out.println("Your shoe selection will make you happy today");
        }       
    }
    
}
