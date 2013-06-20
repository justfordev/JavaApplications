package cn.java.base.ch15.nio.buffer;

import java.nio.ByteBuffer;

public class ByteBufferTest {

	public static void main(String[] args) {
		/**
		 * ����XxxBuffer�ķ�����allocate(int capacity);
		 */
		ByteBuffer bbuf = ByteBuffer.allocate(20);
		
		/**
		 * ��ȡ��buffer�ļ������ԣ�capacity(����)��position(��ǰλ��)��limit(����λ)��remaining(ʣ������);
		 */
		System.out.println("capacity: " + bbuf.capacity());
		System.out.println("position: " + bbuf.position());
		System.out.println("limit: " + bbuf.limit());
		System.out.println("remaining: " + bbuf.remaining());
		System.out.println("arrayOffset: " + bbuf.arrayOffset());
		
		byte[] b1 = new byte[]{2,3};
		byte[] b2 = new byte[]{1,2,3,4,5,6,7,8,9};
		
		/**
		 * ���Ԫ��
		 */
		bbuf.put((byte) 1);
		bbuf.put(b1);
		bbuf.put(5, (byte)6);
		bbuf.put(b2, 3, 2);
		// �޸ĵ�ǰλ�ã�����֮ǰ�Ѿ���������ֽ�
		bbuf.position(6);
		bbuf.putChar('a');
		bbuf.putChar(10, 'c');
		bbuf.putChar(8, 'b');
		bbuf.position(12);
		bbuf.putChar('��');
		
		
		System.out.println("before flip:");
		System.out.println("capacity: " + bbuf.capacity());
		System.out.println("position: " + bbuf.position());
		System.out.println("limit: " + bbuf.limit());
		System.out.println("remaining: " + bbuf.remaining());

		bbuf.flip();
		
		System.out.println("after flip:");
		System.out.println("capacity: " + bbuf.capacity());
		System.out.println("position: " + bbuf.position());
		System.out.println("limit: " + bbuf.limit());
		System.out.println("remaining: " + bbuf.remaining());

		System.out.println("data in buffer:");
		while(bbuf.position()<bbuf.limit()) {
			System.out.println(bbuf.get());
		}
		System.out.println(bbuf.getChar(12));
		
		bbuf.clear();
		
		System.out.println("after clear:");
		System.out.println("capacity: " + bbuf.capacity());
		System.out.println("position: " + bbuf.position());
		System.out.println("limit: " + bbuf.limit());
		System.out.println("remaining: " + bbuf.remaining());
		System.out.println(bbuf.getChar(12));
	}

}
