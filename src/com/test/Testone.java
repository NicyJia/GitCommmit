package com.test;
import java.util.Timer;
import java.util.TimerTask;
/**
 * �򵥶�ʱ��
 * @author Administrator
 *
 */
public class Testone {
	public static void main(String[] args) {
		Timer timer = new Timer();
		//��������
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("��ʼ��ʱ����...");
			}
		};
		//��ʱ��,5���ִ��
		//timer.schedule(task, 5000);
		//��ʱ���������ִ�У�ÿ����ִ��һ��
		timer.schedule(task, 2000, 3000);
		
	}
}
