
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String playerA = "";
            String playerB = "";
            String trash = "";
            String playAgain = "";
            boolean done = false;
        System.out.println("Welcome to Rock Paper Scissors!");
            do {
                do {
                System.out.print(" Player A - R, P, or S: ");
                playerA = input.nextLine();
                    if (playerA.equalsIgnoreCase("R")) {
                        do {
                            System.out.print(" Player B - R, P, or S: ");
                            playerB = input.nextLine();
                            if (playerB.equalsIgnoreCase("R")) {
                                System.out.print("Rock ties with Rock!");
                                input.nextLine();
                                done = true;
                            } else if (playerB.equalsIgnoreCase("P")) {
                                System.out.print("Paper beats Rock! Player B Wins!");
                                input.nextLine();
                                done = true;
                            } else if (playerB.equalsIgnoreCase("S")) {
                                System.out.print("Rock beats Scissors! Player A Wins!");
                                done = true;
                            } else {
                                trash = input.nextLine();
                                System.out.print("The input of " + trash + " is invalid! Please try again!");
                            }
                        }while (!done);
                    } else if (playerA.equalsIgnoreCase("P")) {
                        do {
                            System.out.print(" Player B - R, P, or S: ");
                            playerB = input.nextLine();
                            if (playerB.equalsIgnoreCase("R")) {
                                System.out.print("Paper beats Rock! Player A Wins!");
                                done = true;
                            } else if (playerB.equalsIgnoreCase("P")) {
                                System.out.print("Paper ties with Paper!");
                                done = true;
                            } else if (playerB.equalsIgnoreCase("S")) {
                                System.out.print("Scissors beats Paper! Player B Wins!");
                                done = true;
                            } else {
                                trash = input.nextLine();
                                System.out.print("The input of " + trash + " is invalid! Please try again!");
                            }
                        }while (!done);
                    } else if (playerA.equalsIgnoreCase("S")) {
                        do {
                            System.out.print(" Player B - R, P, or S: ");
                            playerB = input.nextLine();
                            if (playerB.equalsIgnoreCase("R")) {
                                System.out.print("Rock beats Scissors! Player B Wins!");
                                done = true;
                            } else if (playerB.equalsIgnoreCase("P")) {
                                System.out.print("Scissors beats Paper! Player A Wins!");
                                done = true;
                            } else if (playerB.equalsIgnoreCase("S")) {
                                System.out.print("Scissors ties with Scissors!");
                                done = true;
                            } else {
                                trash = input.nextLine();
                                System.out.print("The input of " + trash + " is invalid! Please try again!");
                            }
                        }while (!done);
                    } else {
                        trash = input.nextLine();
                        System.out.print("The input of " + trash + " is invalid! Please try again!");
                    }
                }while (!done);
                    System.out.print(" Would you like to play again? (Y/N) ");
                    playAgain = input.nextLine();
            }while(playAgain.equalsIgnoreCase("Y"));
                }
            }




