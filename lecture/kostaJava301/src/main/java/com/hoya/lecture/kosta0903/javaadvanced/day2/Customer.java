package com.hoya.lecture.kosta0903.javaadvanced.day2;

public class Customer extends Thread{//�������� �����
   Account account;
	
   public Customer(Account account) {
	   this.account = account;
   }
   
   public void run(){
	 try {
		for(int i=1; i<=200; i++){  
			 Thread.sleep(50);//0.05�� ����
		     account.deposit(1000);
		     System.out.println(getName()+": "+ i);
		     if(account.getTotal()>=500000){
		    	 break;
		     }
		  }
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   }//run()
}




