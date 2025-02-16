package methodreturntypechangedtestSupertypeArray;

import testing_lib.methodreturntypechangedtestSupertypeArray.*;

import java.io.FileInputStream;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main extends A {
	@Override public FileInputStream[] m() {
		return super.m();
	}

	public static void main(String[] args) {
		FileInputStream[] f = new A().m();
		Consumer<A> f1 = A::m;
		Function<A, FileInputStream[]> f2 = A::m;
	/*V1:

public class A {
	public java.io.FileInputStream[] m() { return new java.io.FileInputStream[] { null }; }
}*/
	/*V2:

public class A {
	public java.io.InputStream[] m() { return new java.io.InputStream[] { null }; }
}*/
	}
}
