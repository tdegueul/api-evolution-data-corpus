package constructorremovedtestClassConstructorNowProtected;

import testing_lib.constructorremovedtestClassConstructorNowProtected.*;

public class Main {
	public static void main(String[] args) {
		A a = new A(0);
	/*V1:

public class A {
	public A(int i) {}
}*/
	/*V2:

public class A {
	protected A(int i) {}
}*/
	}
}
