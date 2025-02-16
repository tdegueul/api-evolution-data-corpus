package fieldtypechangedtestSubtypeGeneric;

import testing_lib.fieldtypechangedtestSubtypeGeneric.*;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<I> l = new A().f;
	/*V1:

public interface I {}
public interface J extends I {}
public class A {
	public java.util.List<I> f;
}*/
	/*V2:

public interface I {}
public interface J extends I {}
public class A {
	public java.util.List<J> f;
}*/
	}
}
