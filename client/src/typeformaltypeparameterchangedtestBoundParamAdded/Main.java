package typeformaltypeparameterchangedtestBoundParamAdded;

import testing_lib.typeformaltypeparameterchangedtestBoundParamAdded.*;

public class Main extends A<String, Number> {
	public static void main(String[] args) {
		A<String, Number> a = new A<String, Number>();
	/*V1:
public class A<T, U> {}*/
	/*V2:
public class A<T, U extends T> {}*/
	}
}
