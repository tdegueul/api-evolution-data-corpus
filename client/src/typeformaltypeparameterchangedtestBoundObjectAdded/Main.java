package typeformaltypeparameterchangedtestBoundObjectAdded;

import testing_lib.typeformaltypeparameterchangedtestBoundObjectAdded.*;

public class Main extends A<Object> {
	public static void main(String[] args) {
		A<Object> a = new A<Object>();
	/*V1:
public class A<T> {}*/
	/*V2:
public class A<T extends Object> {}*/
	}
}
