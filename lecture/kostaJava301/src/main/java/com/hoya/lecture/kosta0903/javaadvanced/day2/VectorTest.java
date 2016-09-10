package com.hoya.lecture.kosta0903.javaadvanced.day2;

import java.util.Vector;

public class VectorTest {
  public static void main(String[] args) {
     String names[]=new String[3];//�迭�� ũ�� 3 ==> [0]~[2]
     //�迭(Array): ������ �ڷ����� ���� �����͸� �ϳ��� ���������� ������ �ڷ�����.
      names[0]="ȫ�浿";
      names[1]="�����";
      names[2]="���ֿ�";
      //names[3]="�̼���";
      
     for (int i = 0; i < names.length; i++) {
		System.out.println("names["+i+"]����="+ names[i]);
	 }  
     //==================================================
     Vector v = new Vector(3);
     //Array�� �������̹迭, Vector�� �������̹迭(����ġ ���� ������ �Է½� ���)
     //VectorŬ������ ��ü�� ���� ������ �����ϴ� Ŭ����!!
     /*
        String str=new String("ȫ�浿");
        Integer i = new Integer(13);
        A obj = new A();
        
        str, i ,obj ===> ��������(���۷�������)
        
        byte,short,int,long,float,double,char,boolean
   --->����Ŭ����(WrapperŬ����)
       Byte, Short, Integer, Long, Float, Double, Character, Boolean     
      */
     v.add("�浿");//�ڵ� �ε��� 0�ο�
       v.add(new Person("������",16,"ȭ��"));
     v.add("����");//�ڵ� �ε��� 1�ο�
     v.add("�ֿ�");//�ڵ� �ε��� 2�ο�
     v.add("����");//�ڵ� �ε��� 3�ο�
     v.add("����");//�ڵ� �ε��� 4�ο�
     
     v.add(new Integer(13));
     v.add(new Integer(23));
     v.add(33);
     v.add(new Double(43.56));
     v.add(3.14);
     v.add(true);

     System.out.println("---------------------------------");
     System.out.println("���ͳ��� ������(���) ����: "+ v.size());
     for(int i=0; i<v.size(); i++){
    	System.out.println(i+"�ε��� ������: "+v.get(i));
     }
     
     Object ob = v.get(1); // v.get(index)�� ��ȯ���� Object�̹Ƿ� ����!!
     Person person = (Person)ob;//�ڽ�ĳ����
     System.out.println("������ ����: "+ person.getJob());
     
     
     /*
           ���׸���� ����(JDK5)
        ----> �ڷ����� ����ؼ� �������!! (��Ἲ�� ���̱� ����)
        <E>   : Element(���)�� ������ �ڷ����� ���
        <K,V> : Key(Ű), Value(������)
        <T>   : Type(�ڷ���)
      */
     Vector<String> v2 = new Vector<String>();
        v2.add(0,"���浿");//[���浿(0)]
        v2.add(0,"���ֿ�");//[���ֿ�(0),���浿(1)]
        v2.add(0,"������");//[������(0),���ֿ�(1),���浿(2)]
        
        //v2.add(13);//�����߻� : ����� ������(String) �̿ܿ� �����͸� �Է¹��� �ʰ���.
     
     System.out.println("v2������: "+ v2);
     
     Vector<Person> v3 = new Vector<>();
     //JDK7�������� ���� ���׸� Ÿ�Ի�������
     
     Person p1 = new Person("ȫ�浿",13,"�л�");
     Person p2 = new Person("�����",15,"�л�");
     Person p3 = new Person("���ֿ�",17,"�л�");     
     
     v3.add(p1);//0�ε���
     v3.add(p2);//1�ε���
     v3.add(p3);//2�ε���
     
     Person pp = v3.get(1);//���׸��� ����ϴ� ��� ����Ÿ�Ե� ������ �ڷ����� ��ġ!!
           System.out.println("�ι�° �������: "+ pp.getName());
      
  }
}
