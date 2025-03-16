import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String first = sc.next();
		String second = sc.next();
		String third = sc.next();

		int lastNumber=0; 


		if (isNumber(third)) {
			lastNumber = Integer.parseInt(third);
		} else if (isNumber(second)) {
			lastNumber = Integer.parseInt(second) + 1;
		} else if (isNumber(first)) {
			lastNumber = Integer.parseInt(first) + 2;
		}

		// 다음 숫자 예측
		int nextValue = lastNumber + 1;
		System.out.println( getFizzBuzz(nextValue));
	}

	
	public static String getFizzBuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		} else if (num % 3 == 0) {
			return "Fizz";
		} else if (num % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(num);
		}
	}


	public static boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
