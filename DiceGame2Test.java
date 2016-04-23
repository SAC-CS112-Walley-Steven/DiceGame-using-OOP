import java.util.Scanner;

import javax.swing.JOptionPane;

public class DiceGame2Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int win = 0, playAgain =0;
		
		DiceGame2 dice = new DiceGame2("Name",1,0);
		
		String name = JOptionPane.showInputDialog("Enter Name: ");
		dice.setName(name);
		
		int diceCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of Dice to play with: "));
		dice.setDiceCount(diceCount);
		
		String welcome = String.format("Hi %s,\nWelcome to the Dice Game!", dice.getName());
		
		do
		{
		
		int userInput = Integer.parseInt(JOptionPane.showInputDialog("Press 1 for odd, 2 for even: "));
		
		int diceNum = dice.getDiceNumber();
		JOptionPane.showMessageDialog(null, "Dice number is "+ diceNum);
		
		if (userInput % 2 == 0)
		{
			if (diceNum % 2 == 0)
			{
				JOptionPane.showMessageDialog(null, "You win!");
				win++;
				dice.setPoints(win);
			}
			else
				JOptionPane.showMessageDialog(null, "You lose..");
		}
		if (userInput % 2 != 0)
		{
			if (diceNum % 2 != 0)
			{
				JOptionPane.showMessageDialog(null, "You win!");
				win++;
				dice.setPoints(win);
			}
			else
				JOptionPane.showMessageDialog(null, "You lose..");
		}
		
		playAgain = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to play again or 2 to exit: "));
		
		}
		while (playAgain == 1);

		JOptionPane.showMessageDialog(null, dice);
	}

}

// Good job, and may I count on you to explain to the class how the toString worked for your Automobilt object?  I know you can do it.
// I'm horrible at explaining things..
