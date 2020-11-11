package LinkedList;

public class NodeNotFoundException extends RuntimeException 
{

	/**
	 * Throws a runtime exception when some Node is not found.
	 */
	private static final long serialVersionUID = 1L;

	public NodeNotFoundException(String message) 
	{
		super(message);
	}
	
}
