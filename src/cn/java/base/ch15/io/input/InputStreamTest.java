package cn.java.base.ch15.io.input;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		byte[] b = new byte[100];
		try {
			fis = new FileInputStream(new File("inputStream.txt"));
			fis.read(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		
		PipedInputStream pis = new PipedInputStream();
		BufferedInputStream bis = new BufferedInputStream(bais);
		try {
			ObjectInputStream ois = new ObjectInputStream(bais);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PushbackInputStream pbis = new PushbackInputStream(bais);
		DataInputStream dis = new DataInputStream(bais);
	}

}
