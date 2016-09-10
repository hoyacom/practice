package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {
    public static void main(String[] args) {
		try {
			ObjectInputStream ois = 
					new ObjectInputStream(new FileInputStream("person.ser"));
			
			Object ob = ois.readObject();
			Person p = (Person)ob;
			System.out.println("이름: "+ p.name);
			System.out.println("나이: "+ p.age);
			System.out.println("직업: "+ p.job);
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
