package Tr;

public class Day04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2. 1�ܿ��� 5�ܱ��� �������� ����Ͻÿ�. ��, ¦������ ������� ���ÿ� */

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 10; j++) {
				if (i % 2 == 1) {
					System.out.println(i + "*" + j + "=" + (j * i));
				}
			}
		}

	}
 
}
