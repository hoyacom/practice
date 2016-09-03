package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
	
   public void m1()throws Exception{
	   
   }	
   public void m2(){
	  try{
	    m1();
	  }catch(Exception e){
		  //예외발생시 처리할 문장
	  }
   }	
   public void m3(){
	  m2(); 
   }	
   
	
	
	
   public static void main(String[] args){ //throws FileNotFoundException,IOException{
	  //FileReader fr = new FileReader("e:\\jaelee\\workspace\\JavaApp\\a.txt"); 
	  //FileReader fr = new FileReader("e:/jaelee/workspace/JavaApp/a.txt"); 
	  //FileReader fr = new FileReader("0903/a.txt"); 
	   try{  
		   FileReader fr = new FileReader("c.txt");
		     //fr.read();//파일에서 한문자씩 읽어서 문자에 대한 코드숫자값을 리턴
		   //System.out.println( fr.read());// (char)97 ---->'a'
		   int i;
		   while( (i=fr.read()) != -1){//읽은 문자가 있다면
			   System.out.print((char)i);
		   }
	   }catch(FileNotFoundException e ){//자식 먼저
		  //파일을 찾지 못했을 때 처리할 코드
		   System.out.println("파일의 경로를 확인하세요!!");
		   System.out.println(e);
		   System.out.println(e.toString());
		   System.out.println(e.getMessage());
		   e.printStackTrace();
		   
	   }catch(IOException e){//부모 나중
		  //부모Exception은 자식Exception처리
		  //읽기를 하다가 에러가 발생했을 때 처리할 코드  
	   }
   }//main
}







