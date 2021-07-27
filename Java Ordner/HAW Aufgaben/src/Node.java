
public class Node<E> {
	
	E inhalt= null;
	Node<E> nextNode;
	Node<E> prevNode;
	
	
	public Node(E inhalt) {
		super();
		this.inhalt = inhalt;
	}
	
	
	
	
	
	
	public E getInhalt() {
		return inhalt;
	}
	public void setInhalt(E inhalt) {
		this.inhalt = inhalt;
	}
	public Node<E> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}
	

	public Node<E> getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node<E> prevNode) {
		this.prevNode = prevNode;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj==null) {
			
			return false;
		}
		
		if (this.getClass()!= obj.getClass()) {
			return false;
		}
		
		
		if (this==obj) {
			return true;
			
		}
		
		Node<E> other = (Node<E>)obj;
		
		return (this.inhalt==other.getInhalt() && this.nextNode.equals(other.nextNode) && this.prevNode.equals(other.prevNode));
	}






	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
