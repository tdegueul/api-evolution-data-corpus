package methodnolongervarargstestMethodOverloadedVarargs;

import testing_lib.methodnolongervarargstestMethodOverloadedVarargs.*;

public class Main {
	public static void main(String[] args) {
		// No change
		new A().m("");
		new A().m("", "");
	/*V1:

public class A {
	public void m(String s) {}
	public void m(String... s) {}
}*/
	/*V2:

public class A {
	public void m(String s) {}
	public void m(String... s) {}
}*/
	}
}
