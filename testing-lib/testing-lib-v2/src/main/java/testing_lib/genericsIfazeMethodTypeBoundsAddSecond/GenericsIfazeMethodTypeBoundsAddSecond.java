package testing_lib.genericsIfazeMethodTypeBoundsAddSecond;

import java.io.Serializable;

public interface GenericsIfazeMethodTypeBoundsAddSecond {
	
	<T extends Number & Serializable> void methodNotParametrized();
	
}
