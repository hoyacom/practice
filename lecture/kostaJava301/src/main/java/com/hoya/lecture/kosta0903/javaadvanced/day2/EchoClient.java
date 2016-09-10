package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.net.Socket;

public class EchoClient {
   public static void main(String[] args) throws Exception {
	   //������ ���� ��û
	 //Socket s = new Socket(String host, int port); 
	   Socket s = new Socket("192.168.0.133", 5000);
	   System.out.println("���� ���� ����!!");
   }
}
