import java.util.Scanner;

public class Calculations {
	
	
	public static int calc() {

		System.out.println("Select a number you would like to fight for between 15 & 100!");		                 //range of values allowed 15<num<100       
		int max = UserInput.Input(15, 100);                                                                          //User chooses up to which number he wishes to play
		System.out.println("Take turns against THE SHAFEEQ to select a number between 1-3, the first to reach the number " + max + " will be crowned NUMBER 1");
		System.out.println("Enter a USERNAME:");
		Scanner name = new Scanner(System.in);
		String user = name.nextLine();

		int sum = 0;                                                                    //This method uses the do/while loop to determine the sum of inputs from both the random number generator and user.

		boolean check;
		check = true;
		do{
			if((max-sum) == 3) {
				int first = 3;
				System.out.println("THE SHAFEEQ:" + first);                             //To avoid going over the max number, this loop determines a specific output in order to win the game despite
				sum = sum + first;                                                      //using a random generator for most of the game
				if (sum == max) {
					System.out.println("Not this time, THE SHAFEEQ is still NUMBER 1");     //Depending on what difference the program wins by, a specific String will be printed
					check = true;
				}
			}                                                                          
			if((max-sum) == 2) {
				int first = 2;
				System.out.println("THE SHAFEEQ:" + first); 
				sum = sum + first;
				if (sum == max) {
					System.out.println("Game over, THE SHAFEEQ is still NUMBER 1");
					check = true;
				}
			}
			if((max-sum) == 1) {
				int first = 1;
				System.out.println("THE SHAFEEQ:" + first);
				sum = sum + first;
				if (sum == max) {
					System.out.println("Try harder brooo!!, THE SHAFEEQ is still NUMBER 1");
					check = true;
				}
			}if (max-sum == 0) {
				check = true;
			}
			else {
				int first = RandNum.Rand(1,3);
				System.out.println("THE SHAFEEQ:" + first);
				int sum1 = sum + first;
				System.out.println("Sum:" + sum1);

				if(max-sum1 < 3){                                                       //line 54 contains a condition which automatically lets the user win which also prevents the user going
					check = true;                                                   //beyond the max number
					System.out.println("THE SHAFEEQ has been destroyed");
					System.out.println(user + " is now the NUMBER 1");
				}
				System.out.println("Enter 1,2 or 3?");	
				int second = UserInput.Input(1,3);
				System.out.println(user + ":" + second);
				sum = sum + first + second;
				System.out.println("Sum:" + sum);
				if(sum == max) {
					check = true;
					System.out.println("THE SHAFEEQ has been destroyed");
					System.out.println(user + "is now THE NUMBER 1");
				}
			}
		}while((!check) || sum<max);
		name.close();

		System.out.println("MAX reached:" + sum);    
		return max;
		
	}
   
}

