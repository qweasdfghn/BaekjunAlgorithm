package baekjoon.step08;

import java.util.Scanner; //Scanner 클래스 호출

public class Test08 {

	public static void main(String[] args) {
		//문제 : 정사각형을 이루는 점 4개를 고른다. 그 후에는 다음과 같은 과정을 거쳐서 지형을 만든다.
		
			// 1. 정사각형의 각 변의 중앙에 점을 하나 추가한다.
			// 2. 정사각형의 중심에 점을 하나 추가한다.
		/* 초기 상태에서 위와 같은 과정을 한 번 거치면 총 4개의 정사각형이 새로 생긴다. 이와 같은 과정을 상근이가
		 * 만족할 때 까지 계속한다.
		 * 초기상태 점 4개 / 1번 점9개 / 2번 점 25개/ 3번 점 81개 
		 /* 상근이는 어떤 점은 한 개 보다 많은 정사각형에 포함될 수 있다는 사실을 알았다. 메모리 소모량을 줄이기 위해서
		  * 중복하는 점을 한 번만 저장하려고 한다. 과정을 N번 거친 후 점 몇개를 저장해야 하는지 구하는 프로그램을 작성하시오*/

		/*제곱수를 이용하였다.      N : 0 / 1/ 2 /  3/...
		 * 				      점 개수 : 4 / 9/ 25/ 81/ ...
		 * 				       제곱수 : 2   3  5 /  9/ ...
		 * 3, 5, 9, 17, 33, 
		 *                  규칙 : 이전수 + (이전수-1) 
		 *               총 점개수 = 가로의 점 개수 x 가로의 점개수   */
		
		
		Scanner sc = new Scanner(System.in); //스캐너 선언
		int N = sc.nextInt(); //N번 = 변수
		int width = 3; //N이 1일때부터 시작이므로 가로에 점개수 3개
		int[] dot = new int[16];
		for(int i= 1; i<dot.length; i++) { // 1~15까지 이므로 new Int는 16
			dot[i] = (width * width); //가로의 점개수 x 가로의 점개수
			width = width + (width -1); //규칙
		}
		
		System.out.println(dot[N]);
		sc.close();
		
		
		
		
	}
	

}
