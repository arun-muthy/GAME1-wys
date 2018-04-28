import java.util.Scanner;
public class UserInput {
	
	public static int Input(int min,int max) {                                                    //This method inputs numbers chosen by the user into a do/while loop within a range (min < num < max)

		int num = 0;
		boolean isNum;                                                             
		Scanner in = new Scanner(System.in);
		do {
			if(in.hasNextInt()) {                                                                 //The if statement determines if the input is an integer
				num = in.nextInt();
				if(num > max || num < min) {
					System.out.println("Enter a number between" + min + " & " +  max);           //If the number is greater than minimum value and less than maximum value the boolean				                                                                              			                   
				}                                                                                //statement will be true and validate the user input which will return an integer, num. 
				isNum = true;
			}
			
			else {
				System.out.println("Enter a number between" + min + " & " +  max);
				in.next();
				isNum = false;					
			}

		}while(!(isNum) || num<min || num>max);   
		
		return num;

	}
}