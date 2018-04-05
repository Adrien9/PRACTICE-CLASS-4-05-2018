package EvenOdd_Array;

public class EvenOdd_Array {

	public static void main(String[]args){

		int[]num={1,2,3,4,5};

		int evencounter=0;
		int oddcounter=0;
		
		for(int i=0; i<num.length; i++){

			if(num[i]%2==0){
				
			evencounter=evencounter+1;
			}
			
			else{
				
			oddcounter=oddcounter+1;
			}
		}
		
		System.out.println("The amount of even numbers is " + evencounter + ".");
		
		System.out.println("The amount of odd numbers is " + oddcounter + ".");
	}
}
