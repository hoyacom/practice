package com.hoya.lecture.kosta0903.javaadvanced.day2.chat;



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server extends Thread{
   //소켓을 통해 접속한 클라이언트를 관리!!
	ServerSocket ss;
	Vector<Service> v;//접속한 클라이언트를 저장
	//Service클래스 == 클라이언트
	
	
   public Server() {
	 try {
		//소켓서버시작(현시스템ip, 지정된 port번호)
		  ss = new ServerSocket(5000);//서버ON
		  System.out.println("서버시작...");
		  v = new Vector<Service>();
		  start();
	} catch (IOException e) {
		e.printStackTrace();
	}
   }//생성자	
	
	
   //코드: (여러 클라이언트)접속대기서비스
   public void run(){
	   try {
		while(true){  
			  Socket s= ss.accept();//클라이언트 접속대기 
			  //s: 접속한 클라이언트의 정보
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
