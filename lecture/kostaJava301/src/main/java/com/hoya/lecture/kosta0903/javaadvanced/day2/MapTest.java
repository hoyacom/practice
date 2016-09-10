package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	
	public static void main(String[] args) {
		//Map: Key�� Value(������)�� ������ �����ϴ� Ŭ����
		//     ������ key���� ���´�.
		//Map<K, V>
		Map<String,Object> map = new HashMap<>();
		   //map.put(String key,Object value)
		  map.put("name", "���浿");
		  map.put("age", 13);
		  map.put("job", "�л�");
		  map.put("name", "������");
		  
	    //map.get(String key);//����� Ű���� ���� �����͸� ������  
		  System.out.println("�̸�: "+ map.get("name") );
		  System.out.println("����: "+ map.get("age") );
		  System.out.println("����: "+ map.get("job") );
		  System.out.println("�̸���: "+ map.get("email") );
	}

}
