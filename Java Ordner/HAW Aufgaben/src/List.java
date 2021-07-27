import java.util.AbstractList;

public class List<E> extends  AbstractList{

	Node<E> headNode = new Node<>(null);
	Node<E> tailNode =  new Node<>(null);
	int size =0;
	
	
	
	
	public List() {
		super();
		headNode.setInhalt(null);
		tailNode.setInhalt(null);
		
		headNode.setNextNode(tailNode);
		headNode.setPrevNode(null);
		tailNode.setNextNode(null);
		tailNode.setPrevNode(headNode);
		
	}
	
	
	
	public void add(Node<E> newNode) {
	
		
			
	
			
	
		getLast().setNextNode(newNode);;
		newNode.setPrevNode(getLast());
		newNode.setNextNode(tailNode);
		tailNode.setPrevNode(newNode);
		size++;
	
	
			
	
		//	System.out.println("GetLast:"+getLast().getInhalt());
			
		
		
		
		
	}
	
	
	
	
	
	public Node<E> getLast(){
		Node<E> le = headNode;
		
	while (  le.nextNode !=null && le.nextNode.getInhalt()!=null) {
		
		le = le.nextNode;
		
	}	
		
		return le;
		
	}
	
	
	
	public void delete(Node<E> elemNode) {
		
		Node<E> le = headNode;
		
		while (le.nextNode!=null && le.nextNode.getInhalt()!=null) {
			
			if (le.nextNode.equals(elemNode)) {
				
				if (le.nextNode.nextNode!=null && le.nextNode.nextNode.getInhalt() ==null) {
					
					le.setNextNode(tailNode);
					tailNode.setPrevNode(le.nextNode.prevNode);
					size--;
					
				}else if (le.nextNode.nextNode!=null && le.nextNode.nextNode.getInhalt() !=null) {
					le.setNextNode(le.nextNode.nextNode);
					le.nextNode.nextNode.setPrevNode(le.nextNode.prevNode);
					size--;
				}else {
					le.setNextNode(tailNode);
					tailNode.setPrevNode(le.nextNode.prevNode);
					size--;
				}
				
				
				
			}
			
			
			
			le = le.nextNode;
			
		}
		
		
		
	}
	
	
	public void write() {
		
		Node<E> le = headNode;
		
		
		while (le.nextNode!=null && le.nextNode.getInhalt()!=null) {
			
			System.out.print(le.nextNode.inhalt +"  ");
			
			le = le.nextNode;
			
		}
		
		
		
		System.out.println();
		
		
		
		
		
		
	}



	@Override
	public Node<E> get(int index) {
		
		Node<E>le = headNode;
		Node<E> resultNode = headNode;
		
		while (le.nextNode!= null && le.nextNode.getInhalt()!=null) {
			
			int elem = (int)le.nextNode.getInhalt();
			if (elem==index) {
				
				resultNode = le.nextNode;
			}
			
			le = le.nextNode;
			
			
		}
		
		
		return resultNode;
	}



	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
