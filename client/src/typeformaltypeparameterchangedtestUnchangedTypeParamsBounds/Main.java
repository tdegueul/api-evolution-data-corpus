package typeformaltypeparameterchangedtestUnchangedTypeParamsBounds;

import testing_lib.typeformaltypeparameterchangedtestUnchangedTypeParamsBounds.*;

import java.util.List;

public class Main extends A<List<CharSequence>, String> {
	public static void main(String[] args) {
		// No change
		A<List<CharSequence>, String> a = new A<List<CharSequence>, String>();
	/*V1:
public class A<T extends java.util.List<? super U>, U> {}*/
	/*V2:
public class A<T extends java.util.List<? super U>, U> {}*/
	}
}
