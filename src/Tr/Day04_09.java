package Tr;

public class Day04_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		00000*                      
		0000***
		000*****
		00*******
		0*********
		***********
		를 출력하시오
		*/
		
		for (int i=1; i<7; i++) {
			
			for (int j=1; j<7-i; j++) {
				System.out.print("0");
			}
			for (int j=1; j<=(2*i-1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
