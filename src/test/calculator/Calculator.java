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
	public static int splitAndSum(String text){
		
		if(isBlank(text) == true) {
			return 0;
		}
		
		return sum(toPositives(split(text)));
	}
	
	private static boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}
	
	public static String[] split(String text) {
		return text.split(SEPARATOR_REGEX);
	}
	
	private static Positive[] toPositives(String[] values){
		Positive[] numbers = new Positive[values.length];
		for(int i = 0; i<values.length ; i++) {
			 numbers[i] = new Positive(values[i]);
		}
		return numbers;
	}
	
	private static int sum(Positive[] values) {
		Positive result = new Positive(0);
		
		for(Positive value : values) {
			result = result.add(value);
		}
		return result.getNumber();
	}
}
