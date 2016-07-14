package accessModifierClazzFieldAccessDecrease;

import testing_lib.accessModifierClazzFieldAccessDecrease.AccessModifierClazzFieldAccessDecrease;

public class Main extends AccessModifierClazzFieldAccessDecrease {

	public static void main(String[] args) {
		
		AccessModifierClazzFieldAccessDecrease constr = new AccessModifierClazzFieldAccessDecrease();
		
		Integer test = constr.fieldPublicToProtected;
		
		test = constr.fieldPublicToNon;
		
		test = constr.fieldPublicToPrivate;
		
		Main constrExtended = new Main();
		
		test = constrExtended.fieldProtectedToNon;
		
		test = constrExtended.fieldProtectedToPrivate;
	}
	
}
