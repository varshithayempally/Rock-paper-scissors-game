import java.util.Scanner;
import java.util.Random;
public class Rockpaperscissors {
    public static void main(String[]args){
        final int ROCK=1;
        final int PAPER=2;
        final int SCISSORS=3;
        Scanner Scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("choose your  move:");
        System.out.println("1-Rock");
        System.out.println("2-Paper");
        System.out.println("3-Scissors");
        int userchoice=Scanner.nextInt();
        int computerchoice=random.nextInt(3)+1;
        System.out.println("computer chose:"+getchoicename(computerchoice));
        if(userchoice==computerchoice){
            System.out.println("its a tie!");
        }else if((userchoice == ROCK && computerchoice == SCISSORS)||
        (userchoice==PAPER && computerchoice==ROCK)||
        (userchoice==SCISSORS && computerchoice==PAPER)){
            System.out.println("you win!");
        }else{
            System.out.println("computer wins!");
        }
        Scanner.close();
        }
        public static String getchoicename(int choice){
            switch(choice){
                case 1:return"ROCK";
                case 2:return"PAPER";
                case 3:return"SCISSORS";
                default:return"unknown";
            }
        }
}
