package com.hoya.lecture.kosta0903.javaadvanced.day2;

class My extends Thread{
	
	//�������� Ư�� �޼ҵ�
	@Override
	public void run() {
	   try {
		for(int i=1; i<11; i++){
			   Thread.sleep(500);//0.5�� �������ִٰ� ����
			   System.out.println("�浿������[1]:"+ i);
		   }
	   } catch (InterruptedException e) {
		e.printStackTrace();
	   }
	}//run	
}//class My


class My2 extends Object implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=1; i<11; i++){
				   Thread.sleep(500);//0.5�� �������ִٰ� ����
				   System.out.println("���ӽ�����[2]:"+ i);
			   }
		   } catch (InterruptedException e) {
			e.printStackTrace();
		   }
	}//run
	
}//class My2



public class ThreadTest {
   public static void main(String[] args) {
	   My m = new My();
	   My2 m2 = new My2();
	   //Thread t = new Thread(Runnable��ü-run()�޼ҵ��� ��ġ);
	   Thread t = new Thread(m2);
	    
	   //�켱���� �ο�(m,t������)
	   //m.setPriority(1);//1(min)~10(max) 
	   m.setPriority(Thread.MIN_PRIORITY);//1
	   m.setPriority(Thread.NORM_PRIORITY);//5
	   t.setPriority(Thread.MAX_PRIORITY);//10
	   
	   m.start();//start()�޼ҵ带 ���� run()����
	   //m2.start();//�����߻�: m2�� �����尡 �ƴ� Runnable��ü�̱� ���� 
	   t.start();//My2Ŭ������ run()����
	   
	   //m.run();//---->�Ϲݸ޼ҵ� ����� ����
	   //m2.run();//---->�Ϲݸ޼ҵ� ����� ����
	   
   }
}



