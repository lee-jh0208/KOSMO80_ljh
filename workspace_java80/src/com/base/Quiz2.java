package com.base;

import java.util.Scanner;

/*
 * 1부터 N까지의 /// 정수의 합계  ///2개 동의를 구하시오
 */
public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1부터 end까지 숫자를 세는 변수.
		int start = 0;
		//1부터 어디까지 셀것인지 담을 변수.
		int end = 0;
		//합을 구해서 담을 변수 선언하기.
		int hap = 0;//0으로 하는 이유는 합을 구할 때 결과값에 영향을 줄 수 있으니까 0으로 초기화 해야함.
		System.out.println("계산하고 싶은 정수를 입력하세요");
		end = sc.nextInt();
				for(start=1;start<=end;start=start+1) {
					System.out.println(start);
					hap = hap + start;
				}
				System.out.println(hap);
	}


}
