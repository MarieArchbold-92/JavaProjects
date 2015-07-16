import java.util.Random;

public class ArrayApp {

	public static void main(String[] args) {
		
		//Creating an array of scores from 1 - 100
		int[] scores = new int[100];
		for(int i = 0; i<scores.length;++i){
			scores[i] = i + 1;
			System.out.print(scores[i] + " ");
		}
		
		//Create random number generator 
		Random r = new Random();
		int num = r.nextInt(scores.length);
		System.out.println("\n" + num + " ");
		
		for(int i = 0; i < scores.length; ++i){
			scores[i] = r.nextInt(100) + 1;
			}
		
		//total
		float total = 0;
		for(int i = 0; i < scores.length; ++i){
			total = total + scores[i];
		}
		System.out.print("\nTotal: " + total);
		
		//Calculating mean
		float mean = total / scores.length;
		System.out.print("\nMean:" + mean);
		
		//Calculating max
		int max = scores[0];
		for(int i = 1; i < scores.length; ++i){
			if(scores[i] > max){
				max = scores[i];
			}
		}
		System.out.print("\nMax: " + max);
		
		//Calculating min 
		int min = scores[0];
		for(int i = 1; i < scores.length; ++i){
			if(scores[i] < min){
				min = scores[i];
			}
		}
		System.out.print("\nMin: " + min);
	}

}
