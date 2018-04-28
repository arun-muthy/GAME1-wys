import java.util.Random;
public class RandNum {

	public static int Rand(int par1,int par2) {                                              //This class contains a method that generates a random number based on two parameters
		Random gen = new Random();                                                           //par1 is the lowest number and par2 is the highest number
		int rand = gen.nextInt(par2 + 1 - par1) + par1;                                      //The equation in line 6 is require to set a range with the lowest number being greater than 0;
		return rand;                                                                         //A random number, rand is returned.
	}


}
