package methodreturntypechangedtestNonVoidToVoid;

import testing_lib.methodreturntypechangedtestNonVoidToVoid.*;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		Consumer<A> m = A::m;
		new A().m();
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
