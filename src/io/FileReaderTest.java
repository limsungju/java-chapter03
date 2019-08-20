package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		InputStream is = null;
		try {
			// char단위로 읽는 코드(3바이트)
			in = new FileReader("hello.txt");
			int count = 0;
			int data = -1;
			while((data = in.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			System.out.println("count:" + count);
			System.out.println("====================");
			
			// byte단위로 읽는 코드
			count = 0;
			is = new FileInputStream("hello.txt");
			while((data = is.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			System.out.println("count:" + count);
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
