package accessModifierClazzFieldAccessIncrease;

import testing_lib.accessModifierClazzFieldAccessIncrease.AccessModifierClazzFieldAccessIncrease;

public class Main extends AccessModifierClazzFieldAccessIncrease {

	public static void main(String[] args) {
		Main constrExtended = new Main();
		
		Integer field = constrExtended.fieldProtectedToPublic;
	}
	
}
