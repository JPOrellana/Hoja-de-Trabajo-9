/**
 * @Author Pablo Orellana 
 * Clase Hashing
 */

import java.util.HashMap;

public class Hashing<K extends Comparable<K>, V> implements TranslatorInterface<K,V>{
	private HashMap<K, V> data ; 

	public Hashing(){
		this.data = new HashMap<K, V>();
	}

	@Override
	public V remove(K key){
		return data.remove(key);
	}

	@Override
	public V put(Association<K,V> association){
		return data.put((K)association.getKey(), (V)association.getValue());
	}

	@Override
	public int size(){
		return data.size();
	}

	@Override
	public boolean searchValue(K searched) {
		if (data.containsKey(searched)) {
			return true;
		}
		return false;
	}

	@Override
	public V get(K key) {
		return data.get(key);
	}

}