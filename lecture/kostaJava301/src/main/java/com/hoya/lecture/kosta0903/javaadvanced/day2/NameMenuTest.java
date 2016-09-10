package com.hoya.lecture.kosta0903.javaadvanced.day2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenuTest {
   
   public static void main(String[] args) throws IOException {
	  //���α׷� ����, �ݺ��Ǵ� �޴����
	   
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   NameMenu menu = new NameMenu();//�����͸� �߰�, ����, ����, �˻�
	   int num;
	   
	   do{
			  System.out.println("<�̸��޴�>");
		      System.out.println("1.�߰� 2.���� 3.���� 4.�˻� 5.������");
		      System.out.print("��ȣ==> ");
		      num = Integer.parseInt(in.readLine());//Integer.parseInt("1");-->1
		      System.out.println();
			  switch(num){
			     case 1: {
			    	     System.out.print("�̸�: ");			     
					     String name = in.readLine(); 
				         menu.addName(name);
			             } break;
				 
			     case 2: System.out.print("�����̸�: ");
			             String name = in.readLine();
					     menu.delName(name);
					     break;
					     
				 case 3: 
					     System.out.print("�����̸�(�����̸�): ");
					       String oldName = in.readLine();
					     System.out.print("�����̸�(���̸�): ");
					       String newName = in.readLine();					       
					     menu.editName(oldName, newName); 
					     
					     break;
				 case 4: menu.listName();		 
			  }//switch
			  System.out.println();
			  
	    }while(num != 5);//�޴����� 5���� ���ý� ������
	   
	    System.out.println("-- END --");
	   
   }//main
}
