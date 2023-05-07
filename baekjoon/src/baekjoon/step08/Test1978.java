package baekjoon.step08;

import java.util.Scanner;

public class Test1978 {

	public static void main(String[] args) {
		
		// 문제 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		
		// 입력 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데
		//수는 1,000 이하의 자연수이다.
		
		//출력 : 주어진 수들 중 소수의 개수를 출력한다.
		//소수 : 1과 자기 자신만을 약수로 갖는 자연수를 의미한다.
		
		
		boolean is_Prime(int Number) {
			
			if(Number == 1) { // 1은 소수가 아님
				return false;
			}
			
			
			// 2~Number-1 까지중 나누어 떨어지는 약수가 있는지 판별
			// Number = 2의 경우는 자연스럽게 for문을 검사하지 않게 됨
			for(int i =2; i<Number; i++) {
				
				if(Number%i==0)
					return false;
			}
			
			return true;
	}
}

		



