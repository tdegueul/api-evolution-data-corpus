package methodnolongervarargstestConstructorOverloadedVarargs;

import testing_lib.methodnolongervarargstestConstructorOverloadedVarargs.*;

public class Main {
	public static void main(String[] args) {
		// No change
		new A("");
		new A("", "");
	/*V1:

public class A {
	public A(String s) {}
	public A(String... s) {}
}*/
	/*V2:

public class A {
	public A(String s) {}
	public A(String... s) {}
}*/
	}
}
