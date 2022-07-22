//Antonio Yamir Ledesma Briones
package whileloop;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        
        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.print("Would you like to take this song off of repeat? If so, answer yes: ");
            
            String userInput = input.next();
            
            System.out.println("");
            if (userInput.equals("yes")){ 
            isOnRepeat = false;            
            }
        }
    }
    
}
