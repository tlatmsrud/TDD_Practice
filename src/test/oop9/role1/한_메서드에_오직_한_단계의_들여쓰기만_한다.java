package test.oop9.role1;

import java.util.Random;
import java.util.Scanner;

public class ��_�޼��忡_����_��_�ܰ���_�鿩���⸸_�Ѵ� {

	public static void main(String[] args) {
		Holjjak h = new Holjjak();
		h.holjjakVer2();
	}	
	
	
}
	
class Holjjak{
	
	public void holjjakVer1() {
		System.out.println("�Ƚų��� Ȧ¦ ����!");
		System.out.println("1 : Ȧ, 2 : ¦, �׿� : ����");

		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			int input = in.nextInt();
			
			Random random = new Random();
			int randomNumber = random.nextInt(9)+1;
			
			if(input > 0 && input <3) {
				
				int result = randomNumber%2;
				
				if(result == 0 && input == 2) {
					System.out.println("������ "+ randomNumber +"! ������ϴ�.");
				}else if(result == 1 && input == 1) {
					System.out.println("������ "+ randomNumber +"! ������ϴ�.");
				}else {
					System.out.println("������ "+ randomNumber +"! Ʋ�Ƚ��ϴ�.");
				}
				
			}else {
				System.out.println("�����մϴ�.");
				break;
			}
		}
		in.close();
	}
	
	public void holjjakVer2() {
		
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
		}else {
			System.out.println("����Ǿ����ϴ�.");
			return false;
		}
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
		}else if(result == 1 && input == 1) {
			System.out.println("������ "+ randomNumber +"! ������ϴ�.");
		}else {
			System.out.println("������ "+ randomNumber +"! Ʋ�Ƚ��ϴ�.");
		}

	}
}
