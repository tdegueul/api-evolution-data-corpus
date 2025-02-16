package fieldtypechangedtestIncompatibleApi;

import testing_lib.fieldtypechangedtestIncompatibleApi.*;

public class Main {
	public static void main(String[] args) {
		I i = new A().f;
	/*V1:

public interface I {}
public interface J {}
public class A {
	public I f;
}*/
	/*V2:

public interface I {}
public interface J {}
public class A {
	public J f;
}*/
	}
}
