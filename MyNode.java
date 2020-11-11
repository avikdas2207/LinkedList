package LinkedList;

/**Class defining the structure and methods for each node of LinkedList
 * @param <K>
 */
public class MyNode <K> implements Node<K>
{ 
	private K key;
	private Node<K> next;
	
	
	/**
	 * Creates a Node object with it's key value as the value passed in parameter and it's the next as null.
	 * Pass null as parameter to create head node.
	 * @param key value for the node
	 */
	public MyNode(K key)
	{
		this.key = key;
		this.next = null;
	}

	/**
	 *Returns the key of the current Node object.
	 */
	@Override
	public K getKey() 
	{
		return key;
	}

	/**
	 *Sets the key for the current Node object.
	 */
	@Override
	public void setKey(K key) 
	{
		this.key = key;
	}

	/**
	 *Returns the reference of the Node object to which this Node object is pointing.
	 */
	@Override
	public Node<K> getNext() 
	{
		return next;
	}

	/**
	 *Sets the next value for the current Node object.
	 */
	@Override
	public void setNext(Node<K> next) 
	{
		this.next = next;
	}
}