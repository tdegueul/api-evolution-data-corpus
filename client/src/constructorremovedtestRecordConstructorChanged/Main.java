package constructorremovedtestRecordConstructorChanged;

import testing_lib.constructorremovedtestRecordConstructorChanged.*;

public class Main {
	public static void main(String[] args) {
		A a = new A(0);
	/*V1:
public record A(int i) {}*/
	/*V2:
public record A(float f) {}*/
	}
}
