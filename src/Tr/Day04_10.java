package Tr;

public class Day04_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		7.
//		***********    1 11
//		0*********     2 9
//		00*******      3 7
//		000*****       4 5
//		0000***        5 3
//		00000*         6 1
//		를 출력하시오
		
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
