package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyTest {
   //a.txt(읽기)   -----> b.txt(쓰기)파일 생성
	public static void main(String[] args) throws Exception{
		
		File f = new File("a.txt");
		
	   if(f.exists()){//파일이 존재했을때 실행!!
		   	FileReader fr = new FileReader(f);//"a.txt");//읽기객체 read
		   	
		   	FileWriter fw = new FileWriter("b.txt");//쓰기객체 write
		   	//FileWriter와 FileOutputStream는 생성자 파라미터에 명시된파일을 생성하는 기능.
		   	//단, 디렉토리 생성은 하지 않는다!!(없는 디렉토리가 있을시에는 에러!!)
		   	
		   	int i;
		   	 while( (i=fr.read()) !=  -1){//읽을 문자가 있다면
		   		 fw.write(i);
		   	 }
		   	
		   	//자원반환 
		   	fw.close();
		   	fr.close();
		   	System.out.println("파일복사 성공!!");
	   }
	}//main
}