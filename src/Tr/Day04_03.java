package Tr;

public class Day04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
		 *****
		 ***** 
		 *****
		 *****
		 * �ټ��� i�� �����ϰ� �� ���� ���� ������ ��ø for�� �ȿ� �ִ� ������ �����ϰ� ���ڸ� ���� ����� ���� ������ ��ȭ�� i�� j��
		 * ������ �м��Ͽ� �ڵ带 �ۼ��غ�����
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
		 * �� ����Ͻÿ�
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
		 * �� ����Ͻÿ�
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
		   �� ����Ͻÿ�
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
		 �� ����Ͻÿ�
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
