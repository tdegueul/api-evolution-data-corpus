package methodformaltypeparameterremovedtestFirstParamRemoved;

import testing_lib.methodformaltypeparameterremovedtestFirstParamRemoved.*;

import java.util.function.Consumer;

public class Main extends A {
	@Override public <T> void m() {

	}

	public static void main(String[] args) {
		new A().<String>m();
		Consumer<A> f = A::<String>m;
	/*V1:

public class A {
	public <T> void m() {}
}*/
	/*V2:

public class A {
	public void m() {}
}*/
	}
}
