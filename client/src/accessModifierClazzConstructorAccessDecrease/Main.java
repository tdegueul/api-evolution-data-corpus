package accessModifierClazzConstructorAccessDecrease;

import testing_lib.accessModifierClazzConstructorAccessDecrease.AccessModifierClazzConstructorAccessDecrease;

public class Main extends AccessModifierClazzConstructorAccessDecrease {

	protected Main(int a, int b, int c) {
		super(a, b, c);
	}
	
	protected Main(int a, int b, int c, int d) {
		super(a, b, c, d);
	}
	
	public static void main(String[] args) {
		
		int a = 5;
		
		new AccessModifierClazzConstructorAccessDecrease();
		
		new AccessModifierClazzConstructorAccessDecrease(a);
		
		new AccessModifierClazzConstructorAccessDecrease(a, a);
		
		new Main(a, a, a);
		
		new Main(a, a, a, a);
	}
	
}
