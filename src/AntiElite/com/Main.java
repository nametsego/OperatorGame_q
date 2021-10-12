package AntiElite.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game *blam blam*" );
        }else{
            System.out.println("You dismissed the game!");

        }

    }
}
