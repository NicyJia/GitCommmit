package com.test;

/**
 * ����߳�һֱ��������״̬
 */
import java.util.concurrent.atomic.AtomicLong;

public class Test {

	static AtomicLong i = new AtomicLong();
	// �����߳�
	static Thread t = new Thread(() -> {
		i.getAndIncrement();
		System.out.println("test");
	}, "����");
	// ��̬�����
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
