package LinkedList;

public class SortedLinkedList<T extends Comparable<T>>
{
	private Node<T> head;
	private Node<T> tail;
	
	public SortedLinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * @return head Node of this Node.
	 */
	public Node<T> getHead() 
	{
		return this.head;
	}
	
	/**
	 * @return tail Node of this Node.
	 */
	public Node<T> getTail() 
	{
		return this.tail;
	}
	
	
	/**
	 * prints linked Node objects or linked Nodes list.
	 */
	public void printMyLinkedNodes() 
	{
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		Node<T> tempNode = this.head;
		
		while(tempNode.getNext() != null)
		{
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail)) 
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	/**
	 * Adds the Node object to Node list in ascending order of keys.
	 * Throws NodeNotFoundException() when trying to insert a Node with null key.
	 * @param Node
	 */
	public int sortInsert(Node<T> myNode)
	{
		if(myNode.getKey() == null)
			throw new NodeNotFoundException("Cannot sort insert a Node with null key");
			
		//If the list is empty
		if (this.head == null)
		{
			this.head = myNode;
			return 1;
		}
		
		//If the node to be added is smaller than first node
		if ( this.head.getKey().compareTo(myNode.getKey()) > 0)
		{
			Node<T> tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
			this.setTail();
			return 2;
		}
		
		Node<T> currentNode = this.head.getNext();
		Node<T> previousNode = this.head;
		while(currentNode != null)
		{
			if (currentNode.getKey().compareTo(myNode.getKey()) > 0)
				break;
			currentNode = currentNode.getNext();
			previousNode = previousNode.getNext();
		}
		previousNode.setNext(myNode);
		myNode.setNext(currentNode);
		this.setTail();
		return 3;
	}

	private void setTail() 
	{
		Node<T> currentNode = this.head;
		while(currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		this.tail = currentNode;
	}
}