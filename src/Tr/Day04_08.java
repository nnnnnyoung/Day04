package Tr;

public class Day04_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* 5번
		0*0*0*0*
		0*0*0*0*
		0*0*0*0*
		0*0*0*0*
		를 출력하시오
		*/
		
		for (int i=1; i<5; i++) {
			for (int j=1; j<9; j++) {
				if(j%2==1) {
					System.out.print("0");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
				
		}

	}

}
