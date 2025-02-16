package methodnowfinaltestMethodNowFinalInEffectivelyFinalClass;

import testing_lib.methodnowfinaltestMethodNowFinalInEffectivelyFinalClass.*;

public class Main {
	public static void main(String[] args) {
		A a = null;
		a.m();
		new Main();
	/*V1:

public class A {
	private A() {}
	public void m() {}
}*/
	/*V2:

public class A {
	private A() {}
	public final void m() {}
}*/
	}
}
