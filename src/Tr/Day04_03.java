package Tr;

public class Day04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
		 *****
		 ***** 
		 *****
		 *****
		 * 줄수를 i로 생각하고 한 줄의 별의 개수를 중첩 for문 안에 있는 것으로 생각하고 숫자를 먼저 수기로 적고 숫자의 변화와 i와 j의
		 * 범위를 분석하여 코드를 작성해보세요
		 */

		for (int i = 1; i <= 4; i++) {
			System.out.println();
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}

		}

		System.out.println();
 
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 * 를 출력하시오
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();

		/*
		 *****
		 ****
		 ***
		 **
		 *
		 * 를 출력하시오
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		/*
		 * 00000* 
		   0000** 
		   000*** 
		   00**** 
		   0***** 
		   를 출력하시오
		 */
		for (int i = 1; i < 6; i++) {

			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("0");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
		/*
		 0 
		 *0 
		 **0 
		 ***0 
		 ****0 
		 을 출력하시오
		 */

		System.out.println();

		for (int i = 1; i < 6; i++) {

			for (int j = 1; j <= i; j++) {
				if (j == i) {
					System.out.print("0");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();

		}

		System.out.println();

		for (int i = 1; i < 5; i++) {
			System.out.println("0");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		}
		System.out.println("0");

	}

}
