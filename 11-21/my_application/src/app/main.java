package app;

import pack1.A;
import pack2.B;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pack1 -> A.java -> method() 실행 -> A-method 출력
		A a = new A(); // 파일 import
		a.method();
		// pack2 -> B.java -> method() 실행 -> B-method 출력
		B b = new B();
		b.method();
	}

}
