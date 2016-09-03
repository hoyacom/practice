package com.hoya.lecture.kosta0903.javaadvanced.day1;

public class ASCIITest {//숫자코드에 해당하는 문자를 출력
	
   public static void main(String[] args) {
	  for(int i=32; i<127; i++){//아스키코드 숫자 표현
		 System.out.write(i);
		 if(i%8 == 7) System.out.write('\n');// \n :new line기능
		 else System.out.write('\t');//  \t : tab기능
	  }
   }	

}
