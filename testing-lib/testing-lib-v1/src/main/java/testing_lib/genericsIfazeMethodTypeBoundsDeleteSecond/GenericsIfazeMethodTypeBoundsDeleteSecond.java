package testing_lib.genericsIfazeMethodTypeBoundsDeleteSecond;

import java.io.Serializable;

public interface GenericsIfazeMethodTypeBoundsDeleteSecond {
	
	<T extends Number & Serializable> void methodNotParametrized();
	
}
