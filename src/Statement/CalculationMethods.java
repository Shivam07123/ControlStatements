package Statement;

public class CalculationMethods {
	
	public void Sum(int a, int b) {
		if (a >=0 && b >=0) {
		int c = a+b;
		System.out.println("Sum of 2 Digits is: "+c);
		}
		else {
			System.out.println("Please enter Positive Number");
		}
	}

//**************************************************************************************************************************
	
	public void PrimeNumberCheck(int a) {
		if(a >=0) {
		boolean isPrime = true;
			for( int i=2; i<a; i++) {
				if(a % i == 0 ) {
				 isPrime = false;
				 break;
				}
			}
			if(isPrime) {
				System.out.println("It is Prime Number");
			}
			else {
				System.out.println("It is Not prime Number");
			}	
		}else {
			System.out.println("Negative Number Not allowed");
		}
	}
//**************************************************************************************************************************
	
	public void FactorialCalculation(int a) {
		if(a >=0) {
		int Factorial = 1;
		if (a< 0 ) {
			System.out.println("Negative number dont have factorial." );
		}
		else if(a == 0 && a == 1) {
			System.out.println("Factorial is 1" );
		}
		else {
			for (int i = a; i >=1; i--) {
				Factorial *= i;
			}
			System.out.println("Factorial is: "+ Factorial);
		}
		}else {
			System.out.println("Negative Number Not allowed");
		}
		
	}
//**************************************************************************************************************************
	
	public void ReverseNumber(int num) {
		int digit = 0;
		int ReverseNum = 0;
		while(num != 0	) {
			digit = num % 10 ;
			ReverseNum = ReverseNum * 10 + digit;
			num /= 10;
		}
		System.out.println("Reversed Number is: "+ReverseNum);
		
	}
	
//**************************************************************************************************************************
	
	public void FibbonacciSeries(int num) {
		if(num >=0) {
		int FirstNum = 0;
		int SecondNum = 1;
		int sum = 0;
		System.out.print(FirstNum+ " " + SecondNum + ' ');
		
		for(int i = 0; i <=num; i++) {
			sum = FirstNum + SecondNum;
			System.out.print(sum + " ");
			FirstNum = SecondNum;
			SecondNum = sum;
		}
	}else {
		System.out.println("Negative Number Not allowed");
	}
	}
//**************************************************************************************************************************
}
