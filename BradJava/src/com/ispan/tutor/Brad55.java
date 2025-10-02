package com.ispan.tutor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.ispan.apis.Bike;
import com.ispan.apis.Student;

public class Brad55 {
	public static void main(String[] args) {

		try(
			ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream("dir1/s1.brad"))
			){
			Object obj = oin.readObject();
			System.out.println(obj);
			Student s1 = (Student)obj;
			System.out.println(s1);
			System.out.println(s1.score());
			System.out.println(s1.avg());
			
			System.out.println("Load OK");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
