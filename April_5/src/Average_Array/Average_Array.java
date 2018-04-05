package Average_Array;
import java.util.Scanner;
public class Average_Array {

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

		System.out.println("How many elements do you want to find the average for?");

		int elements=scanner.nextInt();

		int[] num=new int [elements];

		int sum=0; 

		System.out.println("Enter " + elements + " numbers");

		for(int i=0; i<num.length; i++){
			num[i]=scanner.nextInt();
			sum=num[i]+sum;	
		}
		
		double average=sum/num.length;
		System.out.println("The average is " + average);
	}
}