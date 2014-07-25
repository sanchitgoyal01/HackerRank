import java.util.Scanner;

public class GameOfThrones1 {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		String input = inputReader.next();
		int[] counter = new int[26];
		int oddCounter = 0;
		for (int i=0;i<input.length(); i++){
			int index = input.charAt(i)-'a';
			counter[index]++;
		}
		
		for (int i=0; i<26; i++){
			if(counter[i]%2!=0){
				oddCounter++;
			}

		}
		
		if(!(oddCounter>1)) System.out.println("YES");
		else System.out.println("NO");
	}

}
