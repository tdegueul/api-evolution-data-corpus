package methodremovedtestStaticMethodRemoved;

import testing_lib.methodremovedtestStaticMethodRemoved.*;

public class Main {
	public static void main(String[] args) {
		A.m1();
	/*V1:

public class A {
    public static void m1() {}
}*/
	/*V2:
public class A {}*/
	}
}
