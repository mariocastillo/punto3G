package clases;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class TypesTest {
	List<Object> h=new LinkedList<Object>();
	List<Object> f=new ArrayList<Object>();
	List<Object>w=new Vector<Object>();
	Types types=new Types();
	int i=100000;
	

	@Test
	public void testInsert() {
		types.insert(i,w);
	}
	// resultado de la prueba es de 0,036s para 100000 con ArrayList
	// resultado de la prueba es de 0,022s para 1000 con ArrayList
	// resultado de la prueba es de 0,019s para 100 con ArrayList
	
	// resultado de la prueba es de 0,02s para 100 con LinkedList
	// resultado de la prueba es de 0,02s para 1000 con LinkedList
	// resultado de la prueba es de 0,035s para 100000 con LinkedList

	// resultado de la prueba es de 0,02s para 100 con LinkedList
	// resultado de la prueba es de 0,022s para 1000 con LinkedList
	// resultado de la prueba es de 0,035s para 100000 con LinkedList
}

