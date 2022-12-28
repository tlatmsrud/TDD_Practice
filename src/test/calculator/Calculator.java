package test.calculator;

public class Calculator {

	static final String SEPARATOR_REGEX = ",|:";
	/*
	 * �����丵 ��Ģ
	 * 1. depth�� �ִ� 2
	 * 2. �Լ��� �Ѱ��� ��ɿ� �����ϵ��� ����
	 * 3. �Լ��� ���̴� 15���� �Ѿ�� �ʵ��� ����
	 * 4. else, switch case ��� ����
	 * 5. �Լ� ���ڴ� �ִ� 3��
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
