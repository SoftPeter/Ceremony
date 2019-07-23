package C11_CollectionFramework;

import java.util.*;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();
		System.out.println();
		print(v);
		
		v.ensureCapacity(6);
		System.out.println();
		print(v);
		
		v.setSize(7);
		System.out.println();
		print(v);
		
		v.clear();
		System.out.println();
		print(v);
	}

	private static void print(Vector v) {
		// TODO Auto-generated method stub
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
	}
}
