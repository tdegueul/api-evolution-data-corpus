package supertyperemovedtestPrivateSuperclassRemovedIndirect;

import testing_lib.supertyperemovedtestPrivateSuperclassRemovedIndirect.*;

public class Main {
	public static void main(String[] args) {
		// Cannot reference A
		B b1 = new B();
		B b2 = new C();
		C c = new C();
	/*V1:

class A {}
public class B extends A {}
public class C extends B {}*/
	/*V2:

class A {}
public class B {}
public class C extends B {}*/
	}
}
