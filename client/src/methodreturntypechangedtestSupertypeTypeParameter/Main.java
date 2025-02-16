package methodreturntypechangedtestSupertypeTypeParameter;

import testing_lib.methodreturntypechangedtestSupertypeTypeParameter.*;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main extends A<CharSequence, String> {
	@Override public String m() {
		return super.m();
	}

	public static void main(String[] args) {
		String s = new Main().m();
		Consumer<A> f1 = A<CharSequence, String>::m;
		Function<A, String> f2 = A<CharSequence, String>::m;
	/*V1:

public class A<T, U extends T> {
	public U m() { return null; }
}*/
	/*V2:

public class A<T, U extends T> {
	public T m() { return null; }
}*/
	}
}
