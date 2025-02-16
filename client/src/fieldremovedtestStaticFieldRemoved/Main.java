package fieldremovedtestStaticFieldRemoved;

import testing_lib.fieldremovedtestStaticFieldRemoved.*;

public class Main {
	public static void main(String[] args) {
		int i = A.f;
	/*V1:

public class A {
    public static int f;
}*/
	/*V2:
public class A {}*/
	}
}
