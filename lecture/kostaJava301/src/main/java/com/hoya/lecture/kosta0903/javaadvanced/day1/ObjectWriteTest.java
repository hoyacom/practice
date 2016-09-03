package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {
   public static void main(String[] args) {
	  try {
		ObjectOutputStream oos = 
				  new ObjectOutputStream(new FileOutputStream("person.ser"));
		  Person p = new Person(); //������(Object)
		  oos.writeObject(p);		  
		  oos.close();
		  System.out.println("��ü���� ����!!");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	  
	  
   }//main
}
