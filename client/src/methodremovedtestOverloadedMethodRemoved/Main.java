package methodremovedtestOverloadedMethodRemoved;

import testing_lib.methodremovedtestOverloadedMethodRemoved.*;

public class Main {
	public static void main(String[] args) {
		new A().m1(1);
	/*V1:

public class A {
    public void m1() {}
    public void m1(int i) {}
}*/
	/*V2:

public class A {
    public void m1() {}
}*/
	}
}
