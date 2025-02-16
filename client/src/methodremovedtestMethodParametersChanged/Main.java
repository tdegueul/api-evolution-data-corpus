package methodremovedtestMethodParametersChanged;

import testing_lib.methodremovedtestMethodParametersChanged.*;

public class Main {
	public static void main(String[] args) {
		new A().m1(1, "");
	/*V1:

public class A {
    public void m1(int x, String y) {}
}*/
	/*V2:

public class A {
  public void m1(int x) {}
}*/
	}
}
