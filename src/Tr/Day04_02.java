package Tr;

public class Day04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 구구단 */
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단입니다.");

			for (int j = 1; j < 4; j++) {
				// System.out.print(j+"/");
				// j를 출력하면 어떤 결과가 나오는지 알고 넘어가기
				System.out.println(i + "*" + j + "=" + (i * j));

			}
			System.out.println();
		}

		/*
		 * 1*1=1 2*1=2 3*1=3 4*1=4 1*2=2 2*2=4 3*2=6 4*2=8
		 * 
		 */

		for (int i = 1; i < 5; i++) { // ?*i
			// System.out.println(i);
			for (int j = 1; j < 5; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + " ");
			}
			System.out.println();
		}

	}

}
