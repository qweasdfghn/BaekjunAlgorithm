package baekjoon.step08;

import java.util.Scanner;

public class Test1978 {

	public static void main(String[] args) {
		
		// ���� : �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		// �Է� : ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ�
		//���� 1,000 ������ �ڿ����̴�.
		
		//��� : �־��� ���� �� �Ҽ��� ������ ����Ѵ�.
		//�Ҽ� : 1�� �ڱ� �ڽŸ��� ����� ���� �ڿ����� �ǹ��Ѵ�.
		
		
		boolean is_Prime(int Number) {
			
			if(Number == 1) { // 1�� �Ҽ��� �ƴ�
				return false;
			}
			
			
			// 2~Number-1 ������ ������ �������� ����� �ִ��� �Ǻ�
			// Number = 2�� ���� �ڿ������� for���� �˻����� �ʰ� ��
			for(int i =2; i<Number; i++) {
				
				if(Number%i==0)
					return false;
			}
			
			return true;
	}
}

		



