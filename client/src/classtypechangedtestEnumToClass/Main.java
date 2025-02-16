package classtypechangedtestEnumToClass;

import testing_lib.classtypechangedtestEnumToClass.*;

public class Main {
	public static void main(String[] args) {
		A a = A.INSTANCE;
	/*V1:
public enum A { INSTANCE; }*/
	/*V2:
public class A {}*/
	}
}
