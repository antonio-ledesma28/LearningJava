//Antonio Yamir Ledesma Briones
package callingfunction;

import java.util.Scanner;

public class CallingFunction {
    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.print("Type in a random word and press Enter to start developer tea time: ");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
        announceDeveloperTeaTime();
        System.out.println("Write code");
        System.out.println("Review Code");
        announceDeveloperTeaTime();
        System.out.println("Get promoted");
    }
    
}
