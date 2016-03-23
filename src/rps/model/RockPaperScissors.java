package rps.model;

public class RockPaperScissors
{

	private String computer;
	
	public RockPaperScissors()
	{
		this.computer = computer;
	}
	public String processChoise()
	{
		int randomChoise = (int) (Math.random() * 3);
		
		switch (randomChoise)
		{
			case 0:
				computer = "rock";
				break;
			case 1:
				computer = "paper";
				break;
			case 2:
				computer = "scissors";
				break;
			default:
				break;
		}
		return computer;
	}
	
	public String getComputer()
	{
		return computer;
	}

}
