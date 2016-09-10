package com.hoya.lecture.kosta0903.javaadvanced.day2.chat;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Vector;

public class Service extends Thread{
   //���Ͽ� ���� ����¼���
   //������: Ŭ���̾�Ʈ�� ������ �޽����� �б�
	
   BufferedReader in;//from Client(Ŭ���̾�Ʈ �޽��� �б�)
   OutputStream out;// to Client(Ŭ���̾�Ʈ���� �޽��� ����,����)
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
   }//������
   
   @Override
	public void run() {
	   try {
		   
		  nickName = in.readLine();//�ѹ�����, Ŭ���̾�Ʈ�� ���� ��ȭ�� �б�
		   
		while(true){
			  String msg = in.readLine();//Ŭ���̾�Ʈ�� ���� �޽��� �б�
			  
			  System.out.println("from["+ s.getInetAddress().getHostAddress()+"]��"+ msg);
			  if(msg.charAt(0) == '@'){
				  nickName = msg.substring(1);
			  }else{
			  messageAll(nickName+"�� "+msg);
			  }
		}//while
	  } catch (IOException e) {
		e.printStackTrace();
	  }
	}//run
   
   public void messageTo(String msg)throws IOException{
	   /*
	    throws����? 	    
	   messageAll�� for�� ������ ������ ���� Ŭ���̾�Ʈ�� index������ ���
	   �ش� client�� Vector���� �����ϱ� ����!!
	   */
	   
	   //Ư�� Ŭ���̾�Ʈ���� �޽��� ����(���� �޽��� ����)
      out.write( (msg+"\n").getBytes() );
   }//messageTo
   
   public void messageAll(String msg){
	   //Ư�� Ŭ���̾�Ʈ�� ���� msg�� ��ü Ŭ���̾�Ʈ���� ����	   
	   //��ü Ŭ���̾�Ʈ���� �޽��� ����(���ӵ� Ŭ���̾�Ʈ���� ǥ��)
	   for(int i=0; i<v.size(); i++){//�����ε����� ǥ��
		  Service ser = v.get(i);
		  try {
			ser.messageTo(msg);
		} catch (IOException e) {
			//������ ���� Ŭ���̾�Ʈ�� �߻�������
			System.out.println("Ŭ���̾�Ʈ ���� ����!!");
			v.remove(i--);
		}
	   }
   }//messageAll
}






