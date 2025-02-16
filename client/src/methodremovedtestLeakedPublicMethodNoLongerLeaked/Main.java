package methodremovedtestLeakedPublicMethodNoLongerLeaked;

import testing_lib.methodremovedtestLeakedPublicMethodNoLongerLeaked.*;

public class Main extends B {
	@Override public void m2() {
		m1();
	}

	public static void main(String[] args) {
	/*V1:

class A {
	public void m1() {}
}
public class B extends A {
	public void m2() {}
}*/
	/*V2:

class A {
	public void m1() {}
}
public class B {
	public void m2() {}
}*/
	}
}
