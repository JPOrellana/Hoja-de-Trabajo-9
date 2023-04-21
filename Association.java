/**
 * @author Pablo Orellana
 * Clase Association 
 */

 
 public class Association<K extends Comparable<K>, V> implements Comparable<Association<K,V>>{
    private K key;
    private V value;


    /**
    * @param key Llave
    * @param value Valor
    * Se construye la asosiaccion
    */
    public Association(K key, V value){
        this.key = key;
        this.value = value;
    }



    public Association(){}

    /**
    * Asocacion a obtener la llave
    * @return Llave de la asociacion
    */
    public K getKey(){
        return this.key;
    }


    /**
    * Asocacion a obtener el valor
    * @return Valor de la asociacion
    */
    public V getValue() {
        return this.value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }


    
    /**
    * @param that Recibe la asociacion a comparar
    * Tener una asociacion a comparar con otra asociacion
    * @return Un entero que representa la comparacion 
    */
    public int compareTo(Association<K,V> that){
        return key.compareTo(that.key);
    }

}