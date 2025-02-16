package methodformaltypeparameteraddedtestFirstParamAdded;

import testing_lib.methodformaltypeparameteraddedtestFirstParamAdded.*;

import java.util.function.Consumer;

public class Main extends A {
	@Override public void m() {

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
	public <T> void m() {}
}*/
	}
}
