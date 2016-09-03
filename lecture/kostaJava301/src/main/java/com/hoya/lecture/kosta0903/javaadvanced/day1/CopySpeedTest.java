package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopySpeedTest {
	//a.txt  ----복사-----> b.txt파일생성
	//daeho.jpg  ----복사-----> leedaeho.jpg 파일생성
	FileInputStream fis;
	FileOutputStream fos;
	
	FileReader fr;
	FileWriter fw;
	
	BufferedReader br;
	BufferedWriter bw;	
	
	FileInputStream fis2;
	FileOutputStream fos2;
	
	
	public CopySpeedTest()throws Exception {
		
	   fis = new FileInputStream("a.txt");//byte단위 읽기
	   fos = new FileOutputStream("b.txt");//byte단위 쓰기
	   
	   fis2 = new FileInputStream("a.txt");//byte단위 읽기
	   fos2 = new FileOutputStream("b.txt");//byte단위 쓰기
		
	   int i;
	   
	   long start = System.currentTimeMillis();
	   while( (i=fis.read()) != -1 ){ //더이상 읽을 바이트가 없을 때 -1 리턴
	      fos.write(i);
	   }
	   long end = System.currentTimeMillis();
	   System.out.println("복사에 걸린시간(바이트단위): "+(end-start));
	   
	   fos.close();
	   fis.close();
	  
	   //------------------(문자단위 입출력)------------------------------
	   fr = new FileReader("a.txt");
	   fw = new FileWriter("b.txt");
	   
	   start = System.currentTimeMillis();
	   while((i=fr.read()) != -1){//fr.read(): 더이상 읽을 문자가 없다면 리턴 -1
	      fw.write(i);   
	   }
	   end = System.currentTimeMillis();
	   System.out.println("복사에 걸린시간(문자단위): "+(end-start));
	   fw.close();
	   fr.close();	   
	 //------------------(버퍼기능사용 입출력)------------------------------
	   br = new BufferedReader(new FileReader("a.txt"));//("a.txt"));
	   bw = new BufferedWriter(new FileWriter("b.txt"));//("b.txt"));
	   
	   String str;
	   
	   start = System.currentTimeMillis();
	   while((str=br.readLine()) != null){  //더 이상 읽을 라인이 없다면 리턴 null
	      bw.write(str);
	   }
	   end = System.currentTimeMillis();
	   System.out.println("복사에 걸린시간(버퍼기능): "+(end-start));
	   
	   bw.close();
	   br.close();
	   
	   //-------------------byte단위 입출력(byte배열을 사용)-----------
	   byte b[] = new byte[1024];
	   
	   start = System.currentTimeMillis();
	   while( (i=fis2.read(b)) != -1 ){ //i저장되는 값: 읽은 바이트수
		  fos2.write(b,0,i);//write(byte[] b, int offset, int length)
	   }
	   end = System.currentTimeMillis();
	   System.out.println("복사에 걸린시간(byte배열사용): "+(end-start));
	   
	   fos2.close();
	   fis2.close();
	   
	}//생성자
	
	
    public static void main(String[] args) throws Exception{
		new CopySpeedTest();
	}
}
