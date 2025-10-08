package com.ispan.apis;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel{
	private Timer timer;
	private DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
	
	public MyClock() {
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				LocalTime time = LocalTime.now();
				setText(time.format(formater));
			}
		}, 0, 100);
	}
}
