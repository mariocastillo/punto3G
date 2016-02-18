package clases;

import java.util.*;

import org.junit.Test;

public class TypesTest {
	List<Object> h=new LinkedList<>();
	List<Object> f=new ArrayList<>();
	List<Object> w=new Vector<>();
	Map<Object, Object> hm=new HashMap<>(); 
	Map<Object, Object> lm=new LinkedHashMap<>();
	Types types=new Types();
	int i=100000;
	List<Object> z = types.create(i, f);
	Map<Object,Object> y=types.create(i, lm);
	//@Test
	public void testInsert() {
		types.insert(i,f);
	}

	//@Test
	public void testRemove(){
		types.remove(i, z);
	}

	//@Test
	public void testGet(){
		types.get(i,z);
	}
	
	
	
	// Vector(100000)--> testGet(0,007s)/testInsert(0,012s)/testRemove(0,002s)
	// los otros dan 0,000s todos
	
	// LinkedList(100000)--> testGet(4,963s)/testInsert(0,019s)/testRemove(0,002s)
	// los otros dan 0,000s todos
	
	// ArrayList(100000)--> testGet(0,002s)/testInsert(0,011s)/testRemove(0,002s)
	// los otros dan 0,000s todos
	
	
	
	@Test
	public void testPutmap() {
		types.putmap(i,lm);
	}
	
	@Test
	public void testGetmap() {
		types.putmap(i,y);
	}
	
	@Test
	public void testRemovemap() {
		types.putmap(i,y);
	}
	
	// HashMap(100000)--> testGet(0,040s)/testPut(0,013s)/testRemove(0,004s)
	// los otros dan 0,000s todos
	
	// LinkedHashMap(100000)--> testGet(0,039s)/testInsert(0,015s)/testRemove(0,004s)
	// los otros dan 0,000s todos
	
	
}

