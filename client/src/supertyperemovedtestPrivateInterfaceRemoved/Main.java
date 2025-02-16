package supertyperemovedtestPrivateInterfaceRemoved;

import testing_lib.supertyperemovedtestPrivateInterfaceRemoved.*;

public class Main {
	public static void main(String[] args) {
		// Cannot reference A
		new B();
	/*V1:

interface A {}
public class B implements A {}*/
	/*V2:

interface A {}
public class B {}*/
	}
}
