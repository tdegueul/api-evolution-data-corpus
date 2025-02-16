package methodnowabstracttestDefaultNowAbstract;

import testing_lib.methodnowabstracttestDefaultNowAbstract.*;

public class Main implements I {
	public static void main(String[] args) {
		new Main();
	/*V1:

public interface I {
	default void m() {}
}*/
	/*V2:

public interface I {
	void m();
}*/
	}
}
