package constructorremovedtestClassExplicitConstructorNowDefault;

import testing_lib.constructorremovedtestClassExplicitConstructorNowDefault.*;

public class Main extends A {
	public Main() {
		super();
	}

	public static void main(String[] args) {
		A a = new A();
	/*V1:

public class A {
	public A() {}
}*/
	/*V2:
public class A {}*/
	}
}
