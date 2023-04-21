/**
 * @author Pablo Orellana
 * Interface traductor
 */


public interface TranslatorInterface<K extends Comparable<K>,V>{
	/**
     * El queue no esta vacio
	 * Luego se remueve y retorna el valor mas pequeno dentro del queue
	 */

    public V remove(K key);
    
    
	/**
	* @param E Valor a agregar
	* Se agrega un valor al queue
	*/
	public V put(Association<K,V> association);


	/* Luego se retorna la cantidad de elementos dentro del queue
     */
	public int size();

	/* Se busca una palabra
     * Luego se retorna su traduccion
	 */
	public boolean searchValue(K searched);

	/* Se busca una palabra
     * Luego se retorna su traduccion
	 */
	public V get(K key);
}