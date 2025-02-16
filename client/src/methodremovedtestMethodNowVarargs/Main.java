package methodremovedtestMethodNowVarargs;

import testing_lib.methodremovedtestMethodNowVarargs.*;

public class Main extends A {
	@Override public void m(String s, int i) {
		super.m(s, i);
	}

	public static void main(String[] args) {
		new A().m("", 1);

	/*V1:

public class A {
    public void m(String s, int i) {}
}*/
	/*V2:

public class A {
    public void m(String s, int... i) {}
}*/
	}
}
