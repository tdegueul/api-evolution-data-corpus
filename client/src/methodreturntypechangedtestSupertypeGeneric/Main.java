package methodreturntypechangedtestSupertypeGeneric;

import testing_lib.methodreturntypechangedtestSupertypeGeneric.*;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main extends A {
	@Override public List<J> m() {
		return super.m();
	}

	public static void main(String[] args) {
		List<J> l = new A().m();
		Consumer<A> f1 = A::m;
		Function<A, List<J>> f2 = A::m;
	/*V1:

public interface I {}
public interface J extends I {}
public class A {
	public java.util.List<J> m() { return null; }
}*/
	/*V2:

public interface I {}
public interface J extends I {}
public class A {
	public java.util.List<I> m() { return null; }
}*/
	}
}
