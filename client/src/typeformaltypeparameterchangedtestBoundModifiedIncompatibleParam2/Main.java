package typeformaltypeparameterchangedtestBoundModifiedIncompatibleParam2;

import testing_lib.typeformaltypeparameterchangedtestBoundModifiedIncompatibleParam2.*;

public class Main extends A<String, CharSequence, StringBuffer> {
	public static void main(String[] args) {
		A<String, CharSequence, StringBuffer> a = new A<String, CharSequence, StringBuffer>();
	/*V1:
public class A<T extends String, U extends CharSequence, V extends U> {}*/
	/*V2:
public class A<T extends String, U extends CharSequence, V extends T> {}*/
	}
}
