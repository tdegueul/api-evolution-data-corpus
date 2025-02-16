package fieldtypechangedtestSupertypeArray;

import testing_lib.fieldtypechangedtestSupertypeArray.*;

import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) {
		FileInputStream[] fis = new A().f;
	/*V1:

public class A {
	public java.io.FileInputStream[] f;
}*/
	/*V2:

public class A {
	public java.io.InputStream[] f;
}*/
	}
}
