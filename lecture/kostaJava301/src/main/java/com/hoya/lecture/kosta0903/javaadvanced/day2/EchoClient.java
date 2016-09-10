package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class EchoClient {
   public static void main(String[] args) throws Exception {
	   //������ ���� ��û
	 //Socket s = new Socket(String host, int port); 
	   Socket s = new Socket("192.168.0.133", 5000);
	   System.out.println("���� ���� ����!!");
	   
	   //������ ���� �޽��� �б�(�Է°�ü ����)
	   InputStream is= s.getInputStream();
	   BufferedReader in = new BufferedReader(new InputStreamReader   (is));
	   //                      ���۱�� <---------  ����Ʈ�� ���ڷ� ��ȯ <-- ����Ʈ
	   String fromServer = in.readLine();
	   System.out.println("�����޽���: "+ fromServer);
	   
   }
}
