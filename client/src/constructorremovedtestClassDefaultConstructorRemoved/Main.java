package constructorremovedtestClassDefaultConstructorRemoved;

import testing_lib.constructorremovedtestClassDefaultConstructorRemoved.*;

public class Main {
	public static void main(String[] args) {
		A a = new A();
	/*V1:
public class A {}*/
	/*V2:

public class A {
	public A(int i) {}
}*/
	}
}
