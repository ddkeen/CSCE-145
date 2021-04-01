/*
 * David Keen
 * 9/12/19
 * CS 145
 * Homework 2 - Choose your own adventure
 */
import java.util.Scanner;
public class Bandersnatch 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		//opening dialogue, first decision - boolean
		System.out.println("(BEEP BEEP BEEP) You're a student at USC and your 9AM alarm is going off. Do you want to hit snooze? Enter true or false.");
		boolean snooze = key.nextBoolean();
		if(snooze)
		{
			//decision 2.1 - String
			System.out.println("Oh no! You overslept and missed class! Now would you rather go workout at the gym or go to the library. Enter gym or library.");
			String place = key.next();
			if(place.equalsIgnoreCase("gym"))
			{
				//decision 3.1 - numerical comparison
				System.out.println("It's Leg Day! Time to deadlift. How many pounds do you want to put on the bar? You've never done more than 100.... You're kinda weak.");
				int pounds = key.nextInt();
				if(pounds>100)
				{
					//outcome #1, 3 decisions
					System.out.println("You feel a sharp pain in your leg....You pulled your harmstring! I guess today just wasn't your day. Try again tomorrow.");
					System.out.println("Thanks for playing!");
					System.exit(0);
				}
				else
				{
					//decision 4.1 - boolean
					System.out.println("While you're lifting, you spot Dwayne The Rock Johnson squating 600 pounds. Do you choose to walk up to him? Enter true or false.");
					boolean rock = key.nextBoolean();
					if(rock)
					{
						//outcome #2, 4 decisions
						System.out.println("You meet The Rock. You start lifting with The Rock. You become huge like The Rock. You join the WWE like The Rock. You make millions like The Rock. You live the life of your dreams.");
						System.out.println("Thanks for playing!");
						System.exit(0);
					}
					else
					{
						//decision 5.1 - compound boolean
						System.out.println("After lifting, you get home and have to decide what to do with your night. Do you want to play frisbee? Enter true or false.");
						boolean frisbee = key.nextBoolean();
						System.out.println("Do you want to go watch the girls soccer game vs. Clemson? Enter true or false.");
						boolean soccer = key.nextBoolean();
						if(frisbee || soccer)
						{
							//outcome #3, 5 decisions
							System.out.println("After a good night out on campus with you friends, you walk home to your dorm. At a stoplight, a blue lamborghini pulls up and out comes Billie Eilish!!! She takes you to her party and you have the best night of your life.");
							System.out.println("Thanks for playing!");
							System.exit(0);
							
						}
						else
						{
							//outcome #4, 5 decisions
							System.out.println("Since you didn't wanna go to the soccer game or frisbee practice, you stayed in. Unfortunately for you, you live on floor 18 at South Tower. Some drunk girl on 12 started making pizza and ended up setting fire to the building. You didin't make it out alive :(");
							System.out.println("Thanks for playing!");
							System.exit(0);
						}
					}
				}
			}
			else
			{
				//decision 3.2 - String
				System.out.println("To get to your study room, you need to go down four floors, do you take the elevator or the stairs? Enter stairs or elevator.");
				String floor = key.next();
				if(floor.equalsIgnoreCase("elevator"))
				{
					//outcome #5, 3 decisions
					System.out.println("You get in the elevator. The only person in there is your ex girlfriend, Jessica. The door closes, you hear a loud bang, the elevator stops, the door won't open. You are now stuck there in an elevator with your ex....");
					System.out.println("Thanks for playing!");
					System.exit(0);
				}
				else
				{
					//decision 4.2 - String
					System.out.println("You study wtih your frat bros for a while and get those mandatory study hours in. Now you're hungry and it's time to smash. Do you want Spice or Panera? Enter asian or bread.");
					String food = key.next();
					if(food.equalsIgnoreCase("asian"))
					{
						//outcome #6, 4 decisions
						System.out.println("The line for spice was really short so you got your food and left. As you walked out you got found a $100 bill! Don't spend it all in one place!");
						System.out.println("Thanks for playing!");
						System.exit(0);
					}
					else
					{
						//decision 5.2 - 3 String Options
						System.out.println("You waited for 2 hours in the Panera line, but you finally got your food. Now it's 10pm, do you want to go home, go out to the bar with your suitemates, or go to your girlfriend's house? Enter home, bar or girlfriend.");
						String night = key.next();
						if(night.equalsIgnoreCase("home"))
						{
							//outcome #7, 5 decisions
							System.out.println("You get home to your dorm and call your mom. She has great news! She won the powerball lottery! You're able to quit college and move to Hawaii. You become a pro surfer but end up drowning in a competition when you're 33.");
							System.out.println("Thanks for playing!");
							System.exit(0);

						}
						else if(night.equalsIgnoreCase("bar"))
						{
							//outcome #8, 5 decisions
							System.out.println("Congratulations, you get drunk with your friends. As you're leaving you walk into the street and get hit by a drunk driver. You spend the rest of the semester in the hospital.");
							System.out.println("Thanks for playing!");
							System.exit(0);
						}
						else
						{
							//outcome #9, 5 decisions
							System.out.println("You walk to your girlfriend's house thinking you're going to watch a movie together. Instead, she dumps you on the spot because she found a rich guy. Tough Luck bro.");
							System.out.println("Thanks for playing!");
							System.exit(0);
						}
					}
				}
			}
		}
		else
		{
			//decision 2.2 - String
			System.out.println("Now that you're up, it's time to eat breakfast. Do you want to make oatmeal or eat leftover pizza from last week's party? Enter pizza or oatmeal.");
			String breakfast = key.next();
			if(breakfast.equalsIgnoreCase("pizza"))
			{
				//outcome #10, 2 decisions
				System.out.println("You ate the pizza. It tasted good, but now your feel sick. You pass out. After months in a coma, detectives found out that you were poisoned by your roomate. It's Christmas and you still haven't woken up.");
				System.out.println("Thanks for playing!");
				System.exit(0);
			}
			else
			{
				//decision 3.3 - String
				System.out.println("You ate some oatmeal and are now ready for class. You even aced your test! Now that you're done with classes, would you like to run or read? Enter run or read.");
				String activity = key.next();
				if(activity.equalsIgnoreCase("run"))
				{
					//outcome #11, 3 decisions
					System.out.println("You decide to get some exercise so you run down near Swearingen. On your way back up the hill, you see a train approaching. The gates come down, but you think you can beat it. Unfortunately, you thought wrong and got hit by the train and died.");
					System.out.println("Thanks for playing!");
					System.exit(0);
				}
				else
				{
					//decision 4.3 - boolean
					System.out.println("You start to read \"The Beautiful and Damned\", but you fall asleep. When you wake up, you notice your wallet is gone and you see someone running away with it. Will you run after him? Enter true or false.");
					boolean run = key.nextBoolean();
					if(run)
					{
						//outcome #12, 4 decisions
						System.out.println("You run after the large man and kick him to the ground. You then realize, it's the Drug Lord EL Chapo who escaped from prison! You quickly disarm him with your Tae Kwon Do and bring him to the authorities. Good Work!");
						System.out.println("Thanks for playing!");
						System.exit(0);
					}
					else
					{
						//outcome #13, 4 decisions
						System.out.println("You say to yourself \"Money comes and goes\" and let him be. The thief then takes all your money, steals your identity, and depletes all your savings. You then have to drop out of college and work at Wendy's.");
						System.out.println("Thanks for playing!");
						System.exit(0);
						
					}
				}
			}
		}
	}

}
