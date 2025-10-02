package com.ispan.tutor;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.ispan.apis.Bike;
import com.ispan.apis.Student;

public class Brad54 {

	public static void main(String[] args) {
		Student s1 = new Student("Brad", 76, 34, 50);
		Bike bike = s1.getBike();
		bike.upSpeed();bike.upSpeed();bike.upSpeed();bike.upSpeed();
		System.out.println(s1);
		System.out.println(s1.getBike());
		try (
				ObjectOutputStream oout = new ObjectOutputStream(
						new FileOutputStream("dir1/s1.brad"))
				){
			
			oout.writeObject(s1);
			System.out.println("Save OK");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
