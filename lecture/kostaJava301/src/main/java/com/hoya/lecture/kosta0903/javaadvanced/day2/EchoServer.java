package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.net.ServerSocket;

public class EchoServer {
   public static void main(String[] args) throws Exception{
	  //�������� ��ü����(���ϼ��� �غ�)
	  //ServerSocket ss = new ServerSocket(int port);
	  ServerSocket ss = new ServerSocket(5000);//0~65535
	//===> ���� ServerSocketŬ���� ����Ǵ� JVM�� ���� IP�ּҿ� ��õ� port��ȣ�� ����
	  
	  System.out.print("���� ����....");
	  ss.accept();//Ŭ���̾�Ʈ ���� ���
	  
	  System.out.println("�ȳ�~!!");
   }//main
}




