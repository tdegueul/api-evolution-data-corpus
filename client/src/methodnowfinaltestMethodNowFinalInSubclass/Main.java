package methodnowfinaltestMethodNowFinalInSubclass;

import testing_lib.methodnowfinaltestMethodNowFinalInSubclass.*;

public class Main extends B {
	@Override public void m() {
		super.m();
	}

	public static void main(String[] args) {

	/*V1:

public class A {
	void m() {}
}
public class B extends A {
	public void m() {}
}*/
	/*V2:

public class A {
	void m() {}
}
public class B extends A {
	public final void m() {}
}*/
	}
}
