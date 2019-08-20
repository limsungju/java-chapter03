package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			// 기반 스트림(소스에 연결)
			FileOutputStream fos = new FileOutputStream("test.txt");
			// 보조스트림(기반 스트림에 연결)
			bos = new BufferedOutputStream(fos);
			// 한줄로 작성
			//bos = new BufferedOutputStream(new FileOutputStream("test.txt"));
			
			// ASCII코드이기 때문에 가능
			for(int i='a'; i<='z'; i++) {
				bos.write(i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:" + e);
		}catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
