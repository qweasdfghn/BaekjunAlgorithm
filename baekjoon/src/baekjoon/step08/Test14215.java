package baekjoon.step08;

import java.util.Scanner;

public class Test14215 {

	public static void main(String[] args) {
		
		// 문제 : 영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.
		// 영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
		// 각 막대의 길이는 양의 정수이다
		// 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다. 삼각형의 둘레를 최대로 해야 한다.
		// a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오. 
		
		// 입력 : 첫째 줄에 a, b, c (1 ≤ a, b, c ≤ 100)가 주어진다.
		// 출력 : 첫째 줄에 만들 수 있는 가장 큰 삼각형의 둘레를 출력한다.
		
		Scanner sc = new Scanner(System.in);
				
		int stick[] = new int[3];
		
		  for(int i=0; i<stick.length; i++) {
	            stick[i] = sc.nextInt();
	         }
		
		
		if((stick[0] + stick[1]) > stick[2]) { //조건 만족하면 바로 출력
			System.out.println(stick[0] + stick[1] + stick[2]); 
		}else { //아닐 경우 막대의 길이 줄여서 출력 a+b의 합보다 1작으면 가능
			System.out.println((stick[0] + stick[1])+ stick[2]-1);
		}
		

	}

}

