package test.oop9.role8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class �ϱ�_�÷�����_����Ѵ� {

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
		
		while((inputValue = new InputValue(in)).inputCheck()) {
			RandomNumber randomNumber = new RandomNumber();
			holjjakCheck(inputValue, randomNumber);
		}
		
		in.close();
	}
	
	/**
	 * @title Ȧ¦ üũ
	 * @desc ������ ���� Ȧ¦�� �����ϰ�, �Է°��� ���Ͽ� ���� Ȧ¦ ���θ� �Ǵ��Ѵ� 
	 */
	public void holjjakCheck(InputValue inputValue, RandomNumber randomNumber) {
		int input = inputValue.getInputValue();

		if(input == randomNumber.getHoljjak()) {
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
	
	InputValue(Scanner in){
		inputValue = in.nextInt();
	}
	
	InputValue(int inputValue){
		this.inputValue = inputValue;
	}
		
	// �Է°� üũ
	public boolean inputCheck() {

		if(inputValue == 1 || inputValue == 2) {
			return true;
		}
		System.out.println("����Ǿ����ϴ�.");
		return false;
	}
	
	public int getInputValue() {
		return inputValue;
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
	
	// ���� �� ��ȸ
	public int getRandomNumber() {
		
		return randomNumber;
	}
	
	// Ȧ/¦ ��ȸ
	public int getHoljjak() {
		if(randomNumber % 2 == 1) {
			return 1;
		}
		return 2;
	}
}

class HoljjakScore{
	
	List<Boolean> scoreBoard;
	
	HoljjakScore(){
		scoreBoard = new ArrayList<Boolean>();
	}
	
	public void addResult(boolean result){
		scoreBoard.add(result);
	}
	
	public void printScoreInfo() {
		System.out.println(scoreBoard.size()+" ���� Ȧ¦ ������� "+"�Դϴ�.");
	}
	
	public double getScorePercent() {
		int correctCnt = Collections.frequency(scoreBoard, true);
		return correctCnt/scoreBoard.size()*100;
	}
}

