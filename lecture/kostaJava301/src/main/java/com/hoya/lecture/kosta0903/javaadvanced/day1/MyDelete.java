package com.hoya.lecture.kosta0903.javaadvanced.day1;

import java.io.File;

public class MyDelete {
    public void delete(String path, String name){
    	//JavaApp/a/b/cd
    	File f = new File(path);	
    	File parentF=null;
    	
        while(true){
    	  parentF = f.getParentFile();  
    	  System.out.println("pf:"+ parentF.getName());
          f.delete();
          if(parentF.getName().equals(name)) break;
          f=parentF;
        }
    }//delete
}
