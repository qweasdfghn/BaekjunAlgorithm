package baekjoon.step08;

import java.util.Scanner;

public class Test14215 {

	public static void main(String[] args) {
		
		// ���� : �����̴� ���̰� a, b, c�� �� ���븦 ������ �ְ�, �� ������ ���̸� ������� ���� �� �ִ�.
		// �����̴� �� ���븦 �̿��ؼ� �Ʒ� ������ �����ϴ� �ﰢ���� ������� �Ѵ�.
		// �� ������ ���̴� ���� �����̴�
		// �� ���븦 �̿��ؼ� ���̰� ����� �ﰢ���� ���� �� �־�� �Ѵ�. �ﰢ���� �ѷ��� �ִ�� �ؾ� �Ѵ�.
		// a, b, c�� �־����� ��, ���� �� �ִ� ���� ū �ѷ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		
		// �Է� : ù° �ٿ� a, b, c (1 �� a, b, c �� 100)�� �־�����.
		// ��� : ù° �ٿ� ���� �� �ִ� ���� ū �ﰢ���� �ѷ��� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
				
		int stick[];
		
		if((stick[0] + stick[1]) > stick[2]) { //���� �����ϸ� �ٷ� ���
			System.out.println(stick[0] + stick[1] + stick[2]); 
		}else { //�ƴ� ��� ������ ���� �ٿ��� ��� a+b�� �պ��� 1������ ����
			System.out.println((stick[0] + stick[1]), stick[2]-1);
		}
		

	}

}

