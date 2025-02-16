package typeformaltypeparameterchangedtestBoundChangedToGenericSubtype;

import testing_lib.typeformaltypeparameterchangedtestBoundChangedToGenericSubtype.*;

import java.util.List;

public class Main extends A<List<String>> {
	public static void main(String[] args) {
		A<List<String>> a = new A<List<String>>();
	/*V1:
public class A<T extends java.util.List<? extends String>> {}*/
	/*V2:
public class A<T extends java.util.ArrayList<? extends CharSequence>> {}*/
	}
}
