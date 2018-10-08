package controller;

import javax.swing.JOptionPane;
import model.Swim;
import java.util.ArrayList;
public class loopscont
{
	private Swim userSwim;

	public void Start()
	{
	//	loops();
	//	askUser();
		lotsofswim();
		practice();
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
	
		private void lotsofswim()
		{
			//Local variables are only visible in the method they are defined in
			//they only have scope to that method
			ArrayList<Swim> mySwims = new ArrayList<Swim>();
			
			ArrayList<Integer> myNums = new ArrayList<Integer>();
			//have to use a wrapper class to hold primative in a list IE Double Integer
			
			Swim sampleSwim = new Swim();
			Swim otherSwim = new Swim();
			
			//You can duplicate the things inside of the list
			mySwims.add(sampleSwim);
			mySwims.add(sampleSwim);
			mySwims.add(otherSwim);
			//Standard forward loop
			//If you want to remove something then you should go backwards aka index -=1
			//Going backwards prevents the list from bumping up say number 4 to number 3 and missing it in the
			//checking process. f you call add then no data is lost, everything either moves to the right or
			//is placed in the back by default
			// .set changes the data in the value
			for (int index = 0; index < mySwims.size(); index += 1)
			{
				//Good for display or minor changes
				JOptionPane.showMessageDialog(null, mySwims.get(index).getName());
				
				//Good for remove, replace, change multiple values
				Swim currentSwim = mySwims.get(index);
				currentSwim.setName("This new name is " +  index + " swim");
				currentSwim.setDistance(index * (int) (Math.random()*500));
			}
			//THIS IS HOW TO GO THROUGH A LIST BACKWARDS!
			for (int index = mySwims.size() -1; index >= 0; index -= 1)
			{
				
			}
			for (Swim current: mySwims)
			{
				JOptionPane.showMessageDialog(null, "The swim is named: "+ current.getName());
			}
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
				





public void practice()
{
	//Do while loop that will add 1 to a variable named bam and print it while x is less
	//than ten. But every time it goes through the loop it adds one to x
	int x = 0;
	int bam = 0;
	do {
		System.out.println("x is a small boy " + bam);
		bam = bam + 1;	
		x=x+1;
	} while (x<10);
	
	//creates variable botta equal to 0. if botta is less than bing, it prints
	//a sentence out along with the curent value of botta ntil botta is equal to bing
	int bing = 20;
	for (int botta = 0; botta<bing; botta+=1)
	{
		System.out.println("This will print 20 tumes and this is number " + botta);
	}
}



}










