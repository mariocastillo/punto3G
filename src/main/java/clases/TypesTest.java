package clases;

import java.util.*;

import org.junit.Test;

public class TypesTest {
	List<Object> h=new LinkedList<Object>();
	List<Object> f=new ArrayList<Object>();
	List<Object>w=new Vector<Object>();
	Types types=new Types();
	int i=100000;
	List<Object> z = types.create(i, f);
	@Test
	public void testInsert() {
		types.insert(i,f);
	}

	@Test
	public void testRemove(){
		types.remove(i, z);
	}

	@Test
	public void testGet(){
		types.get(i,z);
	}
	
	// Vector(100000)--> testGet(0,007s)/testInsert(0,012s)/testRemove(0,002s)
	// los otros dan 0,000s todos
	
	// LinkedList(100000)--> testGet(4,963s)/testInsert(0,019s)/testRemove(0,002s)
	// los otros dan 0,000s todos
	
	// ArrayList(100000)--> testGet(0,002s)/testInsert(0,011s)/testRemove(0,002s)
	// los otros dan 0,000s todos
}

