package poker;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		int numPlayers;
		System.out.println("How many players in this game?");
		s = in.nextLine();
		numPlayers = Integer.parseInt(s);
		
		while(numPlayers < 2 || numPlayers > 4){
			System.out.println("Wrong number of players. Please enter a number between 2 and 4.");
			s = in.nextLine();
			numPlayers = Integer.parseInt(s);
		}
		
		Game g = new Game(numPlayers);
		g.run();
		System.out.println(g.getFinalScore());

	}

}
