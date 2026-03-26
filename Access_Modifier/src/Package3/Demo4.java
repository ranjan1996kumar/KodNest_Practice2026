package Package3;

import Package1.Demo1;

public class Demo4 {
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		
		System.out.println(d1.a);
//		System.out.println(d1.b); we cannot access
//		System.out.println(d1.c); id default or package access only access within the particular package. Object creation is never happen.
//		System.out.println(d1.d);
	}
}
