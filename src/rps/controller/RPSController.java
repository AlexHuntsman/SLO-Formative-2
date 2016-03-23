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
	
	
	public String gameRunner()
	{
		//if they submit without picking
		String results = "You did not pick";
		//if in singleplayer mode
		if(myFrame.getBasePanel().getModeLabel().getText().equals("Singleplayer"))
		{
			if(myRPS.processChoise().equals("rock"))
			{
				if(myFrame.getBasePanel().getPlayer1().equals("rock"))
				{
					results = "tie";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("paper"))
				{
					results = "Player1 wins";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("scissors"))
				{
					results = "I win";
					return results;
				}
			}
			else if(myRPS.processChoise().equals("paper"))
			{
				if(myFrame.getBasePanel().getPlayer1().equals("rock"))
				{
					results = "I win";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("paper"))
				{
					results = "Tie";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("scissors"))
				{
					results = "Player1 wins";
					return results;
				}
			}
			else if(myRPS.processChoise().equals("scissors"))
			{
				if(myFrame.getBasePanel().getPlayer1().equals("rock"))
				{
					results = "Player1 wins";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("paper"))
				{
					results = "I win";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("scissors"))
				{
					results = "tie";
					return results;
				}
			}
		}
		//if in multiplayer mode
		else
		{
			if(myFrame.getBasePanel().getPlayer2().equals("rock"))
			{
				if(myFrame.getBasePanel().getPlayer1().equals("rock"))
				{
					results = "tie";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("paper"))
				{
					results = "Player1 wins";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("scissors"))
				{
					results = "Player2 wins";
					return results;
				}
			}
			else if(myFrame.getBasePanel().getPlayer2().equals("paper"))
			{
				if(myFrame.getBasePanel().getPlayer1().equals("rock"))
				{
					results = "Player2 wins";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("paper"))
				{
					results = "Tie";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("scissors"))
				{
					results = "Player1 wins";
					return results;
				}
			}
			else if(myFrame.getBasePanel().getPlayer2().equals("scissors"))
			{
				if(myFrame.getBasePanel().getPlayer1().equals("rock"))
				{
					results = "Player1 wins";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("paper"))
				{
					results = "Player2 wins";
					return results;
				}
				else if(myFrame.getBasePanel().getPlayer1().equals("scissors"))
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
