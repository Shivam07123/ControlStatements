package Statement;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		
		String password = "FlynautSaas";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password For Calculation");
		CalculationMethods cal = new CalculationMethods();
		
		int counter = 0;
		int maxAttempts = 3;
		while (counter < maxAttempts) {
			String userInput = sc.next();
		
		if(userInput.equals(password) ) {
		
		System.out.println("Enter Number For Calculation");
		System.out.println("Case 1 : Sum Of 2 Digits");
		System.out.println("Case 2 : Check the number is Prime or Not");
		System.out.println("Case 3 : Factorial of the number");
		System.out.println("Case 4 : Reverse the number");
		System.out.println("Case 5 : Fibbonacci Series till the number");
		int caseNum = sc.nextInt();
		
		switch(caseNum){
		
		case 1 : {
			System.out.println("Enter The First Number");
			int FirstNum = sc.nextInt();
			System.out.println("Enter The Second Number");
			int SecondNum = sc.nextInt();
			cal.Sum(FirstNum, SecondNum);	
			break;
		}
		case 2 :{
			System.out.println("Enter The Number");
			int Num = sc.nextInt();
			cal.PrimeNumberCheck(Num);
			break;
		}
		case 3 : {
			System.out.println("Enter The Number For Factorial");
			int Num = sc.nextInt();
			cal.FactorialCalculation(Num);
			break;
		}
		case 4 : {
			
			System.out.println("Enter The Number For reverse");
			int Num = sc.nextInt();
			cal.ReverseNumber(Num);
			break;
		}
		case 5 : {
			System.out.println("Enter The Number For Fibbonacci Series");
			int Num = sc.nextInt();
			cal.FibbonacciSeries(Num);
			break;
		}
		
	}
	}else {
		System.out.println("You Enters a Wrong Password");
	}

}
}
}
