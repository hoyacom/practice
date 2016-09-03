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
               //예외발생 가능성 문장;
           b=50;
       }catch(Exception e){}
       
       System.out.println(a); //---->정상적인 출력
       //System.out.println(b); //----> if문,try블럭은 실행을 안할 수 있기 때문에 에러!!
       System.out.println(c); //---->정상적인 출력 
   }
}
