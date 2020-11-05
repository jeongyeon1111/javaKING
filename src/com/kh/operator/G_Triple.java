package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	//삼항연산자
	//(조건식Boolean)?식1:식2;
	//조건식이 true일 때 식1, false면 식2 수행
	
	public static void method() 
	{
		// 입력한 정수가 양수인지 판별하는 메소드
		//'정수 하나 입력 : '이라는 안내문을 출력 후 입력한 정수를 num에 저장
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		//양수면 "양수다", 양수가 아니면 "양수가 아니다" 출력
//		 (num>0)? "양수다":"양수가 아니다";
		//문장 출력이니까 String에 입력ㅎ 준다
		 String result = (num>0)? "양수다":"양수가 아니다";
	
		 System.out.println(result);
		 
		 
	}
	
	public static void main(String[] args) 
	{
		G_Triple.method();
		
	}
}