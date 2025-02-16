package typeformaltypeparameterchangedtestBoundChangedToIncompatibleTypeSuper;

import testing_lib.typeformaltypeparameterchangedtestBoundChangedToIncompatibleTypeSuper.*;

import java.util.ArrayList;

public class Main extends A<ArrayList<CharSequence>> {
	public static void main(String[] args) {
		A<ArrayList<CharSequence>> a = new A<ArrayList<CharSequence>>();
	/*V1:
public class A<T extends java.util.ArrayList<? super CharSequence>> {}*/
	/*V2:
public class A<T extends java.util.List<? super String>> {}*/
	}
}
