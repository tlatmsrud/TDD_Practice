package test.calculator;

public class Calculator {

	static final String SEPARATOR_REGEX = ",|:";
	/*
	 * 리팩토링 규칙
	 * 1. depth는 최대 2
	 * 2. 함수는 한가지 기능에 집중하도록 구현
	 * 3. 함수의 길이는 15줄이 넘어가지 않도록 구현
	 * 4. else, switch case 사용 금지
	 * 5. 함수 인자는 최대 3개
	 */
	public static int splitAndSum(String text) {
		
		if(isBlank(text) == true) {
			return 0;
		}
		
		return sum(toInts(split(text)));
	}
	
	public static boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}
	
	public static String[] split(String text) {
		return text.split(SEPARATOR_REGEX);
	}
	
	public static int[] toInts(String[] values) {
		int[] numbers = new int[values.length];
		for(int i = 0; i<values.length ; i++) {
			 numbers[i] = Integer.parseInt(values[i]);
		}
		return numbers;
	}

	public static int sum(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
}
