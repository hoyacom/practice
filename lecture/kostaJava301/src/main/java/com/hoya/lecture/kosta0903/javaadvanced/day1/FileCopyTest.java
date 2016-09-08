package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyTest {
   //a.txt(�б�)   -----> b.txt(����)���� ����
	public static void main(String[] args) throws Exception{
		
		File f = new File("a.txt");
		
	   if(f.exists()){//������ ���������� ����!!
		   	FileReader fr = new FileReader(f);//"a.txt");//�бⰴü read
		   	
		   	FileWriter fw = new FileWriter("b.txt");//���ⰴü write
		   	//FileWriter�� FileOutputStream�� ������ �Ķ���Ϳ� ��õ������� �����ϴ� ���.
		   	//��, ���丮 ������ ���� �ʴ´�!!(���� ���丮�� �����ÿ��� ����!!)
		   	
		   	int i;
		   	 while( (i=fr.read()) !=  -1){//���� ���ڰ� �ִٸ�
		   		 fw.write(i);
		   	 }
		   	
		   	//�ڿ���ȯ 
		   	fw.close();
		   	fr.close();
		   	System.out.println("���Ϻ��� ����!!");
	   }
	}//main
}