package rps.controller;

import rps.model.*;
import rps.view.*;

public class RPSController
{
	private RockPaperScissors myRPS;
	private RPSFrame myFrame;
	private RPSPanel myPanel;
	
	public RPSController()
	{
		myRPS = new RockPaperScissors();
		myFrame = new RPSFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void shutDown()
	{
		System.exit(0);
	}
	
	public String gameRunner()
	{
		String results = "I broke";
		if(myPanel.getModeLabel().getText().equals("Singleplayer"))
		{
			if(myRPS.processChoise().equals("rock"))
			{
				if(myPanel.getPlayer1().equals("rock"))
				{
					results = "tie";
					return results;
				}
				else if(myPanel.getPlayer1().equals("paper"))
				{
					results = "Player1 wins";
					return results;
				}
				else if(myPanel.getPlayer1().equals("scissors"))
				{
					results = "I win";
					return results;
				}
			}
			else if(myRPS.processChoise().equals("paper"))
			{
				if(myPanel.getPlayer1().equals("rock"))
				{
					results = "I win";
					return results;
				}
				else if(myPanel.getPlayer1().equals("paper"))
				{
					results = "Tie";
					return results;
				}
				else if(myPanel.getPlayer1().equals("scissors"))
				{
					results = "Player1 wins";
					return results;
				}
			}
			else if(myRPS.processChoise().equals("scissors"))
			{
				if(myPanel.getPlayer1().equals("rock"))
				{
					results = "Player1 wins";
					return results;
				}
				else if(myPanel.getPlayer1().equals("paper"))
				{
					results = "I win";
					return results;
				}
				else if(myPanel.getPlayer1().equals("scissors"))
				{
					results = "tie";
					return results;
				}
			}
		}
		else
		{
			if(myPanel.getPlayer2().equals("rock"))
			{
				if(myPanel.getPlayer1().equals("rock"))
				{
					results = "tie";
					return results;
				}
				else if(myPanel.getPlayer1().equals("paper"))
				{
					results = "Player1 wins";
					return results;
				}
				else if(myPanel.getPlayer1().equals("scissors"))
				{
					results = "I win";
					return results;
				}
			}
			else if(myPanel.getPlayer2().equals("paper"))
			{
				if(myPanel.getPlayer1().equals("rock"))
				{
					results = "I win";
					return results;
				}
				else if(myPanel.getPlayer1().equals("paper"))
				{
					results = "Tie";
					return results;
				}
				else if(myPanel.getPlayer1().equals("scissors"))
				{
					results = "Player1 wins";
					return results;
				}
			}
			else if(myPanel.getPlayer2().equals("scissors"))
			{
				if(myPanel.getPlayer1().equals("rock"))
				{
					results = "Player1 wins";
					return results;
				}
				else if(myPanel.getPlayer1().equals("paper"))
				{
					results = "I win";
					return results;
				}
				else if(myPanel.getPlayer1().equals("scissors"))
				{
					results = "tie";
					return results;
				}
			}
		}
		return results;	
	}

	public RockPaperScissors getMyRPS()
	{
		return myRPS;
	}

	public void setMyRPS(RockPaperScissors myRPS)
	{
		this.myRPS = myRPS;
	}

	public RPSFrame getMyFrame()
	{
		return myFrame;
	}

	public void setMyFrame(RPSFrame myFrame)
	{
		this.myFrame = myFrame;
	}

	public RPSPanel getMyPanel()
	{
		return myPanel;
	}

	public void setMyPanel(RPSPanel myPanel)
	{
		this.myPanel = myPanel;
	}
	
	
}
