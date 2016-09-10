package com.hoya.lecture.kosta0903.javaadvanced.day2;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class GoodLuckLotto {

	public static void main(String[] args) {
		//로또번호발생 : 1~45의 수 중에서 중복되는 않는 6개의 숫자
		//Set ----> 중복되는 않는 데이터를 저장.
		Set<Integer> set = new TreeSet<>();
		
		//랜덤수: Math.random(), Random ----> next()
		Random r = new Random();
		
		while(true){
		 int num = r.nextInt(45)+1; //0~44+1 --->  1~45		 
		 set.add(num);
		 //System.out.println("set데이터수: "+ set.size());
		 if(set.size()==6) break;//중복되지 않은 6개의 데이터가 set에 저장.
		}
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()){
		 System.out.print(iter.next()+" ");
		}
	}//main
	
}




