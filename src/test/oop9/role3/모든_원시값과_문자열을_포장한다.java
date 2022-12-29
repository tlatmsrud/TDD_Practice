package test.oop9.role3;

import java.util.Random;
import java.util.Scanner;

public class 모든_원시값과_문자열을_포장한다 {

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
		
		while((inputValue = new InputValue(in.nextInt())).inputCheck()) {
			RandomNumber randomNumber = new RandomNumber();
			check(inputValue, randomNumber);
		}
		
		in.close();
	}
	
	/**
	 * @title 홀짝 체크
	 * @desc 난수에 대한 홀짝을 추출하고, 입력값과 비교하여 최종 홀짝 여부를 판단한다 
	 */
	public void check(InputValue inputValue, RandomNumber randomNumber) {

		if((!randomNumber.isHol() && !inputValue.isHol()) || (randomNumber.isHol() && inputValue.isHol())) {
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
	
	// 생성자
	InputValue(int inputValue){
		this.inputValue = inputValue;
	}
	
	// 입력값 체크
	public boolean inputCheck() {

		if(this.inputValue == 1 || this.inputValue == 2) {
			return true;
		}
		System.out.println("종료되었습니다.");
		return false;
	}
	
	// 홀 여부 체크
	public boolean isHol() {
		if(inputValue == 1) {
			return true; 
		}
		return false;
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
		this.randomNumber = random.nextInt(9)+1;
	}
	
	// 랜덤 값 조회
	public int getRandomNumber() {
		
		return this.randomNumber;
	}
	
	// 홀 여부 체크
	public boolean isHol() {
		
		if(this.randomNumber % 2 == 1) {
			return true;
		}
		return false;
	}
}
