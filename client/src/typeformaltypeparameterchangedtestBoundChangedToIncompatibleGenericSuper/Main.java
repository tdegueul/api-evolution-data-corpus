package typeformaltypeparameterchangedtestBoundChangedToIncompatibleGenericSuper;

import testing_lib.typeformaltypeparameterchangedtestBoundChangedToIncompatibleGenericSuper.*;

import java.util.List;

public class Main extends A<List<String>>  {
	public static void main(String[] args) {
		A<List<String>> a = new A<List<String>>();
	/*V1:
public class A<T extends java.util.List<? super String>> {}*/
	/*V2:
public class A<T extends java.util.List<? super CharSequence>> {}*/
	}
}
