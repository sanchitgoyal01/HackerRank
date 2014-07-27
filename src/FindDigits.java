import java.util.Scanner;


public class FindDigits {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int t = inputScanner.nextInt();
		int[] count = new int[t];
		
		for (int i=0; i<t; i++){
			int number = inputScanner.nextInt();
			int processNumber = number;
			while(processNumber!=0){
				int digit = processNumber%10;
				if (digit!=0 && number%digit==0) count[i]++;
				processNumber = processNumber/10;
			}
		}
		
		for (int i=0; i<t; i++){
			System.out.println(count[i]);
		}
	}

}
