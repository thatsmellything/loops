package controller;

import javax.swing.JOptionPane;
import model.Swim;
public class loopscont
{

	public void Start()
	{
	//	loops();
		askUser();
	}
	//While loops need a predefined variable and that variable must change at some point otherwise it will be infinite
		// loop and you will be a sad boi
		private void loops()
		{
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
		private void askUser()
		{
			String response = JOptionPane.showInputDialog(null, "What is the distance?");
			Swim userSwim = new Swim();
			while (!validDouble(response))
			{
				response = JOptionPane.showInputDialog(null, "No! type in a valid number!");
			}
			userSwim.setDistance(Double.parseDouble(response));
		}
	
		//--------Catch ERRORS------------
				public boolean validInt(String example)
				{
					boolean isValid = false;
					
					//Immediately assign create and make a value equal to something. then return that
					try
					{
						Integer.parseInt(example);
						isValid = true;
						
					}
					
					catch(NumberFormatException error)
					{
						System.out.println("Type in a valid number boi");
					}
					return isValid;
					//always put return at the bottom for the boolean or else you get red death
				}
				
				public boolean validDouble(String example)
				{
					boolean isValid = false;
					
					try
					{
						Double.parseDouble(example);
						isValid = true;
					}
					catch(NumberFormatException error)
					{
						System.out.println("Only floating values are allowed for input");
					}
					
					return isValid;
				}
				
}
