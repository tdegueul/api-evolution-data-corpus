package accessModifierClazzNestedIfazeAccessDecrease;

import testing_lib.accessModifierClazzNestedIfazeAccessDecrease.AccessModifierClazzNestedIfazeAccessDecrease.IfazePublicToNon;
import testing_lib.accessModifierClazzNestedIfazeAccessDecrease.AccessModifierClazzNestedIfazeAccessDecrease.IfazePublicToPrivate;
import testing_lib.accessModifierClazzNestedIfazeAccessDecrease.AccessModifierClazzNestedIfazeAccessDecrease.IfazePublicToProtected;

public class Main implements IfazePublicToProtected, IfazePublicToNon, IfazePublicToPrivate {

	public static void main(String[] args) {
		IfazePublicToProtected constr = new Main();
		IfazePublicToNon constr2 = new Main();
		IfazePublicToPrivate constr3 = new Main();
	}
	
	
}
