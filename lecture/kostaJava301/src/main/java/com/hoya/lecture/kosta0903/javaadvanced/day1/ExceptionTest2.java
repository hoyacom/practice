package com.hoya.lecture.kosta0903.javaadvanced.day1;

public class ExceptionTest2 {
   public static void main(String[] args) {//String args[]={"10","ab"};
	   /*
	        su1     su2
	        10       5     ------> �������� ����
	        10       0
	        10      ab
	        10       X 
	    
	    */
	 try{  
	   int su1 = Integer.parseInt(args[0]); //"10" ---> 10
	               //ArrayIndexOutOfBoundsException,NumberFormatException
	   int su2 = Integer.parseInt(args[1]); //"ab" ---> ab
	   System.out.println("�Ű������� ���� ���� �ΰ��� ����");
	   System.out.println("SU1="+su1+", SU2="+su2);
	   System.out.println("SU1�� SU2�� ���� ��= "+ (su1/su2));
	              //ArithmeticException
	   System.out.println("�������� ������ �����Ͽ����ϴ�!!");
	 }catch(NumberFormatException e){
		 System.out.println("Number���Ŀ����߻�: "+ e);
		 System.out.println("���ڸ� �Է�!!");
		 return;
	 }catch(Exception e){
		 System.out.println("��� ����ó��!!: "+ e);
	 }finally{
		//���ܹ߻��� ������� ������ ���๮��.
		 System.out.println("finally()������");
	 }
	 
	 System.out.println("������ ����!!");
	 
	 /*catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("ArrayIndex�����߻�: "+ e);
	 }catch(ArithmeticException e){
		 System.out.println("������ 0�����߻�: "+ e);
	 }*/
	 
   }//main
}




