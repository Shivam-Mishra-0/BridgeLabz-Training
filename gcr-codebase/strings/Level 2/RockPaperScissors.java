//Creating a class name with RockPaperScissors.
import java.util.Scanner;
public class RockPaperScissors {
	public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); 
        return getChoiceName(choice);
    }

    private static String getChoiceName(int idx) {
        if (idx == 0) return "Rock";
        if (idx == 1) return "Paper";
        return "Scissors";
    }
    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Tie";
        
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }
    public static String[][] calculateStats(int uWins, int cWins, int total) {
        String[][] stats = new String[2][3];
        
        double uPerc = ((double) uWins / total) * 100;
        double cPerc = ((double) cWins / total) * 100;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(uWins);
        stats[0][2] = String.format("%.2f%%", uPerc);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(cWins);
        stats[1][2] = String.format("%.2f%%", cPerc);

        return stats;
    }
    public static void displayResults(String[][] history, String[][] stats) {
        System.out.println("\n--- GAME HISTORY ---");
        System.out.println("Round\tUser\t\tComp\t\tWinner");
        for (int i = 0; i < history.length; i++) {
            System.out.println((i + 1) + "\t" + history[i][0] + "\t\t" + history[i][1] + "\t\t" + history[i][2]);
        }
        System.out.println("Player\tTotal Wins\tWin Percentage");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t\t" + row[2]);
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of games you want to play: ");
        int totalGames = sc.nextInt();

        String[][] gameHistory = new String[totalGames][3]; 
        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.println("\n--- Round " + (i + 1) + " ---");
            System.out.print("Enter choice (0: Rock, 1: Paper, 2: Scissors): ");
            int userChoiceIdx = sc.nextInt();
            
            String userChoice = getChoiceName(userChoiceIdx);
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            gameHistory[i][0] = userChoice;
            gameHistory[i][1] = compChoice;
            gameHistory[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, totalGames);
        displayResults(gameHistory, stats);
        
        sc.close();
    }
}