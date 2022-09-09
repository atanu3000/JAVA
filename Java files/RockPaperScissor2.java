import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor2{
public static String generateComputerChoice( Random  random){
int wordNumber;
wordNumber = random.nextInt( 3 ) + 1;
 String computerChoice = "";
        if( wordNumber == 1 ){
            computerChoice = "rock";
        }else if( wordNumber == 2 ){
            computerChoice = "paper";
        }else if( wordNumber == 3 ){
            computerChoice = "scissors";
        }

        System.out.println( "\nThe Computer already made it's choice" );
        return computerChoice;
}
    public static void showMenu(){
System.out.println( "Options to choose from :\n1.Rock\n2.Paper\n3.Scissors" );
 }
 public static String getUserChoice( Scanner scanner ){
        String userWordChoice = "";
        System.out.print( "\nPlease make yours : " );
        userWordChoice = scanner.nextLine();
        //Returning the user choice
        return userWordChoice;
    }
    public static String chooseWinner( String computerChoice, String userChoice ){
        String winner = "No Winner";
        String customMessage = "Both choose same";
        String finalMessage = "";
        if( computerChoice.equals( "rock" ) && userChoice.equalsIgnoreCase( "scissors" ) ){
            winner = "Computer";
        }else if( userChoice.equalsIgnoreCase( "rock" ) && computerChoice.equals( "scissors" ) ){
            winner = "User";
        }
        if( computerChoice.equals( "scissors" ) && userChoice.equalsIgnoreCase( "paper" ) ){
            winner = "Computer";
        }else if( userChoice.equalsIgnoreCase( "scissors" ) && computerChoice.equals( "paper" ) ){
            winner = "User";
        }

        if( computerChoice.equals( "paper" ) && userChoice.equalsIgnoreCase( "rock" ) ){
            winner = "Computer";
        }else if( userChoice.equalsIgnoreCase( "paper" ) && computerChoice.equals( "rock" ) ){
            winner = "User";
        }
        finalMessage = winner + " won ";
       return finalMessage;
    }
    public static void main( String [] args ){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerChoice;
        String userChoice;
        String winner;
        showMenu();
        computerChoice = generateComputerChoice( random );
        userChoice = getUserChoice( scanner );
        winner = chooseWinner( computerChoice, userChoice );
        System.out.println( "\nYou choose : " + userChoice + "\nComputer choose : " +computerChoice );
        System.out.println( winner );
}
}