package typeformaltypeparameterchangedtestBoundModifiedCompatible;

import testing_lib.typeformaltypeparameterchangedtestBoundModifiedCompatible.*;

public class Main extends A<String> {
	public static void main(String[] args) {
		A<String> a = new A<String>();
	/*V1:
public class A<T extends String> {}*/
	/*V2:
public class A<T extends CharSequence> {}*/
	}
}
