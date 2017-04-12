

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer between 1 and 100: ");
        int userInput = scan.nextInt();


        if (userInput % 2 != 0 && userInput < 59) {
            System.out.println(userInput + " odd");

        } else if (userInput % 2 == 0 && userInput <= 25) {
            System.out.println("Even and less that 25");
        } else if (userInput % 2 == 0 && userInput >= 26 && userInput <= 60) {
            System.out.println("Even");
        } else if (userInput % 2 == 0 && userInput > 60 && userInput < 100) {
            System.out.println(userInput + "Even");
        } else if (userInput % 2 != 0 && userInput > 60 && userInput < 100) {
            System.out.println(userInput + " Odd and over 60");
        } else if(userInput > 100); {
            System.out.println("You can't follow directions");
        }

    }
}




