package fieldtypechangedtestSupertypeGeneric;

import testing_lib.fieldtypechangedtestSupertypeGeneric.*;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<J> l = new A().f;
	/*V1:

public interface I {}
public interface J extends I {}
public class A {
	public java.util.List<J> f;
}*/
	/*V2:

public interface I {}
public interface J extends I {}
public class A {
	public java.util.List<I> f;
}*/
	}
}
