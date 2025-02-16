package constructorremovedtestClassConstructorChanged;

import testing_lib.constructorremovedtestClassConstructorChanged.*;

public class Main extends A {
	public Main(int i) {
		super(i);
	}

	public static void main(String[] args) {
		A a1 = new A(0);
		A a2 = new A('a');
		byte b = 127;
		A a4 = new A(b);
	/*V1:

public class A {
	public A(int i) {}
}*/
	/*V2:

public class A {
	public A(float f) {}
}*/
	}
}
