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
		
		AccessModifierClazzConstructorAccessDecrease constr = new AccessModifierClazzConstructorAccessDecrease();
		
		AccessModifierClazzConstructorAccessDecrease constr2 = new AccessModifierClazzConstructorAccessDecrease(a);
		
		AccessModifierClazzConstructorAccessDecrease constr3 = new AccessModifierClazzConstructorAccessDecrease(a, a);
		
		Main constr4 = new Main(a, a, a);
		
		Main constr5 = new Main(a, a, a, a);
	}
	
}
