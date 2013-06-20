package cn.java.base.ch15.nio.channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = new File("fileInputStream.txt");
		try {
			fis = new FileInputStream(f);
			fos = new FileOutputStream(new File("fileOutputStream.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		FileChannel inputFileChannel = fis.getChannel();
		FileChannel outputFileChannel = fos.getChannel();
//		ByteBuffer bbuf = ByteBuffer.allocate(1024);
		try {
			MappedByteBuffer mbb = inputFileChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
			outputFileChannel.write(mbb);
			mbb.clear();
			Charset cs = Charset.forName("GBK");
			System.out.println(Charset.availableCharsets().toString());
			CharsetDecoder cd = cs.newDecoder();
			System.out.println(cd.decode(mbb));
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
				try {
					if(inputFileChannel != null) {
						inputFileChannel.close();
					}
					if(outputFileChannel != null) {
						outputFileChannel.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
