package supertyperemovedtestPublicSuperclassRemovedIndirect;

import testing_lib.supertyperemovedtestPublicSuperclassRemovedIndirect.*;

public class Main {
	public static void main(String[] args) {
		A a = new C();
	/*V1:

public class A {}
class B extends A {}
public class C extends B {}*/
	/*V2:

public class A {}
class B {}
public class C extends B {}*/
	}
}
