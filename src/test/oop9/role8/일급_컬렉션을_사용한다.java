package test.oop9.role8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class 일급_컬렉션을_사용한다 {

	public static void main(String[] args) {
		Holjjak h = new Holjjak();
		h.holjjak();
	}	
}
	
class Holjjak{
	
	public void holjjak() {
		
		System.out.println("안신나는 홀짝 게임!");
		System.out.println("1 : 홀, 2 : 짝, 그외 : 종료");
		
		Scanner in = new Scanner(System.in);
		InputValue inputValue = null;
		
		while((inputValue = new InputValue(in)).inputCheck()) {
			RandomNumber randomNumber = new RandomNumber();
			holjjakCheck(inputValue, randomNumber);
		}
		
		in.close();
	}
	
	/**
	 * @title 홀짝 체크
	 * @desc 난수에 대한 홀짝을 추출하고, 입력값과 비교하여 최종 홀짝 여부를 판단한다 
	 */
	public void holjjakCheck(InputValue inputValue, RandomNumber randomNumber) {
		int input = inputValue.getInputValue();

		if(input == randomNumber.getHoljjak()) {
			System.out.println("개수는 "+ randomNumber.getRandomNumber() +"! 맞췄습니다.");
			return;
		}
		
		System.out.println("개수는 "+ randomNumber.getRandomNumber() +"! 틀렸습니다.");
	}
}

/**
 * @title 사용자 입력 값 클래스
 * @desc 사용자가 입력한 값을 관리하는 Wrapper 클래스
 */
class InputValue{
	
	int inputValue;
	
	InputValue(Scanner in){
		inputValue = in.nextInt();
	}
	
	InputValue(int inputValue){
		this.inputValue = inputValue;
	}
		
	// 입력값 체크
	public boolean inputCheck() {

		if(inputValue == 1 || inputValue == 2) {
			return true;
		}
		System.out.println("종료되었습니다.");
		return false;
	}
	
	public int getInputValue() {
		return inputValue;
	}
}

/**
 * @title 랜덤 값 클래스
 * @desc 랜덤 값을 관리하는 Wrapper 클래스
 */
class RandomNumber{
	
	int randomNumber;
	
	// 난수 생성 생성자
	RandomNumber(){
		
		Random random = new Random();
		randomNumber = random.nextInt(9)+1;
	}
	
	// 랜덤 값 조회
	public int getRandomNumber() {
		
		return randomNumber;
	}
	
	// 홀/짝 조회
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
		System.out.println(scoreBoard.size()+" 판의 홀짝 정답률은 "+"입니다.");
	}
	
	public double getScorePercent() {
		int correctCnt = Collections.frequency(scoreBoard, true);
		return correctCnt/scoreBoard.size()*100;
	}
}

