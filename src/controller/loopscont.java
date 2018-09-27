package controller;

import javax.swing.JOptionPane;
import model.Swim;
public class loopscont
{
	private Swim userSwim;

	public void Start()
	{
	//	loops();
		askUser();
	}
	//While loops need a predefined variable and that variable must change at some point otherwise it will be infinite
		// loop and you will be a sad boi
		private void loops()
		{
			//While loop
			int count = 0;
			boolean isDone = false;
			while (!isDone)
			{
				count++;
				JOptionPane.showMessageDialog(null, "Brother may i have some oats");
				if(count>10)
				{
					isDone=true;
				}
			}
			int ab = 0;
			while (ab <= 10)
			{
				JOptionPane.showMessageDialog(null, ab);
				ab++;
			}
			
			//for loop
			for (int loop=0; loop<30; loop += 2)
			{
				JOptionPane.showInputDialog(null, "The loop value is " + loop);
			}
			
			
		}
		
		//loops with user input
		public void askUser()
		{
			Swim userSwim = new Swim();
			//Name
			String userName = JOptionPane.showInputDialog(null, "What is your name?");
			userSwim.setName(userName);

			//Distance
			String userSwimDistance = JOptionPane.showInputDialog(null, "What is the distance you swam today?");
			if (userSwimDistance == null || userSwimDistance.equals(""))
			{
				JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing >:(");	
			}
			
			//this will make it so that if the answer is nothing aka null or if the answer isnt what we want it will
			//continue to ask the question and it wont crash your system
			while (userSwimDistance == null && !validDouble(userSwimDistance))
			{
				userSwimDistance = JOptionPane.showInputDialog(null, "No! type in a valid number!");
			}
			userSwim.setDistance(Double.parseDouble(userSwimDistance));
		
			//Stroke
			String userStroke = JOptionPane.showInputDialog(null, "What is your favorite stroke?");
			userSwim.setStroke(userStroke);
			if (userStroke == null || userStroke.equals(""))
			{
				JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing >:(");	
			}
			
			
			//Fastest time in favorite stroke
			String userTime = JOptionPane.showInputDialog(null, "What is your fastest time in your favorite stroke?");
			if (userTime == null || userTime.equals(""))
			{
				JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing >:(");	
			}
			while (userTime == null && !validDouble(userTime))
			{
				userTime = JOptionPane.showInputDialog(null, "Nah man thats not a time");
			}
			userSwim.setTime(Double.parseDouble(userTime));
			
			
			JOptionPane.showMessageDialog(null, userSwim);
		}
	
		//--------Catch ERRORS------------
				public boolean validInt(String maybeInt)
				{
					boolean isValid = false;
					
					//Immediately assign create and make a value equal to something. then return that
					try
					{
						Integer.parseInt(maybeInt);
						isValid = true;
						
					}
					
					catch(NumberFormatException error)
					{
						JOptionPane.showMessageDialog(null, "You should type an actual number value!!!");
					}
					return isValid;
					//always put return at the bottom for the boolean or else you get red death
				}
				public boolean validDouble(String maybeDouble)
				{
					boolean isValid = false;
					
					try
					{
						Double.parseDouble(maybeDouble);
						isValid = true;
					}
					catch(NumberFormatException error)
					{
						JOptionPane.showMessageDialog(null, "You should type a double value aka a decimal point boi");
					}
					
					return isValid;
				}
				public boolean validBool(String maybeBool)
				{
					boolean isValid = false;
					try
					{
						Boolean.parseBoolean(maybeBool);
						isValid = true;
					}
					catch(IllegalArgumentException error)
					{
						JOptionPane.showMessageDialog(null, "Type in a boolean value IE treu or false ");
					}
					return isValid;
				}
				
}
