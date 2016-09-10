package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	 
 /* void findAll(ArrayList list){
	  
  }
  
  void findAll(LinkedList list){
	  
  }*/
	void findAll(List list){
		
	}
	
  public static void main(String[] args) {
	  //List�������̽� ������ Ŭ����: Vector, ArrayList, LinkedList
	  
	  /*ArrayList<String> list = new ArrayList<>();
	  LinkedList<String> list2 = new LinkedList<>();*/
	  List<String> list = new ArrayList<>();
	           //ArrayList: �������� �Է�, �������� �˻��� ����
	  
	  List<String> list2 = new LinkedList<>();
	           //LinkedList: ����� ����,������ ����
	  
	  //�����͸� �߰�
	  long start = System.currentTimeMillis();
	  for(int i=0; i<100000; i++){
		  //list.add("ȫ�浿");
		  //list.add(int index,String element);
		  list.add(0,"ȫ�浿");		  
	  }
	  long end = System.currentTimeMillis();
	  System.out.println("ArrayList ������ �߰��ð�: "+ (end-start));
	  
	  start = System.currentTimeMillis();
	  for(int i=0; i<100000; i++){
		  list2.add(0,"ȫ�浿");
	  }
	  end = System.currentTimeMillis();
	  System.out.println("LinkedList ������ �߰��ð�: "+ (end-start));
	  
  }
}
