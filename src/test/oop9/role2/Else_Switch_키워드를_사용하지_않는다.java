package test.oop9.role2;

import java.util.Random;
import java.util.Scanner;

public class Else_Switch_Ű���带_�������_�ʴ´� {

	public static void main(String[] args) {
		Holjjak h = new Holjjak();
		h.holjjak();
	}	
}
	
class Holjjak{
	
	public void holjjak() {
		
		System.out.println("�Ƚų��� Ȧ¦ ����!");
		System.out.println("1 : Ȧ, 2 : ¦, �׿� : ����");
		
		Scanner in = new Scanner(System.in);
		int input = 0;

		while(inputCheck(input = in.nextInt())) {
			int randomNumber = makeRandomNumber();
			check(input, randomNumber);
		}
		
		in.close();
	}
	
	/**
	 * @title �Է°� üũ
	 * @param input
	 * @desc ����ڰ� �Է��� ���� üũ�Ѵ�. 
	 * 1,2 �� ��� Ȧ¦ ������ ��� �����ϰ�, �� ���� ��� �����Ѵ�.
	 */
	public boolean inputCheck(int input) {
		
		if(input == 1 || input == 2) {
			return true;
		}
		
		System.out.println("����Ǿ����ϴ�.");
		return false;
	}
	
	/**
	 * @title ���� ����
	 * @param 
	 * @dsec 1���� 10������ ������ �����Ѵ�.
	 */
	public int makeRandomNumber() {
			
		Random random = new Random();
		return random.nextInt(9)+1;
	}
	
	/**
	 * @title Ȧ¦ üũ
	 * @param input, randomNumber
	 * @desc ������ ���� Ȧ¦�� �����ϰ�, �Է°��� ���Ͽ� ���� Ȧ¦ ���θ� �Ǵ��Ѵ� 
	 */
	public void check(int input, int randomNumber) {

		int result = randomNumber%2;
			
		if(result == 0 && input == 2) {
			System.out.println("������ "+ randomNumber +"! ������ϴ�.");
			return;
		}
		if(result == 1 && input == 1) {
			System.out.println("������ "+ randomNumber +"! ������ϴ�.");
			return;
		}
		
		System.out.println("������ "+ randomNumber +"! Ʋ�Ƚ��ϴ�.");
	}
}
