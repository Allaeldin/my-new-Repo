package binärBaum;

public class Node {

	private int value;

	 Node leftNode;
	Node rightNode;

	public Node(int value) {
		super();
		this.value = value;
		leftNode = null;
		rightNode = null;
	}

	
	

	
	
	public boolean add(Node newNode) {

		Node root = this;

		while (root != null && newNode.getValue() > root.getValue()) {

			if (root.getRightNode() == null) {
				root.setRightNode(newNode);
				return true;

			} else {
				root = root.getRightNode();
			}

		}

		while (root != null && newNode.getValue() < root.getValue()) {

			if (root.getLeftNode() == null) {
				root.setLeftNode(newNode);
				return true;

			} else {
				root = root.getLeftNode();
			}

		}
		

		return false;

	}

	public void writeTree() {

		Node root1 = this;
		Node root2 = this;
		while (root1 != null) {
			if (this.equals(root1)) {

				System.out.println("root " + this.getValue());
				root1 = root1.getRightNode();
			} else {

				System.out.println("Right:" + root1.getValue());

				root1 = root1.getRightNode();
			}

		}

		while (root2 != null) {
			if (this.equals(root2)) {
				System.out.println("root " + this.getValue());
				root2 = root2.getLeftNode();
			} else {

				System.out.println("Left:" + root2.getValue());
				root2 = root2.getLeftNode();
			}
		}

	}
	
	
	
	public int suchen(int value) {
		Node root1 = this;
		Node root2 = this;
		
		while (root1!=null &&  value > root1.getValue()) {
			if (value==root1.getRightNode().getValue()) {
				System.out.println("Die Zahl wurde gefunden");
				return value;
			}else {
				root1 = root1.getRightNode();
			}
			
			
			
			
		}
		
		while (root2!=null &&  value < root2.getValue()) {
			if (value==root2.getLeftNode().getValue()) {
				System.out.println("Die Zahl wurde gefunden");
				return value;
			}else {
				root2 = root2.getLeftNode();
			}
			
			
			
		}
		
		return 0;
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public static void main(String... args) {

		Node root = new Node(80);
		Node node1 = new Node(25);
		Node node2 = new Node(170);
		Node node3 = new Node(3);
		Node node4 = new Node(9);
		
		root.add(node1);
		root.add(node2);
		root.add(node3);
		root.add(node4);
		

		root.writeTree();
		
		if (root.suchen(9)==0) {
			System.out.println("Die Zahl wurde nicht gefunden" );
			
		}
	}

}
