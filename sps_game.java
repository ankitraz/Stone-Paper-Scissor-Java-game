import java.util.Scanner;
import java.util.Random;

public class sps_game {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("0. stone 1. paper 2.scissor");
        System.out.println("Enter your choice: ");
        int user = sc.nextInt();
        int bot = r.nextInt(3);
        System.out.println("------------------------------------------------");
        switch (user) {
            case 0:
                System.out.println("User - Stone");
                break;
            case 1: {
                System.out.println("User - Paper");
                break;
            }
            case 2: {
                System.out.println("User - Scissor");
                break;
            }
            default:
                System.out.println("Invalid choice.");
        }

        switch (bot) {
            case 0:
                System.out.println("Bot - Stone");
                break;
            case 1: {
                System.out.println("Bot - Paper");
                break;
            }
            case 2: {
                System.out.println("Bot - Scissor");
                break;
            }
            default:
                System.out.println("Invalid choice.");
        }
        System.out.println("------------------------------------------------");
        if (bot == user) {
            System.out.println("Draw!");
        } else if (bot == 0 && user == 1) {
            System.out.println("User wins.");
        } else if (bot == 0 && user == 2) {
            System.out.println("Bot wins.");
        } else if (bot == 1 && user == 0) {
            System.out.println("Bot wins.");
        } else if (bot == 1 && user == 2) {
            System.out.println("User wins.");
        } else if (bot == 2 && user == 0) {
            System.out.println("User wins.");
        } else if (bot == 2 && user == 1) {
            System.out.println("Bot wins.");
        }
    }
}
