package com.hoya.lecture.kosta0903.javaadvanced.day2.chat;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Vector;

public class Service extends Thread{
   //소켓에 대한 입출력서비스
   //스레드: 클라이언트가 보내온 메시지를 읽기
	
   BufferedReader in;//from Client(클라이언트 메시지 읽기)
   OutputStream out;// to Client(클라이언트에게 메시지 전달,쓰기)
   Vector<Service> v;
   
   String nickName;
   Socket s;
   
   public Service(Socket s, Vector<Service> v) {
	  try {
		in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		out = s.getOutputStream();
		this.v = v;
		this.s = s;
		start();
	} catch (IOException e) {
		e.printStackTrace();
	}
   }//생성자
   
   @Override
	public void run() {
	   try {
		   
		  nickName = in.readLine();//한번실행, 클라이언트가 보낸 대화명 읽기
		   
		while(true){
			  String msg = in.readLine();//클라이언트가 보낸 메시지 읽기
			  
			  System.out.println("from["+ s.getInetAddress().getHostAddress()+"]▶"+ msg);
			  if(msg.charAt(0) == '@'){
				  nickName = msg.substring(1);
			  }else{
			  messageAll(nickName+"▶ "+msg);
			  }
		}//while
	  } catch (IOException e) {
		e.printStackTrace();
	  }
	}//run
   
   public void messageTo(String msg)throws IOException{
	   /*
	    throws이유? 	    
	   messageAll의 for문 내에서 접속을 끊은 클라이언트의 index정보를 얻고
	   해당 client를 Vector에서 삭제하기 위해!!
	   */
	   
	   //특정 클라이언트에게 메시지 전달(실제 메시지 전달)
      out.write( (msg+"\n").getBytes() );
   }//messageTo
   
   public void messageAll(String msg){
	   //특정 클라이언트가 보낸 msg를 전체 클라이언트에게 전달	   
	   //전체 클라이언트에게 메시지 전달(접속된 클라이언트들을 표현)
	   for(int i=0; i<v.size(); i++){//벡터인덱스를 표현
		  Service ser = v.get(i);
		  try {
			ser.messageTo(msg);
		} catch (IOException e) {
			//접속을 끊은 클라이언트가 발생했을때
			System.out.println("클라이언트 접속 끊음!!");
			v.remove(i--);
		}
	   }
   }//messageAll
}






