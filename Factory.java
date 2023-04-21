/**
 * @author Pablo Orellana
 * Clase Fsctory
 */

public class Factory<K extends Comparable<K>,V>{
	/**
	 * Haber elegido un traductor 
	 * Luego intancia de tipo de tranductor seleccionado
	 * @param tipoTranslator Tipo de translator a instanciar
	 */
	public TranslatorInterface<K, V> getTranslator(int tipoTranslator){
		if (tipoTranslator == 1) { 
			return new Hashing<K,V>();
		} else { 
			return new MapSplayTree<K,V>();
		}
	}
}
