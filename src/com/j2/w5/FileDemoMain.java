
/*
* @author sbk
* @since 160404
* demo how to user file decorator
* 
*/

package com.j2.w5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader;

public class FileDemoMain{
  public static void main(String[] args) throws Exception{
    int i;
    char c;
    File readme=null;
    InputStream isReadme = null;
    InputStreamReader isrReadme = null;
    BufferedReader brReadme=null;
    String str;
    StringBuffer sbuffer = new StringBuffer();
    try{
     File myhome = new File(System.getProperty("user.home"));
     System.out.println("my home is "+myhome);
     
     String cwd=new File(".").getCanonicalPath();
     System.out.println("cwd is "+cwd);
     
     readme = new File(cwd,"HelloWorld.java");
     System.out.println("readme is "+readme);
     
     isReadme=new FileInputStream(readme);
     System.out.println("Characters printed:");
     
     isReadme = new FileInputStream(readme);
     while((i=isReadme.read()) !=1){
       c=(char)i;
       System.out.print(c);
     }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      if(isReadme != null)
        isReadme.close();
    }
    try{
            isReadme=new FileInputStream(readme);
            isrReadme=new InputStreamReader(isReadme,"UTF8");
            brReadme= new BufferedReader(isrReadme);
            /*while((i=brReadme.read())!=-1) {
                c=(char)i;
                //System.out.println(c);
                sbuffer.append(c);
            }
            System.out.println("--"+sbuffer.toString());*/
            while((str=brReadme.readLine())!=null) {
                System.out.println("--"+str);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(brReadme != null)
                brReadme.close();
        }
  }
}