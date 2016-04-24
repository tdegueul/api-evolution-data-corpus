package inheritanceIfazeContractSuperinterfaceSet;

import testing_lib.inheritanceIfazeContractSuperinterfaceSet.InheritanceIfazeContractSuperinterfaceSet;
import testing_lib.inheritanceIfazeContractSuperinterfaceSet.Interface1;
import testing_lib.inheritanceIfazeContractSuperinterfaceSet.Interface2;

public class Main implements InheritanceIfazeContractSuperinterfaceSet {

	public static void main(String[] args) {
		Main constr = new Main();
		Interface1 ifaze = (Interface2) constr;
	}

	public void ifaze2method1() {
		
	}

	public void ifaze1method1() {
		
	}

	
}
