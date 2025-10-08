package com.ispan.tutor;

import java.util.Timer;
import java.util.TimerTask;

public class Brad70 {
	public static void main(String[] args) {
		System.out.println("start");
		Timer timer = new Timer();
		timer.schedule(new MyTask(), 0, 1*1000);
		//timer.schedule(new StopTask(timer), 10*1000);
		System.out.println("finish");
	}
}

class MyTask extends TimerTask {
	private int i;
	@Override
	public void run() {
		System.out.println(i++);
		if (i == 4) cancel();
	}
}

class StopTask extends TimerTask {
	private Timer timer;
	StopTask(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();
		timer.purge();
		timer = null;
	}
}



