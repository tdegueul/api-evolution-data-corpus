package supertyperemovedtestPublicSuperclassRemoved;

import testing_lib.supertyperemovedtestPublicSuperclassRemoved.*;

public class Main {
	public static void main(String[] args) {
		A a = new B();
	/*V1:

public class A {}
public class B extends A {}*/
	/*V2:

public class A {}
public class B {}*/
	}
}
