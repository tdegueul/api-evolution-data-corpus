package methodreturntypechangedtestSubtypeJdk;

import testing_lib.methodreturntypechangedtestSubtypeJdk.*;

import java.io.InputStream;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main extends A {
	@Override public InputStream m() {
		return super.m();
	}

	public static void main(String[] args) {
		InputStream i = new A().m();
		Consumer<A> f1 = A::m;
		Function<A, InputStream> f2 = A::m;
	/*V1:

public class A {
	public java.io.InputStream m() { return null; }
}*/
	/*V2:

public class A {
	public java.io.FileInputStream m() { return null; }
}*/
	}
}
