package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception{
		System.out.println("자바고급안녕~!!");
		
		//ctrl+shift+ 'o'
		InputStream is = System.in;//byte입력객체
		InputStreamReader isr = new InputStreamReader(is);//byte--->문자 변환
		BufferedReader br = new BufferedReader(isr);//문자를 버퍼에 저장
		     
		//데이터 읽기
		String str = br.readLine();//라인단위로 데이터를 읽기
		System.out.println("STR="+ str);		
		
	}//main
}
