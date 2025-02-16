package typeformaltypeparameterchangedtestBoundChangedFromGenericWildcardSuper;

import testing_lib.typeformaltypeparameterchangedtestBoundChangedFromGenericWildcardSuper.*;

import java.util.List;

public class Main extends A<List<Integer>> {
	public static void main(String[] args) {
		A<List<Integer>> a = new A<List<Integer>>();
	/*V1:
public class A<T extends java.util.List<?>> {}*/
	/*V2:
public class A<T extends java.util.List<? super CharSequence>> {}*/
	}
}
