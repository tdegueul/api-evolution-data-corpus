package methodformaltypeparameterremovedtestSecondParamRemoved;

import testing_lib.methodformaltypeparameterremovedtestSecondParamRemoved.*;

import java.util.function.Consumer;

public class Main extends A {
	@Override public <T, U> void m() {

	}

	public static void main(String[] args) {
		new A().<String, Integer>m();
		Consumer<A> f = A::<String, Integer>m;
	/*V1:

public class A {
	public <T, U> void m() {}
}*/
	/*V2:

public class A {
	public <T> void m() {}
}*/
	}
}
