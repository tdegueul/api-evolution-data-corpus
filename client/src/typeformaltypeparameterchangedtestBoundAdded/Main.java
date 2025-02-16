package typeformaltypeparameterchangedtestBoundAdded;

import testing_lib.typeformaltypeparameterchangedtestBoundAdded.*;

public class Main extends A<Integer> {
	public static void main(String[] args) {
		A<Integer> a = new A<Integer>();
	/*V1:
public class A<T> {}*/
	/*V2:
public class A<T extends String> {}*/
	}
}
