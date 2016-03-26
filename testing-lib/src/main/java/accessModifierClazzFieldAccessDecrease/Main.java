package accessModifierClazzFieldAccessDecrease;

import testing_lib.accessModifierClazzFieldAccessDecrease.AccessModifierClazzFieldAccessDecrease;

public class Main extends AccessModifierClazzFieldAccessDecrease {

	public static void main(String[] args) {
		
		AccessModifierClazzFieldAccessDecrease constr = new AccessModifierClazzFieldAccessDecrease();
		
		System.out.println(constr.fieldPublicToProtected);
		
		System.out.println(constr.fieldPublicToNon);
		
		System.out.println(constr.fieldPublicToPrivate);
		
		Main constrExtended = new Main();
		
		System.out.println(constrExtended.fieldProtectedToNon);
		
		System.out.println(constrExtended.fieldProtectedToPrivate);
	}
	
}
