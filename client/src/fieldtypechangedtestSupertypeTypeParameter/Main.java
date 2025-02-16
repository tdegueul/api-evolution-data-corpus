package fieldtypechangedtestSupertypeTypeParameter;

import testing_lib.fieldtypechangedtestSupertypeTypeParameter.*;

public class Main {
	public static void main(String[] args) {
		String s = new A<CharSequence, String>().f;
	/*V1:

public class A<T, U extends T> {
	public U f;
}*/
	/*V2:

public class A<T, U extends T> {
	public T f;
}*/
	}
}
