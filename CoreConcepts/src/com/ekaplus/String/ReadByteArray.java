package com.ekaplus.String;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadByteArray {

	 

	 
	    public static void main(String a[]) throws InterruptedException{
	         
	        String str = "converting to input stream"+
	                        "\n and this is second line";
	        
	        
	        byte[] content = str.getBytes();
	        InputStream is = null;
	        BufferedReader bfReader = null;
	        try {
	            is = new ByteArrayInputStream(content);
	            bfReader = new BufferedReader(new InputStreamReader(is));
	            String temp = null;
	            while((temp = bfReader.readLine()) != null){
	                System.out.println(temp);
	            }
	           /* String aaa="";
	            aaa=null;
	           */ System.gc();
	            System.in.wait();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try{
	                if(is != null) is.close();
	            } catch (Exception ex){
	                 
	            }
	        }
	         
	    }
	}

