package baekjoon.step08;

import java.util.Scanner;

public class Test11653 {

	public static void main(String[] args) {

		
		// ���� : ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է� : ù° �ٿ� ���� N (1 �� N �� 10,000,000)�� �־�����.
		// ��� : N�� ���μ����� ����� �� �ٿ� �ϳ��� ������������ ����Ѵ�. N�� 1�� ��� �ƹ��͵� ������� �ʴ´�.
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int i =2; i<= N; i++) {
			while(N%i == 0) {
				System.out.println(i);
				
				N /= i;
			}
		}
		
		if(N != 1) {
			System.out.println(N);
			
		}
	}

}
