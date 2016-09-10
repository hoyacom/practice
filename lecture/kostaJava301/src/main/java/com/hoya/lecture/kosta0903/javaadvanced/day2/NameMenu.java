package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.util.ArrayList;
import java.util.List;

public class NameMenu {
   List<String> list;
  
   public NameMenu() {
	   list = new ArrayList<>();
   }
	
 //�޼ҵ�: �����͸� �߰�,�˻�,����,�������.
   public void addName(String name){
	  list.add(name);
   }//�߰�
   
   public void delName(String name){
	  for(int i=0; i<list.size(); i++){//ArrayList�� �߰��� ��� ����: size()
		 String oldName =  list.get(i);
		 if(oldName.equals(name)){//��ġ�ϴ� �̸��� ã�Ҵٸ�
			 list.remove(i);//�����۾�
			 break;
		 }
	  }
   }//����
   public void editName(String oldName,String  newName){
	 for(int i=0; i<list.size(); i++){//ArrayList�� �߰��� ��� ����: size()
			
			 if(list.get(i).equals(oldName)){//��ġ�ϴ� �̸��� ã�Ҵٸ�
				 //list.set(int index,String element)//�����۾�
				 list.set(i, newName);//�����۾�
				 break;
			 }
     }
   }//����
   public void listName(){//��ü�����Ͱ˻�
	 System.out.println("[�̸����]");
	 for(int i=0; i<list.size(); i++){
		 System.out.println(" "+ list.get(i)+":"+ i);
	 }
   }//listName
	
}
