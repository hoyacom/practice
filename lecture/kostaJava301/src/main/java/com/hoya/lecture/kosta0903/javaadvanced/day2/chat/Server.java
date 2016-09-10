package com.hoya.lecture.kosta0903.javaadvanced.day2.chat;



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server extends Thread{
   //������ ���� ������ Ŭ���̾�Ʈ�� ����!!
	ServerSocket ss;
	Vector<Service> v;//������ Ŭ���̾�Ʈ�� ����
	//ServiceŬ���� == Ŭ���̾�Ʈ
	
	
   public Server() {
	 try {
		//���ϼ�������(���ý���ip, ������ port��ȣ)
		  ss = new ServerSocket(5000);//����ON
		  System.out.println("��������...");
		  v = new Vector<Service>();
		  start();
	} catch (IOException e) {
		e.printStackTrace();
	}
   }//������	
	
	
   //�ڵ�: (���� Ŭ���̾�Ʈ)���Ӵ�⼭��
   public void run(){
	   try {
		while(true){  
			  Socket s= ss.accept();//Ŭ���̾�Ʈ ���Ӵ�� 
			  //s: ������ Ŭ���̾�Ʈ�� ����
			  Service ser = new Service(s,v);
		      v.addElement(ser);
		   }
	} catch (IOException e) {
		e.printStackTrace();
	}	    
   }//run	
	
   public static void main(String[] args) {
	  new Server();
   }
}
