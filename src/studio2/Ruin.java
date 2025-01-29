package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//System.out.print("Enter a starting value: ");
		//double startAmount = in.nextInt();
		int startAmount = 500;
		double winLimit = 1000.0 ; 
		double winChange = 500;
		int totalGames = 0; 
		double newAmount = 0; 
		
		
		while (totalGames < 100) {
			totalGames++;
			System.out.println(totalGames);

			while (startAmount <= winLimit || startAmount == 0) {
				double winChance = Math.random();
				if (winChance >= .5) {
					newAmount = startAmount + winChange; 
					System.out.println(newAmount);
					totalGames=totalGames++;

					
				} else; {
					newAmount = startAmount - winChange;
					System.out.println(newAmount);
					totalGames=totalGames++;

				}
				
			}
				
			
		}		
			
		
	}
}
