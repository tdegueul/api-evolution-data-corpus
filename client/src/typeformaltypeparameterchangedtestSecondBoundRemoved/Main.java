package typeformaltypeparameterchangedtestSecondBoundRemoved;

import testing_lib.typeformaltypeparameterchangedtestSecondBoundRemoved.*;

import javax.swing.text.Segment;

class Sub extends Segment implements Runnable {
	@Override
	public void run() {

	}
}

public class Main extends A<Sub> {
	public static void main(String[] args) {
		A<Sub> a = new A<Sub>();
	/*V1:
public class A<T extends CharSequence & Runnable> {}*/
	/*V2:
public class A<T extends CharSequence> {}*/
	}
}
