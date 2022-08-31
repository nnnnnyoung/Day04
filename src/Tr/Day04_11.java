package Tr;

public class Day04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		0000000*
		000000*
		00000*
		0000*
		000*
		00*
		0*
		를 출력하시오
		*/
		
		
		for (int i=1; i<8; i++) {
			for (int j=1; j<9-i; j++) {
				System.out.print("0");
			}
			System.out.println("*");
			
		}
		
	}

}
