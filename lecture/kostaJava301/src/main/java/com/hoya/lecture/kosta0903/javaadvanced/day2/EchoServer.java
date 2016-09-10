package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
   public static void main(String[] args) throws Exception{
	  //�������� ��ü����(���ϼ��� �غ�)
	  //ServerSocket ss = new ServerSocket(int port);
	  ServerSocket ss = new ServerSocket(5000);//0~65535
	//===> ���� ServerSocketŬ���� ����Ǵ� JVM�� ���� IP�ּҿ� ��õ� port��ȣ�� ����
	  
	  System.out.println("���� ����....");
	  
	 while(true){ 
	  Socket s = ss.accept();//Ŭ���̾�Ʈ ���� ���
	  
	  InetAddress ia = s.getInetAddress();//���� �����ߴ��� �ñ�?
	  String hostAddr = ia.getHostAddress();
	  System.out.println("������ Ŭ���̾�Ʈ ����: "+ hostAddr);
	  
	  String msg="��ſ� �߼��Ǽ���~^^*[����� IP:"+ hostAddr+"]\n";
	  //Ŭ���̾�Ʈ���� �޽��� ����(��°�ü)
	  OutputStream  out =  s.getOutputStream();
	    out.write( msg.getBytes()  );
	  
	 }
   }//main
}




