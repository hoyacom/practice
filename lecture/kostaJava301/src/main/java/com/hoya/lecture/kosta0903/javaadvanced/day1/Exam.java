package com.hoya.lecture.kosta0903.javaadvanced.day1;

public class Exam {
   public static void main(String[] args) {
       int a,b,c=10;
       
       int su1=10;
       int su2=20;
       
       if(su1>su2){
          a=20;
          b=30;
       }else{
          a=40;          
       }
       
       try{
               //���ܹ߻� ���ɼ� ����;
           b=50;
       }catch(Exception e){}
       
       System.out.println(a); //---->�������� ���
       //System.out.println(b); //----> if��,try���� ������ ���� �� �ֱ� ������ ����!!
       System.out.println(c); //---->�������� ��� 
   }
}
