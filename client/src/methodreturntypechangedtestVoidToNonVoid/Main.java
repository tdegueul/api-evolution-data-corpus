package methodreturntypechangedtestVoidToNonVoid;

import testing_lib.methodreturntypechangedtestVoidToNonVoid.*;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main extends A {
	@Override public void m() {
		super.m();
	}

	public static void main(String[] args) {
		new A().m();
		Consumer<A> f1 = A::m;
	/*V1:

public class A {
	public void m() {}
}*/
	/*V2:

public class A {
	public int m() { return 0; }
}*/
	}
}
