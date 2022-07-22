//Antonio Yamir Ledesma Briones
package challenge;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        String question = "What is the smallest Country?: "; 
        String choiceOne = "Monaco";
        String choiceTwo = "Vaticano";
        String choiceThree = "Cocos Islands"; 
        String correctAnswer = choiceTwo;
        String choiceUser;
        String type;
        boolean repeat = true;
        
        while(repeat == true){
        
        //Write a print statement asking the question
        System.out.print(question);
        //Write a print statement givin the answer choices
        System.out.println("\nChoice One: Monaco\nChoice Two: Vaticano\nChoice Three: Cocos Island");
        
        //Have the user input an answer
        //Retrieve the user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Type your answer: ");
        choiceUser = input.next();
        
        //If the user's input matches the correct Answer
        //then the user is correct and we want to print out a congrats message to the user.
        if(choiceUser.equals(correctAnswer)){
            System.out.println("Congratulations, your answer is correct");
            System.out.println("The smallest country is "+ correctAnswer);
            repeat = false;
        }
        //If the user's input does not match the correctAnswer...
        //then the user is incorrect and we want to print out a message saying thte the user is
        else{
            System.out.println("Your answer: " + choiceUser + " is incorrect");
            System.out.print("Do you want to try again? Type yes: ");
            type = input.next();
            
            if (type.equals("yes")) {
               repeat = true;
            }
            else
            {
                repeat = false;
            }
        }
        }
        
        
    }
    
}
