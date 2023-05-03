package baekjoon.step08;

import java.math.BigInteger;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
		
				//입력 : 첫째 줄에 A와 B가 주어진다.(0 <A,B<10에 10000승)
				
				//출력 : 첫째 줄에 A+B를 출력한다.
				
		// https://st-lab.tistory.com/199 참조
		/*일반적으로 큰 수를 쓸 때 쓰는 long형은 약 1844경 정도된다
		하지만 이번 문제의 경우 입력 범위가 최대 10^10000이므로 long형을 넘는다
		이런경우 무한대 정수 자료형 Biginteger을 사용한다.
		*/
		
		Scanner in = new Scanner(System.in);
				
		BigInteger A = new BigInteger(in.next());
		BigInteger B = new BigInteger(in.next());
		
		A = A.add(B);
		
		System.out.println(A.toString());
				

	}

}
