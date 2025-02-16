package methodreturntypechangedtestIncompatibleApi;

import testing_lib.methodreturntypechangedtestIncompatibleApi.*;

public class Main {
	public static void main(String[] args) {
		I i = new A().m();
	/*V1:

public interface I {}
public interface J {}
public class A {
	public I m() { return null; }
}*/
	/*V2:

public interface I {}
public interface J {}
public class A {
	public J m() { return null; }
}*/
	}
}
