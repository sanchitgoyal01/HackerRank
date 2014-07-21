import java.util.Scanner;

public class LoveLetterMystery {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		int t = inputReader.nextInt();
		int [] output = new int[t];
		
		for (int i=0; i<t; i++){
			String input = inputReader.next();
			output[i] = 0; 
			for (int j=0; j<input.length()/2; j++){
				output[i] += Math.abs(input.charAt(j)-input.charAt(input.length()-j-1));
			}
		}
		
		for(int i=0; i<t; i++){
			System.out.println(output[i]);
		}
	}

}
