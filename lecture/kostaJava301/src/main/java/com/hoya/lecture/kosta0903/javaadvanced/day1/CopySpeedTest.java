package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopySpeedTest {
	//a.txt  ----����-----> b.txt���ϻ���
	//daeho.jpg  ----����-----> leedaeho.jpg ���ϻ���
	FileInputStream fis;
	FileOutputStream fos;
	
	FileReader fr;
	FileWriter fw;
	
	BufferedReader br;
	BufferedWriter bw;	
	
	FileInputStream fis2;
	FileOutputStream fos2;
	
	
	public CopySpeedTest()throws Exception {
		
	   fis = new FileInputStream("a.txt");//byte���� �б�
	   fos = new FileOutputStream("b.txt");//byte���� ����
	   
	   fis2 = new FileInputStream("a.txt");//byte���� �б�
	   fos2 = new FileOutputStream("b.txt");//byte���� ����
		
	   int i;
	   
	   long start = System.currentTimeMillis();
	   while( (i=fis.read()) != -1 ){ //���̻� ���� ����Ʈ�� ���� �� -1 ����
	      fos.write(i);
	   }
	   long end = System.currentTimeMillis();
	   System.out.println("���翡 �ɸ��ð�(����Ʈ����): "+(end-start));
	   
	   fos.close();
	   fis.close();
	  
	   //------------------(���ڴ��� �����)------------------------------
	   fr = new FileReader("a.txt");
	   fw = new FileWriter("b.txt");
	   
	   start = System.currentTimeMillis();
	   while((i=fr.read()) != -1){//fr.read(): ���̻� ���� ���ڰ� ���ٸ� ���� -1
	      fw.write(i);   
	   }
	   end = System.currentTimeMillis();
	   System.out.println("���翡 �ɸ��ð�(���ڴ���): "+(end-start));
	   fw.close();
	   fr.close();	   
	 //------------------(���۱�ɻ�� �����)------------------------------
	   br = new BufferedReader(new FileReader("a.txt"));//("a.txt"));
	   bw = new BufferedWriter(new FileWriter("b.txt"));//("b.txt"));
	   
	   String str;
	   
	   start = System.currentTimeMillis();
	   while((str=br.readLine()) != null){  //�� �̻� ���� ������ ���ٸ� ���� null
	      bw.write(str);
	   }
	   end = System.currentTimeMillis();
	   System.out.println("���翡 �ɸ��ð�(���۱��): "+(end-start));
	   
	   bw.close();
	   br.close();
	   
	   //-------------------byte���� �����(byte�迭�� ���)-----------
	   byte b[] = new byte[1024];
	   
	   start = System.currentTimeMillis();
	   while( (i=fis2.read(b)) != -1 ){ //i����Ǵ� ��: ���� ����Ʈ��
		  fos2.write(b,0,i);//write(byte[] b, int offset, int length)
	   }
	   end = System.currentTimeMillis();
	   System.out.println("���翡 �ɸ��ð�(byte�迭���): "+(end-start));
	   
	   fos2.close();
	   fis2.close();
	   
	}//������
	
	
    public static void main(String[] args) throws Exception{
		new CopySpeedTest();
	}
}
