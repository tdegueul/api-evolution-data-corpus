package classtypechangedtestRecordToClass;

import testing_lib.classtypechangedtestRecordToClass.*;

public class Main {
	public static void main(String[] args) {
		A a = new A();
	/*V1:
public record A() {}*/
	/*V2:
public class A {}*/
	}
}
