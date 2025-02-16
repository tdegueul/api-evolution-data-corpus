package supertyperemovedtestPrivateInterfaceRemovedIndirect;

import testing_lib.supertyperemovedtestPrivateInterfaceRemovedIndirect.*;

public class Main {
	public static void main(String[] args) {
		// Cannot reference A
		B b1 = new B();
		B b2 = new C();
		C c = new C();
	/*V1:

interface A {}
public class B implements A {}
public class C extends B {}*/
	/*V2:

interface A {}
public class B {}
public class C extends B {}*/
	}
}
