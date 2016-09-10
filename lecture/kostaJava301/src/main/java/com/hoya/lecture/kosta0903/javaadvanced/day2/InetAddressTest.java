package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.net.InetAddress;

public class InetAddressTest {
   public static void main(String[] args) throws Exception{
	  //InetAddress ia = InetAddress.getByName(String host);
	   
	   String host="www.kosta.or.kr";
	   InetAddress ia = InetAddress.getByName(host);
	    String hostName = ia.getHostName();
	    String hostAddrss = ia.getHostAddress();
	    
	   System.out.println("ȣ��Ʈ�̸�: "+ hostName);
	   System.out.println("ȣ��Ʈ�ּ�: "+ hostAddrss);
	   
	   System.out.println("=================================");
	   InetAddress ias[] = InetAddress.getAllByName(host);
	   for (int i = 0; i < ias.length; i++) {
		    System.out.println(ias[i].getHostAddress());
	   }
	   
   }
}



