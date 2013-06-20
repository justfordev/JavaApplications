package cn.java.base.ch09;

import java.util.Scanner;

public class Demo01 {
	
	public static int sortUnit(int[] array, int low, int high) {
		int key = array[low];
		while(high > low) {
			while(array[high] >= key && high > low) --high;
			array[low] = array[high];
			while(array[low] <=key && low < high) ++low;
			array[high] = array[low];
		}
		array[high] = key;
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		return high;
	}
	
	public static void sort(int[] array, int low, int high) {
		if(low == high) {
			return;
		}
		int index = sortUnit(array, low, high);
		System.out.println("low : " + low + "high : " + high + "index : " + index);
		if(index > low) sort(array, low, index-1);
		if(index < high) sort(array, index+1, high);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = input.nextInt();
		int[] data = new int[total];
		for(int i=0; i<total; i++) {
			data[i] = input.nextInt();
		}
		sort(data, 0, total - 1);
		int index = total/2;
		System.out.println(data[index]);
		input.close();
	}
	
}
