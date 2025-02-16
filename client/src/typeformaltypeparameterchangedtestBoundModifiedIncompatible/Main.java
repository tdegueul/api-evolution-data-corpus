package typeformaltypeparameterchangedtestBoundModifiedIncompatible;

import testing_lib.typeformaltypeparameterchangedtestBoundModifiedIncompatible.*;

public class Main extends A<CharSequence> {
	public static void main(String[] args) {
		A<CharSequence> a = new A<CharSequence>();
	/*V1:
public class A<T extends CharSequence> {}*/
	/*V2:
public class A<T extends String> {}*/
	}
}
