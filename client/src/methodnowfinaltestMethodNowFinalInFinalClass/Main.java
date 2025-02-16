package methodnowfinaltestMethodNowFinalInFinalClass;

import testing_lib.methodnowfinaltestMethodNowFinalInFinalClass.*;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.m();
	/*V1:

public final class A {
	public void m() {}
}*/
	/*V2:

public final class A {
	public final void m() {}
}*/
	}
}
