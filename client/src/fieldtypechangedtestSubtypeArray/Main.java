package fieldtypechangedtestSubtypeArray;

import testing_lib.fieldtypechangedtestSubtypeArray.*;

import java.io.InputStream;

public class Main {
	public static void main(String[] args) {
		InputStream[] i = new A().f;
	/*V1:

public class A {
	public java.io.InputStream[] f;
}*/
	/*V2:

public class A {
	public java.io.FileInputStream[] f;
}*/
	}
}
