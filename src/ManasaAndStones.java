import java.util.Scanner;


public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int t = inputScanner.nextInt();
		int[][] output = new int[t][];
		
		for(int i=0; i<t; i++){
			int n = inputScanner.nextInt();
			int valA = inputScanner.nextInt();
			int valB = inputScanner.nextInt();
						
			if(valA!=valB){
				output[i] = new int[n];
				
				int smallerOne = valA<valB?valA:valB;
				int largerOne = valA>valB?valA:valB;
				
				for (int j=0; j<n; j++){
					output[i][j] = j*largerOne + (n-1-j)*smallerOne;
				}				
			}
			else{
				output[i] = new int[1];
				output[i][0] = (n-1) * valA;
			}
			
		}
		
		for (int i=0;i<output.length;i++){
			for(int j=0;j<output[i].length; j++){
				System.out.print(output[i][j]);
				if(j==output[i].length-1) System.out.println();
				else System.out.print(" ");
			}
		}
	}

}
