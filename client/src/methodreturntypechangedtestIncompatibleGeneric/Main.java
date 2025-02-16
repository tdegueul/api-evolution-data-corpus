package methodreturntypechangedtestIncompatibleGeneric;

import testing_lib.methodreturntypechangedtestIncompatibleGeneric.*;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> l = new A().m();
	/*V1:

public class A {
	public java.util.List<Integer> m() { return null; }
}*/
	/*V2:

public class A {
	public java.util.List<String> m() { return null; }
}*/
	}
}
