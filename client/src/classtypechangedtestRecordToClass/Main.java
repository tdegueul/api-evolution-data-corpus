package classtypechangedtestRecordToClass;

import testing_lib.classtypechangedtestRecordToClass.*;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		Object o = new A();
		if (o instanceof A()) { // record pattern: only valid if A is a record
		}
	/*V1:
public record A() {}*/
	/*V2:
public class A {}*/
	}
}
