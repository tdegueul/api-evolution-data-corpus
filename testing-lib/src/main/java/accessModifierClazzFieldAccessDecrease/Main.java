package accessModifierClazzFieldAccessDecrease;

import testing_lib.accessModifierClazzFieldAccessDecrease.AccessModifierClazzFieldAccessDecrease;

public class Main extends AccessModifierClazzFieldAccessDecrease {

	public static void main(String[] args) {
		
		AccessModifierClazzFieldAccessDecrease constr = new AccessModifierClazzFieldAccessDecrease();
		
		Integer field = constr.fieldPublicToProtected;
		
		Integer field2 = constr.fieldPublicToNon;
		
		Integer field3 = constr.fieldPublicToPrivate;
		
		Main constrExtended = new Main();
		
		Integer field4 = constrExtended.fieldProtectedToNon;
		
		Integer field5 = constrExtended.fieldProtectedToPrivate;
	}
	
}
