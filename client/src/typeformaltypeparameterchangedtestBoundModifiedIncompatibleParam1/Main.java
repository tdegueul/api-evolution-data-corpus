package typeformaltypeparameterchangedtestBoundModifiedIncompatibleParam1;

import testing_lib.typeformaltypeparameterchangedtestBoundModifiedIncompatibleParam1.*;

public class Main extends A<String, StringBuffer, String> {
	public static void main(String[] args) {
		A<String, StringBuffer, String> a = new A<String, StringBuffer, String>();
	/*V1:
public class A<T extends String, U extends CharSequence, V extends T> {}*/
	/*V2:
public class A<T extends String, U extends CharSequence, V extends U> {}*/
	}
}
