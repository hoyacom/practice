package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.File;

public class FileTest {
   public static void main(String[] args) throws Exception{
	   File f = new File("a.txt");
	   
	   //FileŬ����: ���� �Ǵ� ���丮�� ���� �����Ӽ��� ��� Ŭ����
	   System.out.println("���ϸ�:"+f.getName());
	   System.out.println("���ϰ��:"+f.getPath());
	   System.out.println("���ϰ��:"+f.getAbsolutePath());
	   System.out.println("���ϰ��:"+f.getCanonicalPath());
	   System.out.println("����?:"+f.isFile());
	   System.out.println("���丮?:"+f.isDirectory());
	  
	   File f2 = new File("../../a.txt");//..�θ���丮    .������
	      System.out.println("���ϰ��:"+ f2.getAbsolutePath());
	      System.out.println("���ϰ��:"+ f2.getCanonicalPath());
	   
	   System.out.println("f��������:"+ f.exists());   
	   System.out.println("f2��������:"+ f2.exists()); 
	   
	   //���ο� ��������, �����ϴ� ���� ����
	   //File f3 = new File("E:/jaelee/workspace/JavaApp/a/b");
	   File f3 = new File("a/b/cd");
	        f3.mkdirs();//���丮���� makeDirectory
	   System.out.println("f3���丮 ����!!");  
	   
	   File deleteFile = new File("e:/jaelee/workspace/JavaApp/a/b/cd");
	   //f3.delete();//a.txt������ ����
	   MyDelete md = new MyDelete();
	      md.delete("a/b/cd", "JavaApp");
	   System.out.println("f���� ����!!");
   }
}





