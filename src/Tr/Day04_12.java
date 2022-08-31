package Tr;

public class Day04_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		00000*              
//		0000***
//		000*****
//		00*******
//		0*********
//		***********
//		0*********
//		00*******
//		000*****
//		0000***
//		00000*
//		를 출력하시오
		
		
		for (int i=1; i<6; i++) {
			
			for (int j=1; j<=6-i; j++) {
				System.out.print("0");
			}
			for (int j=1; j<=(2*i-1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		for (int i=0; i<6; i++) {
			for(int j=6; j>6-i; j--) {
				System.out.print("0");
			}
			for(int j=10; j>=0&& j>=(2*i); j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
