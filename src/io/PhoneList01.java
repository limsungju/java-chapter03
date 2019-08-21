package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("phone.txt");
			if(file.exists() == false) {
				System.out.println("File Not Found");
				return;
			}
			
			System.out.println("=========파일정보==========");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
			
			System.out.println("=========전화번호=========");
			
			// 기반 스트림
			FileInputStream fis = new FileInputStream(file);
			
			// 보조 스트림1(bytes -> char)
			InputStreamReader isr = new InputStreamReader(fis);
			
			// 보조 스트림2(chars\n -> String)
			br = new BufferedReader(isr);
			
			// read
			String line = null;
			while((line = br.readLine()) != null) {
				// 구분할 문자를 StringTokenizer에 입력 (탭, 스페이스바를 넣어준상태)
				StringTokenizer st = new StringTokenizer(line, "\t ");
				int index = 0;
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token);
					if(index == 0) { // 이름
						System.out.print(":");
					} else if(index == 1) { // 번호1
						System.out.print("-");
					} else if(index == 2) { // 번호2
						System.out.print("-");
					}
					
					index++;
				}
				System.out.println();
				
				//System.out.println(line);
				
			}
			
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
