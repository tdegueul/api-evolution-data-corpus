package fieldtypechangedtestIncompatibleGeneric;

import testing_lib.fieldtypechangedtestIncompatibleGeneric.*;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> l = new A().f;
	/*V1:

public class A {
	public java.util.List<Integer> f;
}*/
	/*V2:

public class A {
	public java.util.List<String> f;
}*/
	}
}
