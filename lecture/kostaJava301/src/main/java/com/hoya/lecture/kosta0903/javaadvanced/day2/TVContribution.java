package com.hoya.lecture.kosta0903.javaadvanced.day2;

public class TVContribution {
  public static void main(String[] args) {//TV��ü
	
	  //������ �����
	  Account account = new Account();
	  
	  //5���� ������(������)
	  //Customer c1 = new Customer(account);
	  //Customer c2 = new Customer(account);
	  Customer customers[] = new Customer[5];
		for(int i=0; i<customers.length; i++){
			  customers[i] = new Customer(account);//������(�����) ��ü ����			  
		  }
	    
	 
	  
	  for(int i=0; i<customers.length; i++){
		  //��ݽ���
		  customers[i].start();
	  }
	  
	  try {
		  for(int i=0; i<customers.length; i++){
			  customers[i].join();
			  //�� �����尡 run()�޼ҵ� ������ ����ĥ������ main�����尡 ��ٸ�.
		  }
	    }catch (InterruptedException e) {
		  e.printStackTrace();
	   }
	  
	  System.out.println("�� ��ݾ�: "+ account.getTotal());
	  
  }
}
