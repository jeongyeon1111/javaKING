package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	//���׿�����
	//(���ǽ�Boolean)?��1:��2;
	//���ǽ��� true�� �� ��1, false�� ��2 ����
	
	public static void method() 
	{
		// �Է��� ������ ������� �Ǻ��ϴ� �޼ҵ�
		//'���� �ϳ� �Է� : '�̶�� �ȳ����� ��� �� �Է��� ������ num�� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		//����� "�����", ����� �ƴϸ� "����� �ƴϴ�" ���
//		 (num>0)? "�����":"����� �ƴϴ�";
		//���� ����̴ϱ� String�� �Է¤� �ش�
		 String result = (num>0)? "�����":"����� �ƴϴ�";
	
		 System.out.println(result);
		 
		 
	}
	
	public static void main(String[] args) 
	{
		G_Triple.method();
		
	}
}