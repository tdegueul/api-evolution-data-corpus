package constructorremovedtestOverloadedConstructorRemoved;

import testing_lib.constructorremovedtestOverloadedConstructorRemoved.*;

public class Main extends A {
	public Main() {
		super(1e9f);
	}
	public static void main(String[] args) {
		float f = 2;
		A a = new A(f);
	/*V1:

public class A {
	public A(int i) {}
	public A(float f) {}
}*/
	/*V2:

public class A {
	public A(int i) {}
}*/
	}
}
