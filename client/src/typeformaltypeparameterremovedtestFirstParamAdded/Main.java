package typeformaltypeparameterremovedtestFirstParamAdded;

import testing_lib.typeformaltypeparameterremovedtestFirstParamAdded.*;

public class Main extends A<String> {
	public static void main(String[] args) {
		A<String> a = new A<String>();
	/*V1:
public class A<T> {}*/
	/*V2:
public class A {}*/
	}
}
