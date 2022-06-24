package ch04;

import java.io.IOException;

public class WhileKeyControlEx {

	public static void main(String[] args) throws Exception {

		boolean run = true;		//실행여부를 판단
		int speed = 100;		//현재 속도는 100km/h
		int keyCode = 0;		//키보드로 입력되는 값
		
		while(run){	//run에 초기값이 true이기 때문에 주행중이라는 뜻
			if(keyCode!= 13 && keyCode != 10) {
				System.out.println("-------------");
				System.out.println("1.엑셀 | 2. 브레이크 | 3. 중지");
				System.out.println("-------------");
				System.out.print("선택 : ");
			}
			keyCode = System.in.read();
		//	System.out.println(keyCode);
			
			if(keyCode == 49) {
				speed += 5;
				System.out.println("현재 속도 : " + speed);
			}else if(keyCode == 50) {
				speed -= 5;
				System.out.println("현재 속도 : " + speed);
			}else if(keyCode == 51) {
				run = false;
				System.out.println("크루즈 기능이 종료됩니다.");
				System.out.println("현재 속도 : " + speed);
				System.out.println("안전운전.");
			}
		}
		System.out.println("프로그램 종료");
	}

}
