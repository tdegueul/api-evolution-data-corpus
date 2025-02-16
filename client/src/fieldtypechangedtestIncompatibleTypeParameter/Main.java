package fieldtypechangedtestIncompatibleTypeParameter;

import testing_lib.fieldtypechangedtestIncompatibleTypeParameter.*;

public class Main {
	public static void main(String[] args) {
		Integer i = new A<Integer, String>().f;
	/*V1:

public class A<T, U> {
	public T f;
}*/
	/*V2:

public class A<T, U> {
	public U f;
}*/
	}
}
