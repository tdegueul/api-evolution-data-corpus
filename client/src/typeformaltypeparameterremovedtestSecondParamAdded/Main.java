package typeformaltypeparameterremovedtestSecondParamAdded;

import testing_lib.typeformaltypeparameterremovedtestSecondParamAdded.*;

public class Main extends A<String, Integer> {
	public static void main(String[] args) {
		A<String, Integer> a = new A<String, Integer>();
	/*V1:
public class A<T, U> {}*/
	/*V2:
public class A<T> {}*/
	}
}
