package methodremovedtestOverriddenMethodRemovedFromSubclass;

import testing_lib.methodremovedtestOverriddenMethodRemovedFromSubclass.*;

public class Main extends B {
	@Override public void m1() {

	}

	public static void main(String[] args) {
		new A().m1();
		new B().m1();
	/*V1:

public class A {
    public void m1() {}
}
public class B extends A {
    public void m1() {}
}*/
	/*V2:

public class A {
    public void m1() {}
}
public class B extends A {}*/
	}
}
