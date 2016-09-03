package com.hoya.lecture.kosta0903.javaadvanced.day1;

public class ExceptionTest2 {
   public static void main(String[] args) {//String args[]={"10","ab"};
	   /*
	        su1     su2
	        10       5     ------> 정상적인 실행
	        10       0
	        10      ab
	        10       X 
	    
	    */
	 try{  
	   int su1 = Integer.parseInt(args[0]); //"10" ---> 10
	               //ArrayIndexOutOfBoundsException,NumberFormatException
	   int su2 = Integer.parseInt(args[1]); //"ab" ---> ab
	   System.out.println("매개변수를 통해 받은 두개의 숫자");
	   System.out.println("SU1="+su1+", SU2="+su2);
	   System.out.println("SU1을 SU2로 나눈 몫= "+ (su1/su2));
	              //ArithmeticException
	   System.out.println("나눗셈을 원할히 수행하였습니다!!");
	 }catch(NumberFormatException e){
		 System.out.println("Number형식에러발생: "+ e);
		 System.out.println("숫자만 입력!!");
		 return;
	 }catch(Exception e){
		 System.out.println("모든 예외처리!!: "+ e);
	 }finally{
		//예외발생과 상관없이 무조건 실행문장.
		 System.out.println("finally()블럭실행");
	 }
	 
	 System.out.println("마지막 문장!!");
	 
	 /*catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("ArrayIndex에러발생: "+ e);
	 }catch(ArithmeticException e){
		 System.out.println("나누기 0에러발생: "+ e);
	 }*/
	 
   }//main
}




