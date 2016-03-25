package testing_lib.genericsIfazeMethodTypeBoundsDeleteSecond;

import java.io.Serializable;

public interface GenericsIfazeMethodTypeBoundsDeleteSecond {
	
	public <T extends Number & Serializable> void method1();
	
}
