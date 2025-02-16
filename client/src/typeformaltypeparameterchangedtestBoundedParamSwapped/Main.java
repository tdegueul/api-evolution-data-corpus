package typeformaltypeparameterchangedtestBoundedParamSwapped;

import testing_lib.typeformaltypeparameterchangedtestBoundedParamSwapped.*;

public class Main extends A<String, CharSequence>{
	public static void main(String[] args) {
		A<String, CharSequence> a = new A<String, CharSequence>();
	/*V1:
public class A<T extends String, U extends CharSequence> {}*/
	/*V2:
public class A<U extends CharSequence, T extends String> {}*/
	}
}
