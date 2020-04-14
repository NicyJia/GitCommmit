package com.test;

/**
 * 结果线程一直处于阻塞状态
 */
import java.util.concurrent.atomic.AtomicLong;

public class Test {

	static AtomicLong i = new AtomicLong();
	// 创建线程
	static Thread t = new Thread(() -> {
		i.getAndIncrement();
		System.out.println("test");
	}, "测试");
	// 静态代码块
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
		;
	}
}
