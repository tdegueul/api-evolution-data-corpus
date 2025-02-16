package constructorremovedtestClassDefaultConstructorNowExplicit;

import testing_lib.constructorremovedtestClassDefaultConstructorNowExplicit.*;

public class Main extends A {
	public Main() {
		super();
	}

	public static void main(String[] args) {
		A a = new A();
	/*V1:
public class A {}*/
	/*V2:

public class A {
	public A() {}
}*/
	}
}
