package methodreturntypechangedtestSubtypeApi;

import testing_lib.methodreturntypechangedtestSubtypeApi.*;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main extends A {
	@Override public I m() {
		return super.m();
	}

	public static void main(String[] args) {
		new A().m();
		Consumer<A> f = A::m;
		Function<A, I> f2 = A::m;
	/*V1:

public interface I {}
public interface J extends I {}
public class A {
	public I m() { return null; }
}*/
	/*V2:

public interface I {}
public interface J extends I {}
public class A {
	public J m() { return null; }
}*/
	}
}
