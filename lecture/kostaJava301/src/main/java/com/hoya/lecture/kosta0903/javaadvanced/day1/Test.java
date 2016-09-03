package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception{
		System.out.println("�ڹٰ�޾ȳ�~!!");
		
		//ctrl+shift+ 'o'
		InputStream is = System.in;//byte�Է°�ü
		InputStreamReader isr = new InputStreamReader(is);//byte--->���� ��ȯ
		BufferedReader br = new BufferedReader(isr);//���ڸ� ���ۿ� ����
		     
		//������ �б�
		String str = br.readLine();//���δ����� �����͸� �б�
		System.out.println("STR="+ str);		
		
	}//main
}
