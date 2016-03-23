package rps.view;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

import rps.controller.RPSController;

public class RPSPanel extends JPanel
{
	private RPSController baseController;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private JButton rockButton;
	private JButton paperButton;
	private JButton scissorsButton;
	private JButton modeButton;
	private JButton submitButton;
	private JButton quitButton;
	private JTextArea winArea;
	private JLabel modeLabel;
	private String player1;
	private String player2;
	private boolean quit;
	
	
	public RPSPanel(RPSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		modeLabel = new JLabel("Singleplayer");
		rockButton = new JButton("Rock");
		paperButton = new JButton("Paper");
		scissorsButton = new JButton("Scissors");
		modeButton = new JButton("Change your mode");
		submitButton = new JButton("See the outcome");
		quitButton = new JButton("Quit");
		winArea = new JTextArea(10, 30);

		player1 = "";
		player2 = "";
		
		setupRPSPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, winArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, winArea, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, winArea, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, quitButton, 0, SpringLayout.NORTH, modeButton);
		baseLayout.putConstraint(SpringLayout.EAST, quitButton, -23, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 199, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, modeButton, 20, SpringLayout.EAST, modeLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, modeButton, 250, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, paperButton, -22, SpringLayout.NORTH, modeButton);
		baseLayout.putConstraint(SpringLayout.NORTH, scissorsButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 6, SpringLayout.EAST, paperButton);
		baseLayout.putConstraint(SpringLayout.WEST, paperButton, 6, SpringLayout.EAST, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, rockButton, 174, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rockButton, -72, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, modeLabel, 255, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, modeLabel, 10, SpringLayout.WEST, this);
		
	}
	
	private void setupRPSPane()
	{
		textPane = new JScrollPane(winArea);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 0, SpringLayout.WEST, textPane);
		winArea.setLineWrap(true);
		winArea.setWrapStyleWord(true);
		winArea.setEditable(false);
		textPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(textPane);
		this.add(modeButton);
		this.add(modeLabel);
		this.add(rockButton);
		this.add(paperButton);
		this.add(scissorsButton);
		this.add(submitButton);
		this.add(quitButton);
		


		
		winArea.setEnabled(false);
	}
	
	private void setupListeners()
	{
		modeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				if (modeLabel.getText().equals("Singleplayer"))
				{
					modeLabel.setText("Multiplayer");
				}
				else
				{
					modeLabel.setText("Singleplayer");
				}
			}
		});
		
		rockButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (modeLabel.getText().equals("Multiplayer"))
				{
					if(player1.equals(""))
					{
						player1 = "rock";
					}
					else
					{
						player2 = "rock";
					}
				}
				else
				{
					player1 = "rock";
				}
			}
			
		});
		
		paperButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (modeLabel.getText().equals("Multiplayer"))
				{
					if(player1.equals(""))
					{
						player1 = "paper";
					}
					else
					{
						player2 = "paper";
					}
				}
				else
				{
					player1 = "paper";
				}
				
			}
		});
		
		scissorsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (modeLabel.getText().equals("Multiplayer"))
				{
					if(player1.equals(""))
					{
						player1 = "scissors";
					}
					else
					{
						player2 = "scissors";
					}
				}
				else
				{
					player1 = "scissors";
				}
				
			}
		});
		
		quitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				quit = true;
			}
		});
		
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				winArea.setText(baseController.gameRunner());
			}
		});
		
		

	}

	public RPSController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(RPSController baseController)
	{
		this.baseController = baseController;
	}

	public SpringLayout getBaseLayout()
	{
		return baseLayout;
	}

	public void setBaseLayout(SpringLayout baseLayout)
	{
		this.baseLayout = baseLayout;
	}

	public JScrollPane getTextPane()
	{
		return textPane;
	}

	public void setTextPane(JScrollPane textPane)
	{
		this.textPane = textPane;
	}

	public JButton getRockButton()
	{
		return rockButton;
	}

	public void setRockButton(JButton rockButton)
	{
		this.rockButton = rockButton;
	}

	public JButton getPaperButton()
	{
		return paperButton;
	}

	public void setPaperButton(JButton paperButton)
	{
		this.paperButton = paperButton;
	}

	public JButton getScissorsButton()
	{
		return scissorsButton;
	}

	public void setScissorsButton(JButton scissorsButton)
	{
		this.scissorsButton = scissorsButton;
	}

	public JButton getModeButton()
	{
		return modeButton;
	}

	public void setModeButton(JButton modeButton)
	{
		this.modeButton = modeButton;
	}

	public JTextArea getWinArea()
	{
		return winArea;
	}

	public void setWinArea(JTextArea winArea)
	{
		this.winArea = winArea;
	}

	public JLabel getModeLabel()
	{
		return modeLabel;
	}

	public void setModeLabel(JLabel modeLabel)
	{
		this.modeLabel = modeLabel;
	}

	public JButton getSubmitButton()
	{
		return submitButton;
	}

	public void setSubmitButton(JButton submitButton)
	{
		this.submitButton = submitButton;
	}

	public String getPlayer1()
	{
		return player1;
	}

	public void setPlayer1(String player1)
	{
		this.player1 = player1;
	}

	public String getPlayer2()
	{
		return player2;
	}

	public void setPlayer2(String player2)
	{
		this.player2 = player2;
	}
	public boolean getQuit()
	{
		return quit;
	}
	
	
}
