package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
   public static void main(String[] args) {
	  try {
		URL url = new URL("http://www.naver.com/index.html");
		  System.out.println("Protocol:"+url.getProtocol());
		  System.out.println("Host:"+url.getHost());
		  System.out.println("Port:"+url.getPort());
		  System.out.println("Path:"+url.getPath());
		  System.out.println("File:"+url.getFile());
//BufferedReader br = new BufferedReader(new InputStreamReader(InputStream)); 
//                                                             System.in
//                                                             FileInputStream
          
		  System.out.println("Ư������Ʈ�� �ҽ� ������");
		  System.out.println("==============================");
		  BufferedReader br = new BufferedReader
    		   (new InputStreamReader(url.openStream(),"UTF-8"));		
          String str;		 		  
          while((str=br.readLine()) != null){
        	  System.out.println(str);
          }
          
	} catch (MalformedURLException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
   }//main
}
