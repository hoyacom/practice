package com.hoya.lecture.kosta0903.javaadvanced.day1;

public class ASCIITest {//�����ڵ忡 �ش��ϴ� ���ڸ� ���
	
   public static void main(String[] args) {
	  for(int i=32; i<127; i++){//�ƽ�Ű�ڵ� ���� ǥ��
		 System.out.write(i);
		 if(i%8 == 7) System.out.write('\n');// \n :new line���
		 else System.out.write('\t');//  \t : tab���
	  }
   }	

}
