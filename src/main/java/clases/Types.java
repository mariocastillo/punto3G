package clases;

import java.util.*;




public class Types {
	
	public List<Object> create(int iteraciones,List<Object> t){
		for (int j = 0; j < iteraciones; j++) {
			t.add(j);			
		}
		return t;
	}
	public Map<Object,Object> create(int iteraciones,Map<Object,Object> t){
		for (int j = 0; j < iteraciones; j++) {
			t.put(j, j);			
		}
		return t;
	}

	public List<Object> insert(int iteraciones,List<Object> list){
		for (int i = 0; i < iteraciones; i++) {
			list.add(i);
		}
		return list;
	}
	
	
	public List<Object> remove(int iteraciones,List<Object> list){
		for (int i = 0; i < iteraciones; i++) {
 		}
		return list;
	}
	public Object get(int iteraciones,List<Object> list){
		for (int i = 0; i < iteraciones; i++) {
			list.get(i);
		}
		return list;
	}
	
	public Map<Object,Object> getmap(int iteraciones,Map<Object,Object> list){
		for (int i = 0; i < iteraciones; i++) {
			list.get(i);
		}
		return list;
	}
	
	public Map<Object,Object> putmap(int iteraciones,Map<Object,Object> list){
		for (int i = 0; i < iteraciones; i++) {
			list.put(i, i);
		}
		return list;
	}
	
	public Map<Object,Object> removemap(int iteraciones,Map<Object,Object> list){
		for (int i = 0; i < iteraciones; i++) {
			list.remove(i);
		}
		return list;
	}
	
	
}
