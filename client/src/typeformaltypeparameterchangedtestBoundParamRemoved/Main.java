package typeformaltypeparameterchangedtestBoundParamRemoved;

import testing_lib.typeformaltypeparameterchangedtestBoundParamRemoved.*;

public class Main extends A<String, CharSequence> {
	public static void main(String[] args) {
		A<String, CharSequence> a = new A<String, CharSequence>();
	/*V1:
public class A<T extends U, U> {}*/
	/*V2:
public class A<T, U> {}*/
	}
}
