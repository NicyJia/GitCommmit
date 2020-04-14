package com.test;

import java.util.concurrent.atomic.AtomicLong;
/**
 * 换一种方式 又不阻塞了
 * @author Administrator
 *
 */
public class Tetst1 {
	static AtomicLong i = new AtomicLong();
	static Thread t = new Thread(i::getAndIncrement);
	static {
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("get");
	}
}
