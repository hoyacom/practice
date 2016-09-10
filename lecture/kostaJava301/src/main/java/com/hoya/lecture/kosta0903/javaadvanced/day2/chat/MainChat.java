package com.hoya.lecture.kosta0903.javaadvanced.day2.chat;



import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class MainChat extends JFrame{
   JList<String> roomInfo,roomInwon,waitInfo;
   JScrollPane sp_roomInfo, sp_roomInwon, sp_waitInfo;
   JButton bt_create, bt_enter, bt_exit;
   
   JPanel p;
	
   public MainChat() {
	 setTitle("����");
	 roomInfo = new JList<String>();
	   roomInfo.setBorder(new TitledBorder("������"));
	 roomInwon = new JList<String>();
	   roomInwon.setBorder(new TitledBorder("�ο�����"));
	 waitInfo = new JList<String>();
       waitInfo.setBorder(new TitledBorder("��������"));
       
     sp_roomInfo = new JScrollPane(roomInfo);
     sp_roomInwon = new JScrollPane(roomInwon);
     sp_waitInfo = new JScrollPane(waitInfo);
     
     bt_create = new JButton("�游���");
     bt_enter = new JButton("�����");
     bt_exit = new JButton("������");     
     
     p = new JPanel();
     
     sp_roomInfo.setBounds(10, 10, 300, 300);
     sp_roomInwon.setBounds(320, 10, 150, 300);
     sp_waitInfo.setBounds(10, 320, 300, 130);
     
     bt_create.setBounds(320,330,150,30);
     bt_enter.setBounds(320,370,150,30);
     bt_exit.setBounds(320,410,150,30);
     
     p.setLayout(null);
      p.setBackground(Color.orange);
     p.add(sp_roomInfo);
     p.add(sp_roomInwon);
     p.add(sp_waitInfo);
     p.add(bt_create);
     p.add(bt_enter);
     p.add(bt_exit);
     
     add(p);
     setBounds(300,200, 500, 500);
     setVisible(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     
     
   }//������
   
   public static void main(String[] args) {
	  new MainChat();
   }
}
