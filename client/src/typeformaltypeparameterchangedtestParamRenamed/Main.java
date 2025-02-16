package typeformaltypeparameterchangedtestParamRenamed;

import testing_lib.typeformaltypeparameterchangedtestParamRenamed.*;

public class Main extends A<Integer> {
	public static void main(String[] args) {
		A<Integer> a = new A<Integer>();
	/*V1:
public class A<T> {}*/
	/*V2:
public class A<U> {}*/
	}
}
