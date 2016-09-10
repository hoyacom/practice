package com.hoya.lecture.kosta0903.javaadvanced.day2.chat;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener,Runnable{
   //채팅방
   JTextField sendTF;
   JLabel la_msg;
   
   JTextArea ta;
   JScrollPane sp_ta,sp_list;   	
   
   JList<String> li_inwon;
   JButton bt_change,bt_exit;   
   
   JPanel p;	

   //소켓 입출력
   BufferedReader in;//from Server(서버가 보내는 메시지)
   OutputStream out;//to Server(서버에게 보낼 메시지)
   
   
   public ChatClient() {
	  setTitle("채팅방");
	  sendTF = new JTextField(15);
	  
	  la_msg = new JLabel("Message");
	  	  
	  ta = new JTextArea();
	  li_inwon = new JList<String>();
	  
	  sp_ta = new JScrollPane(ta);
	  sp_list = new JScrollPane(li_inwon);
	  	  
	  bt_change = new JButton("대화명변경");
	  bt_exit = new JButton("나가기");
	  
	  p = new JPanel();
	  
	  sp_ta.setBounds(10,10,380,390); 
	  la_msg.setBounds(10,410,60,30); 
	  sendTF.setBounds(70,410,320,30); 
	  
	  sp_list.setBounds(400,10,120,350); 
	  bt_change.setBounds(400,370,120,30); 
	  bt_exit.setBounds(400,410,120,30); 
	  
	  p.setLayout(null);
	  p.setBackground(Color.PINK);
	  p.add(sp_ta);
	  p.add(la_msg);
	  p.add(sendTF);
	  p.add(sp_list);
	  p.add(bt_change);
	  p.add(bt_exit);
	  
	  add(p);
	  setBounds(300,200,550,500);
	  setVisible(true);
	  	  
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  sendTF.requestFocus();
	  
	  eventUp();
	  connectProcess();
	  String nickName = JOptionPane.showInputDialog(this, "대화명:");
	  try {
		  out.write((nickName+"\n").getBytes());
	  } catch (IOException e) {
		  e.printStackTrace();
	  }
	  new Thread(this).start();
   }//생성자  
   
   //서버연결
   public void connectProcess(){//연결처리
	  try {
		Socket s = new Socket("192.168.0.133",5000);//Socket(String host, int port) 
		  in =  new BufferedReader(new InputStreamReader(s.getInputStream()));
		  out = s.getOutputStream();
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
   }//connectProcess
   
   //서버가 보내는 메시지 처리
   public void run(){
	   try {
		while(true){
		     String msg = in.readLine();
		     ta.append(msg+"\n");
		     //ta.setCaretPosition(int position);
		     ta.setCaretPosition(ta.getText().length());
		   }
	 } catch (IOException e) {
		e.printStackTrace();
	 }
   }//run
   
   //서버에게 메시지 보내기
   public void sendMessage(String msg){
	   try {
		out.write( (msg+"\n").getBytes());
	  } catch (IOException e) {
		e.printStackTrace();
	 }
   }//sendTF
   
   void eventUp(){
	  sendTF.addActionListener(this); 
	  bt_change.addActionListener(this);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
	  Object ob = e.getSource();//이벤트소스의 레퍼런스
      if(ob == sendTF){//텍스트 필드에서 엔터
    	 String msg = sendTF.getText();
    	 sendMessage(msg);
    	 sendTF.setText("");
      }else if(ob == bt_change){//대화명변경버튼 클릭
    	 String newName = JOptionPane.showInputDialog(this, "변경할대화명:"); 
         try {
			out.write( ("@"+newName+"\n").getBytes());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
      }
   }//actionPerformed
   
  
   
   public static void main(String[] args) {
	  new ChatClient();
   }


}


