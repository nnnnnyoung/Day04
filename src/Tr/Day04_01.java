package Tr;

public class Day04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ݺ���, ���߹ݺ���(���� �����)..�̤�

		// ���� 1. 1���� 10���� ���ڸ� ����Ͻÿ�
		// �ݺ����� �ݺ��� Ƚ�� ���� �� ��� 1 2 3 4 5 6 7 8 9 10
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		// ���� 2. 9���� 0���� ���ڸ� ����Ͻÿ�

		for (int i = 9; i >= 0; i--) {
			System.out.print(i);
		}
		
		
		System.out.println();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(10 - i);
		}
		System.out.println();
		// ���� for�� for���ȿ� for�� ��

}
}