package typeformaltypeparameterchangedtestBoundGenericWildcardToType;

import testing_lib.typeformaltypeparameterchangedtestBoundGenericWildcardToType.*;

import java.util.List;

public class Main extends A<List<String>> {
	public static void main(String[] args) {
		A<List<String>> a = new A<List<String>>();
	/*V1:
public class A<T extends java.util.List<? extends CharSequence>> {}*/
	/*V2:
public class A<T extends java.util.List<CharSequence>> {}*/
	}
}
