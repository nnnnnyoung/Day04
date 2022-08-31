package Tr;

public class Day04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 4.
		00000
		*****
		00000
		*****
		를 출력하시오
		*/
		for (int i=1; i<5; i++) {
			for (int j=1; j<6; j++) {
				if (i%2==1) {
					System.out.print("0");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	} 

}
