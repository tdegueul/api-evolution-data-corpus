package constructorremovedtestClassConstructorNowProtectedDefault;

import testing_lib.constructorremovedtestClassConstructorNowProtectedDefault.*;

public class Main {
	public static void main(String[] args) {
		A a = new A();
	/*V1:
public class A {}*/
	/*V2:

public class A {
	protected A() {}
}*/
	}
}
