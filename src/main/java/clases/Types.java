package clases;

import java.util.*;




public class Types {

	public List<Object> insert(int iteraciones,List<Object> list){
		for (int i = 0; i < iteraciones; i++) {
			list.add(i,i*2);
		}
		return list;
	}
	
	
	public List<Object> remove(int iteraciones,List<Object> list){
		for (int i = 0; i < iteraciones; i++) {
			list.remove(i);
		}
		return list;
	}
	public Object get(int iteraciones,List<Object> list){
		for (int i = 0; i < iteraciones; i++) {
			list.get(i);
		}
		return list;
	}

}
