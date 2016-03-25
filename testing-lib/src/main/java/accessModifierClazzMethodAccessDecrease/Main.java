package accessModifierClazzMethodAccessDecrease;

import testing_lib.accessModifierClazzMethodAccessDecrease.AccessModifierClazzMethodAccessDecrease;

public class Main extends AccessModifierClazzMethodAccessDecrease{

	public static void main(String[] args) {
		AccessModifierClazzMethodAccessDecrease constr = new AccessModifierClazzMethodAccessDecrease();
		constr.methodPublicToProtected();
		constr.methodPublicToNon();
		constr.methodPublicToPrivate();
		
		Main constrExtended = new Main();
		constrExtended.methodProtectedToNon();
		constrExtended.methodProtectedToPrivate();
	}
	
}
