package ch02;

public class OperationsPromotionEx {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
	//	byte byteValue3 = byteValue1 + byteValue2;   //컴파일 에러 (int가 기본 타입이기 때문에)
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';  //65
		char charValue2 = 1;    //1
	//	char charValue3 = charValue1 + charValue2;   //컴파일 에러
		
		int intValue2 = charValue1 + charValue2;     // 65 + 1
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue5 = 10;
	//	int intValue6 = 10 / 4.0;  //컴파일 에러
		double doubleValue = intValue5 / 4.0;   //큰 값이 double로 자동타입 변환
		System.out.println(doubleValue);
	}

}
