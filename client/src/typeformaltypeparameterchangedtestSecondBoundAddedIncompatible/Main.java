package typeformaltypeparameterchangedtestSecondBoundAddedIncompatible;

import testing_lib.typeformaltypeparameterchangedtestSecondBoundAddedIncompatible.*;

public class Main extends A<String> {
	public static void main(String[] args) {
		A<String> a = new A<String>();
	/*V1:
public class A<T extends String> {}*/
	/*V2:
public class A<T extends String & Runnable> {}*/
	}
}
