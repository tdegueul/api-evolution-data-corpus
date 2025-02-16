package fieldtypechangedtestSupertypeApi;

import testing_lib.fieldtypechangedtestSupertypeApi.*;

public class Main {
	public static void main(String[] args) {
		J j = new A().f;
	/*V1:

public interface I {}
public interface J extends I {}
public class A {
	public J f;
}*/
	/*V2:

public interface I {}
public interface J extends I {}
public class A {
	public I f;
}*/
	}
}
