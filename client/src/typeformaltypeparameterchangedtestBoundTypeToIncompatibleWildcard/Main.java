package typeformaltypeparameterchangedtestBoundTypeToIncompatibleWildcard;

import testing_lib.typeformaltypeparameterchangedtestBoundTypeToIncompatibleWildcard.*;

import java.util.List;

public class Main extends A<List<CharSequence>> {
	public static void main(String[] args) {
		A<List<CharSequence>> a = new A<List<CharSequence>>();
	/*V1:
public class A<T extends java.util.List<CharSequence>> {}*/
	/*V2:
public class A<T extends java.util.List<? extends String>> {}*/
	}
}
