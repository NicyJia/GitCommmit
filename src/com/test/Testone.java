package com.test;
import java.util.Timer;
import java.util.TimerTask;
/**
 * 简单定时器
 * @author Administrator
 *
 */
public class Testone {
	public static void main(String[] args) {
		Timer timer = new Timer();
		//创建任务
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("开始定时任务...");
			}
		};
		//定时器,5秒后执行
		//timer.schedule(task, 5000);
		//定时器，两秒后执行，每三秒执行一次
		timer.schedule(task, 2000, 3000);
		
	}
}
