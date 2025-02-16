package fieldtypechangedtestSubtypeTypeParameter;

import testing_lib.fieldtypechangedtestSubtypeTypeParameter.*;

public class Main {
	public static void main(String[] args) {
		CharSequence cs = new A<CharSequence, String>().f;
	/*V1:

public class A<T, U extends T> {
	public T f;
}*/
	/*V2:

public class A<T, U extends T> {
	public U f;
}*/
	}
}
