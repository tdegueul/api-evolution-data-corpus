package fieldremovedtestFieldNowHidden;

import testing_lib.fieldremovedtestFieldNowHidden.*;

public class Main {
	public static void main(String[] args) {
		int i = new A().f;
	/*V1:

public class A {
    public int f;
}*/
	/*V2:

public class A {
    int f;
}*/
	}
}
