//Antonio Yamir Ledesma Briones
package inputandoutput;

import java.util.Scanner;

public class InputAndOutput {

    public static void main(String[] args) {
        double studentGPA = 3.45;
        String studentFirstName = "Antonio";
        String studentLastName = "Ledesma";
        
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.print("\nWhat do you want to update it to? ");
        
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        
        System.out.println();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);
        
        
        
    }
    
}
