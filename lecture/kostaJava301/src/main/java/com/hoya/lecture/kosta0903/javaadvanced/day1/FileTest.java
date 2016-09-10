package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.File;

public class FileTest {
   public static void main(String[] args) throws Exception{
	   File f = new File("a.txt");
	   
	   //File클래스: 파일 또는 디렉토리에 대한 정보속성을 얻는 클래스
	   System.out.println("파일명:"+f.getName());
	   System.out.println("파일경로:"+f.getPath());
	   System.out.println("파일경로:"+f.getAbsolutePath());
	   System.out.println("파일경로:"+f.getCanonicalPath());
	   System.out.println("파일?:"+f.isFile());
	   System.out.println("디렉토리?:"+f.isDirectory());
	  
	   File f2 = new File("../../a.txt");//..부모디렉토리    .현재경로
	      System.out.println("파일경로:"+ f2.getAbsolutePath());
	      System.out.println("파일경로:"+ f2.getCanonicalPath());
	   
	   System.out.println("f존재유무:"+ f.exists());   
	   System.out.println("f2존재유무:"+ f2.exists()); 
	   
	   //새로운 폴더생성, 존재하는 파일 삭제
	   //File f3 = new File("E:/jaelee/workspace/JavaApp/a/b");
	   File f3 = new File("a/b/cd");
	        f3.mkdirs();//디렉토리생성 makeDirectory
	   System.out.println("f3디렉토리 생성!!");  
	   
	   File deleteFile = new File("e:/jaelee/workspace/JavaApp/a/b/cd");
	   //f3.delete();//a.txt파일을 삭제
	   MyDelete md = new MyDelete();
	      md.delete("a/b/cd", "JavaApp");
	   System.out.println("f삭제 성공!!");
   }
}





