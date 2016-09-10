package com.hoya.lecture.kosta0903.javaadvanced.day2;

public class Account {//�����
	
   private int total;//������

   public synchronized void deposit(int account){//��ݱ��
	   total += account;
   }
   
   public int getTotal(){//��ݵ� �Ѿ�
	   return total;
   }
}
