package com.ispan.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad56 {
	public static void main(String[] args) {
		Brad563 obj = new Brad563();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/brad563"));
			oout.writeObject(obj);
			oout.close();
			System.out.println("Save OK");
			System.out.println("----");
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/brad563"));
			oin.readObject();
			oin.close();
			System.out.println("Load OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class Brad561  {
	Brad561(){
		System.out.println("Brad561()");
	}
}
class Brad562 extends Brad561{
	Brad562(){System.out.println("Brad562()");}
}
class Brad563 extends Brad562  implements Serializable{
	Brad563(){System.out.println("Brad563()");}
}
