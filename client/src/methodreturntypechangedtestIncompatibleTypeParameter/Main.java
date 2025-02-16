package methodreturntypechangedtestIncompatibleTypeParameter;

import testing_lib.methodreturntypechangedtestIncompatibleTypeParameter.*;

public class Main {
	public static void main(String[] args) {
		String s = new A<String, Integer>().m();
	/*V1:

public class A<T, U> {
	public T m() { return null; }
}*/
	/*V2:

public class A<T, U> {
	public U m() { return null; }
}*/
	}
}
