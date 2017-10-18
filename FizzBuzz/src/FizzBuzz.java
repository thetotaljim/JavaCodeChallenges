
public class FizzBuzz {

	public static void main(String[] args) {
	
		//	Loop through numbers 1-100
		for(int i = 1; i < 101; i++){
				
			//	Get value to print using returnResult() method
			String tempString = returnResult(i);
			//	Print the result.
			System.out.printf(tempString);
		}
		System.out.printf("\n\n");
		String one = Integer.toString(7) + "\n";
		String two = Integer.toString(7) + "\n";
		if(one == two ){
			System.out.printf("These strings are equal.\n");
			
		}
		else{
			System.out.printf("Can't compare the two strings with new line characters.\n");
		}

	}
		
	public static String returnResult(int i){
		//	If the number is divisible by 3 and 5...
		if(i%3==0 && i%5==0){
			String fizzbuzz = "FizzBuzz\n";
			return fizzbuzz;
		}
		//	Else if the number is only divisible by 3, print Fizz
		else if(i%3==0){
			String fizz = "Fizz\n";
			return fizz;
		}
		//	Else if the number is only divisible by 5, print Buzz
		else if(i%5==0){
			String buzz = ("Buzz\n");
			return buzz;
		}
		//	Otherwise print the number
		else{
			String passedNum = Integer.toString(i) + "\n";
			return passedNum;
		}
	}

}
