package baekjoon.step08;

import java.math.BigInteger;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
				//�Է� : ù° �ٿ� A�� B�� �־�����.(0 <A,B<10�� 10000��)
				
				//��� : ù° �ٿ� A+B�� ����Ѵ�.
				
		// https://st-lab.tistory.com/199 ����
		/*�Ϲ������� ū ���� �� �� ���� long���� �� 1844�� �����ȴ�
		������ �̹� ������ ��� �Է� ������ �ִ� 10^10000�̹Ƿ� long���� �Ѵ´�
		�̷���� ���Ѵ� ���� �ڷ��� Biginteger�� ����Ѵ�.
		*/
		
		Scanner in = new Scanner(System.in);
				
		BigInteger A = new BigInteger(in.next());
		BigInteger B = new BigInteger(in.next());
		
		A = A.add(B);
		
		System.out.println(A.toString());
				

	}

}
