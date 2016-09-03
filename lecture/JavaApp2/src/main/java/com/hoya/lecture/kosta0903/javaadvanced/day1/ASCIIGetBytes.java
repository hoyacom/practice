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
	  
	  //System.out.flush();//버퍼에 있는 데이터를 출력!!(출력객체내에만 존재)
	  System.out.close();//출력객체에 대한 자원반환, flush()기능도 함께 실행
   }
}




