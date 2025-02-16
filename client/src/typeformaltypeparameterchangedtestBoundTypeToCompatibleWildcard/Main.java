package typeformaltypeparameterchangedtestBoundTypeToCompatibleWildcard;

import testing_lib.typeformaltypeparameterchangedtestBoundTypeToCompatibleWildcard.*;

import java.util.ArrayList;

public class Main extends A<ArrayList<String>> {
	public static void main(String[] args) {
		A<ArrayList<String>> a = new A<ArrayList<String>>();
	/*V1:
public class A<T extends java.util.List<String>> {}*/
	/*V2:
public class A<T extends java.util.List<? extends String>> {}*/
	}
}
