package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {
		try {
			byte[] src = {0,1,2,3};
			byte[] dest = null;
			
			InputStream is = new ByteArrayInputStream(src);
			OutputStream os = new ByteArrayOutputStream();
			
			int data = -1;
			while((data = is.read()) != -1) {
				
			}
			
			dest = ((ByteArrayOutputStream)os).toByteArray();
			
			System.out.println(Arrays.toString(src));
			System.out.println(Arrays.toString(dest));
			
		}catch(IOException e) {
			System.out.println("error:" + e);
		}
		
	}
}
