package Tr;

public class Day04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문, 이중반복문(많이 어려움)..ㅜㅜ

		// 문제 1. 1부터 10까지 숫자를 출력하시오
		// 반복문의 반복문 횟수 생각 후 출력 1 2 3 4 5 6 7 8 9 10
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		// 문제 2. 9부터 0까지 숫자를 출력하시오

		for (int i = 9; i >= 0; i--) {
			System.out.print(i);
		}
		
		
		System.out.println();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(10 - i);
		}
		System.out.println();
		// 이중 for문 for문안에 for문 들어감

}
}