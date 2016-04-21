
public class DiceGame2 {
	
	private String name;
	private int diceCount;
	private int points;
	
	public DiceGame2 (String name, int diceCount, int points)
	{
		this.name = name;
		this.diceCount = diceCount;
		this.points = points;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDiceCount (int diceCount)
	{
		this.diceCount = diceCount;
	}
	public void setPoints(int points)
	{
		this.points = points;
	}
	public String getName()
	{
		return name;
	}
	public int getDiceCount()
	{
		return diceCount;
	}
	public int getPoints()
	{
		return points;
	}
	public int getDiceNumber()
	{
		int diceNum = diceCount * (1 + (int)(Math.random()*6));
		return diceNum;		
	}
	public String toString()
	{
		return String.format("%s,\nplayed with %d dices.\nTotal points: %d", name, diceCount, points);
	}

}
