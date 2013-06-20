package cn.java.base.ch17;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class DownThread extends Thread {

	private final int BUFF_LEN = 32;

	private long start;
	private long end;
	private InputStream is;
	private RandomAccessFile raf;

	public DownThread(long start, long end, InputStream is, RandomAccessFile raf) {
		System.out.println(start + " --> " + end);
		this.start = start;
		this.end = end;
		this.is = is;
		this.raf = raf;
	}

	@Override
	public void run() {
		try {
			is.skip(start);
			raf.seek(start);
			byte[] buff = new byte[BUFF_LEN];
			int hasread = 0;
			long contentLen = end - start;
			// why "+4"
			long times = (contentLen / BUFF_LEN + 4);
			for (int i = 0; i < times; i++) {
				hasread = is.read(buff);
				if (hasread < 0) {
					break;
				}
				raf.write(buff, 0, hasread);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				if (raf != null)
					raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
