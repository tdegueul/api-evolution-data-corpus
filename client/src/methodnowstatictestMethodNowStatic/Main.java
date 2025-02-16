package methodnowstatictestMethodNowStatic;

import testing_lib.methodnowstatictestMethodNowStatic.*;

import java.util.function.Consumer;

public class Main extends A {
	@Override public void m() {
		super.m();
	}

	public static void main(String[] args) {
		new A().m();
		Consumer<A> f = A::m;
	/*V1:

public class A {
	public void m() {}
}*/
	/*V2:

public class A {
	public static void m() {}
}*/
	}
}
