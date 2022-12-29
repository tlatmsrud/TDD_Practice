package test.oop9.role1;

import java.util.Random;
import java.util.Scanner;

public class 한_메서드에_오직_한_단계의_들여쓰기만_한다 {

	public static void main(String[] args) {
		Holjjak h = new Holjjak();
		h.holjjakVer2();
	}	
	
	
}
	
class Holjjak{
	
	public void holjjakVer1() {
		System.out.println("안신나는 홀짝 게임!");
		System.out.println("1 : 홀, 2 : 짝, 그외 : 종료");

		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			int input = in.nextInt();
			
			Random random = new Random();
			int randomNumber = random.nextInt(9)+1;
			
			if(input > 0 && input <3) {
				
				int result = randomNumber%2;
				
				if(result == 0 && input == 2) {
					System.out.println("개수는 "+ randomNumber +"! 맞췄습니다.");
				}else if(result == 1 && input == 1) {
					System.out.println("개수는 "+ randomNumber +"! 맞췄습니다.");
				}else {
					System.out.println("개수는 "+ randomNumber +"! 틀렸습니다.");
				}
				
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
		in.close();
	}
	
	public void holjjakVer2() {
		
		System.out.println("안신나는 홀짝 게임!");
		System.out.println("1 : 홀, 2 : 짝, 그외 : 종료");
		
		Scanner in = new Scanner(System.in);
		int input = 0;

		while(inputCheck(input = in.nextInt())) {
			int randomNumber = makeRandomNumber();
			check(input, randomNumber);
		}
		
		in.close();
	}
	
	/**
	 * @title 입력값 체크
	 * @param input
	 * @desc 사용자가 입력한 값을 체크한다. 
	 * 1,2 일 경우 홀짝 게임을 계속 진행하고, 그 외일 경우 종료한다.
	 */
	public boolean inputCheck(int input) {
		
		if(input == 1 || input == 2) {
			return true;
		}else {
			System.out.println("종료되었습니다.");
			return false;
		}
	}
	
	/**
	 * @title 난수 생성
	 * @param 
	 * @dsec 1에서 10까지의 난수를 생성한다.
	 */
	public int makeRandomNumber() {
			
		Random random = new Random();
		return random.nextInt(9)+1;
	}
	
	/**
	 * @title 홀짝 체크
	 * @param input, randomNumber
	 * @desc 난수에 대한 홀짝을 추출하고, 입력값과 비교하여 최종 홀짝 여부를 판단한다 
	 */
	public void check(int input, int randomNumber) {

		int result = randomNumber%2;
			
		if(result == 0 && input == 2) {
			System.out.println("개수는 "+ randomNumber +"! 맞췄습니다.");
		}else if(result == 1 && input == 1) {
			System.out.println("개수는 "+ randomNumber +"! 맞췄습니다.");
		}else {
			System.out.println("개수는 "+ randomNumber +"! 틀렸습니다.");
		}

	}
}
