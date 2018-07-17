package com.ds;
import java.util.*;
/**
 * k1 -> (v1, id1)
 * K2 -> (v2, id2)
 * K3 -> (v3, id3)
 *
 * @param <K>
 * @param <V>
 */
public class MagicMap<K,V> {
	
	Map<K,V> base = new HashMap<K,V>();
	List<Integer> myList = new ArrayList<Integer>();
	
	private static class MagicEntry<K,V>{
		V value;
		K key;
		public void MagicEntry(K key, V value){
			this.value = value;
			this.key = key;
		}
	}
	
	public V put(K key, V value) {
		return base.put(key, value);
	}
	
	public V get(K key){
		return base.get(key);
	}
	
	public V delete(K key){
		return base.remove(key);
	}

}
