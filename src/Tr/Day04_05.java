package Tr;

public class Day04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2. 1단에서 5단까지 구구단을 출력하시오. 단, 짝수단은 출력하지 마시오 */

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 10; j++) {
				if (i % 2 == 1) {
					System.out.println(i + "*" + j + "=" + (j * i));
				}
			}
		}

	}
 
}
