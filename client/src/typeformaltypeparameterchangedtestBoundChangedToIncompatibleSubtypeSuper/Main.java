package typeformaltypeparameterchangedtestBoundChangedToIncompatibleSubtypeSuper;

import testing_lib.typeformaltypeparameterchangedtestBoundChangedToIncompatibleSubtypeSuper.*;

import java.util.List;

public class Main extends A<List<CharSequence>> {
	public static void main(String[] args) {
		A<List<CharSequence>> a = new A<List<CharSequence>>();
	/*V1:
public class A<T extends java.util.List<? super CharSequence>> {}*/
	/*V2:
public class A<T extends java.util.ArrayList<? super String>> {}*/
	}
}
