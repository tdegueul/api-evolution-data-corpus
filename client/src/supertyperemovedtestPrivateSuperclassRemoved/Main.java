package supertyperemovedtestPrivateSuperclassRemoved;

import testing_lib.supertyperemovedtestPrivateSuperclassRemoved.*;

public class Main {
	public static void main(String[] args) {
		// Cannot reference A
		B b = new B();
	/*V1:

class A {}
public class B extends A {}*/
	/*V2:

class A {}
public class B {}*/
	}
}
