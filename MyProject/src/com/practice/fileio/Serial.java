package com.practice.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serial {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		
		StudentStream s3 = new StudentStream("science",90);
		Student s1 = new Student("Rahul", 20, s3);
		FileOutputStream fs = new FileOutputStream("C:/Text");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(s1);
		os.flush();
		os.close();
			
		FileInputStream fin = new FileInputStream("C:/Text");
		ObjectInputStream ois = new ObjectInputStream(fin);
		Student s2 = (Student)ois.readObject();
		//System.out.println(s2.name +" "+ s2.no +" "+ s2.getStream().getSeq()+" "+s2.getStream().getStream());
		ois.close();
		
	}

}
