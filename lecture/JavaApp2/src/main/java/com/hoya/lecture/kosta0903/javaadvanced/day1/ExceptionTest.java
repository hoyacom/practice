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
		  //���ܹ߻��� ó���� ����
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
		     //fr.read();//���Ͽ��� �ѹ��ھ� �о ���ڿ� ���� �ڵ���ڰ��� ����
		   //System.out.println( fr.read());// (char)97 ---->'a'
		   int i;
		   while( (i=fr.read()) != -1){//���� ���ڰ� �ִٸ�
			   System.out.print((char)i);
		   }
	   }catch(FileNotFoundException e ){//�ڽ� ����
		  //������ ã�� ������ �� ó���� �ڵ�
		   System.out.println("������ ��θ� Ȯ���ϼ���!!");
		   System.out.println(e);
		   System.out.println(e.toString());
		   System.out.println(e.getMessage());
		   e.printStackTrace();
		   
	   }catch(IOException e){//�θ� ����
		  //�θ�Exception�� �ڽ�Exceptionó��
		  //�б⸦ �ϴٰ� ������ �߻����� �� ó���� �ڵ�  
	   }
   }//main
}







