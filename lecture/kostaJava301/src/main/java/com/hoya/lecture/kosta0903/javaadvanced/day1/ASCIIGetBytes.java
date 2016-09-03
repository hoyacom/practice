package com.hoya.lecture.kosta0903.javaadvanced.day1;

public class ASCIIGetBytes {
   public static void main(String[] args) {
	  String str="hi java stream!!";
	  /*
	              str.getBytes()            str.toCharArray()
	          <---------------              ----------->
	    byte b[]             String str="abc";         char ch[]
	    ={97,98,99};                                       ={'a','b','c'};
	          ---------------->             <--------------
	           new String(b);                 new String(ch);
	  */
	  byte b[]= str.getBytes();
	  for(int i=0; i<b.length; i++){
		  System.out.write(b[i]);
		  if(i%3==2) System.out.write('\n');
	  }
	  
	  //System.out.flush();//���ۿ� �ִ� �����͸� ���!!(��°�ü������ ����)
	  System.out.close();//��°�ü�� ���� �ڿ���ȯ, flush()��ɵ� �Բ� ����
   }
}




