package test.oop9.role9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Getter_Setter_Property��_����_�ʴ´� {

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
		HoljjakScore score = new HoljjakScore();
		
		while((inputValue = new InputValue(in)).inputCheck()) {
			RandomNumber randomNumber = new RandomNumber();
			score.addResult(holjjakCheck(inputValue, randomNumber));
		}
		score.printScoreInfo();
		in.close();
	}
	
	/**
	 * @title Ȧ¦ üũ
	 * @desc ������ ���� Ȧ¦�� �����ϰ�, �Է°��� ���Ͽ� ���� Ȧ¦ ���θ� �Ǵ��Ѵ� 
	 */
	public boolean holjjakCheck(InputValue inputValue, RandomNumber randomNumber) {
		boolean inputValueIsHol = inputValue.isHol();
		boolean randomNumberIsHol = randomNumber.isHol();
		
		randomNumber.printRandomNumber();
		
		if(inputValueIsHol == randomNumberIsHol) {
			System.out.println("������ϴ�.");
			return true;
		}
		System.out.println("Ʋ�Ƚ��ϴ�.");
		return false;
	}
}

/**
 * @title ����� �Է� �� Ŭ����
 * @desc ����ڰ� �Է��� ���� �����ϴ� Wrapper Ŭ����
 */
class InputValue{
	
	int inputValue;
	
	InputValue(Scanner in){
		inputValue = InputValueValidationCheck(in);
	}

	// �Է°��� ���� validation üũ
	private int InputValueValidationCheck(Scanner in){
		try {
			return in.nextInt();
		}catch(Exception e) {
			return 3;
		}
		
	}
	
	// �Է� ���� ���� ���� üũ
	public boolean inputCheck() {

		if(inputValue == 1 || inputValue == 2) {
			return true;
		}
		
		System.out.println("����Ǿ����ϴ�.");
		return false;
	}
	
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
		randomNumber = random.nextInt(9)+1;
	}

	// Ȧ ���� Ȯ��
	public boolean isHol() {
		if(randomNumber % 2 == 1) {
			return true;
		}
		return false;
	}
	
	//
	public void printRandomNumber() {
		System.out.println("���� : "+randomNumber);
	}
}

/**
 * @title Ȧ¦ ��� Ŭ����
 * @desc Ȧ¦ ����� �����ϴ� �ϱ� �÷���
 *
 */
class HoljjakScore{
	
	List<Boolean> scoreBoard;
	
	HoljjakScore(){
		scoreBoard = new ArrayList<Boolean>();
	}
	
	// Ȧ¦ ��� �߰�
	public void addResult(boolean result){
		scoreBoard.add(result);
	}
	
	// Ȧ¦ ��� ���
	public void printScoreInfo() {
		int correctCnt = Collections.frequency(scoreBoard, true);
		int totalCnt = scoreBoard.size();
		double correctPercent = (double)correctCnt/(double)totalCnt*100;
		
		if(totalCnt != 0) {
			System.out.println("������� "+String.format("%.1f",correctPercent)+"%("+correctCnt+"/"+totalCnt+")�Դϴ�.");
		}
	}
}

