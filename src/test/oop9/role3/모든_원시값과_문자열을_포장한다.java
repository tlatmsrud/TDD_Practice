package test.oop9.role3;

import java.util.Random;
import java.util.Scanner;

public class ���_���ð���_���ڿ���_�����Ѵ� {

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
		
		InputValue inputValue = null;
		
		while((inputValue = new InputValue(in.nextInt())).inputCheck()) {
			RandomNumber randomNumber = new RandomNumber();
			check(inputValue, randomNumber);
		}
		
		in.close();
	}
	
	/**
	 * @title Ȧ¦ üũ
	 * @desc ������ ���� Ȧ¦�� �����ϰ�, �Է°��� ���Ͽ� ���� Ȧ¦ ���θ� �Ǵ��Ѵ� 
	 */
	public void check(InputValue inputValue, RandomNumber randomNumber) {

		if((!randomNumber.isHol() && !inputValue.isHol()) || (randomNumber.isHol() && inputValue.isHol())) {
			System.out.println("������ "+ randomNumber.getRandomNumber() +"! ������ϴ�.");
			return;
		}
		
		System.out.println("������ "+ randomNumber.getRandomNumber() +"! Ʋ�Ƚ��ϴ�.");
	}
}

/**
 * @title ����� �Է� �� Ŭ����
 * @desc ����ڰ� �Է��� ���� �����ϴ� Wrapper Ŭ����
 */
class InputValue{
	
	int inputValue;
	
	// ������
	InputValue(int inputValue){
		this.inputValue = inputValue;
	}
	
	// �Է°� üũ
	public boolean inputCheck() {

		if(this.inputValue == 1 || this.inputValue == 2) {
			return true;
		}
		System.out.println("����Ǿ����ϴ�.");
		return false;
	}
	
	// Ȧ ���� üũ
	public boolean isHol() {
		if(inputValue == 1) {
			return true; 
		}
		return false;
	}
}

/**
 * @title ���� �� Ŭ����
 * @desc ���� ���� �����ϴ� Wrapper Ŭ����
 */
class RandomNumber{
	
	int randomNumber;
	
	// ���� ���� ������
	RandomNumber(){
		
		Random random = new Random();
		this.randomNumber = random.nextInt(9)+1;
	}
	
	// ���� �� ��ȸ
	public int getRandomNumber() {
		
		return this.randomNumber;
	}
	
	// Ȧ ���� üũ
	public boolean isHol() {
		
		if(this.randomNumber % 2 == 1) {
			return true;
		}
		return false;
	}
}
