package methodreturntypechangedtestSupertypeApi;

import testing_lib.methodreturntypechangedtestSupertypeApi.*;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main extends A {
	@Override public J m() {
		return super.m();
	}

	public static void main(String[] args) {
		J j = new A().m();
		Consumer<A> f1 = A::m;
		Function<A, J> f2 = A::m;
	/*V1:

public interface I {}
public interface J extends I {}
public class A {
	public J m() { return null; }
}*/
	/*V2:

public interface I {}
public interface J extends I {}
public class A {
	public I m() { return null; }
}*/
	}
}
