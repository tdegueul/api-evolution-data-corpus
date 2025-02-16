package methodreturntypechangedtestSubtypeTypeParameter;

import testing_lib.methodreturntypechangedtestSubtypeTypeParameter.*;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main extends A<CharSequence, String> {
	@Override public CharSequence m() {
		return super.m();
	}

	public static void main(String[] args) {
		CharSequence cs = new A<CharSequence, String>().m();
		Consumer<A> f1 = A::m;
		Function<A, CharSequence> f2 = A<CharSequence, String>::m;
	/*V1:

public class A<T, U extends T> {
	public T m() { return null; }
}*/
	/*V2:

public class A<T, U extends T> {
	public U m() { return null; }
}*/
	}
}
