package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream("ms949.txt"), "MS949");

			int data = -1;
			while ((data = isr.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:" + e);
		} catch (UnsupportedEncodingException e) {
			System.out.println("UnsupportedEncodingException:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
