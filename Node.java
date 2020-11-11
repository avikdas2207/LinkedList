package LinkedList;

public interface Node <K> 
{
	/**
	 * To retrieve the "Key" attribute of a Node type.
	 * @return
	 */
	K getKey();
	
	/**Sets the "Key" attribute of a Node type.
	 * @param key
	 */
	void setKey(K key);
	
	/**To retrieve the "next" attribute of a Node type.
	 * "next" is the attribute that stores the reference to a Node type to which current Node is referring.
	 * @return
	 */
	Node<K> getNext();
	
	/** Sets the value of "next" attribute of a Node type.
	 * "next" is the attribute that stores the reference to a Node type to which current Node is referring.
	 * @param next
	 */
	void setNext(Node<K> next);
}