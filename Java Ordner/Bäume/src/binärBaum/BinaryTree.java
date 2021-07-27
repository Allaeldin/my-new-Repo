package binärBaum;

public class BinaryTree {
	
	
	Node rootNode;
	
	
	

	public Node addRekursiv(Node currentNode, int value) {
		if(currentNode==null) {
       return new Node(value);
		}
		
		if (value >currentNode.getValue()) {
			
			currentNode.rightNode =addRekursiv(currentNode.getRightNode(), value);
			
		}else {
			return currentNode;
		}
			
			
		if (value < currentNode.getValue()) {
			
			currentNode.leftNode = addRekursiv(currentNode.getLeftNode(), value);
		}else {
			return currentNode;
		}
		
		return currentNode;
		
	}

	
	
	
	public void add(int value) {
		
		rootNode = addRekursiv(rootNode, value);
		
		
	}
	
//	public void writeTree() {
//
//		Node root1 = rootNode;
//		Node root2 = rootNode;
//		while (root1 != null) {
//			if (rootNode.equals(root1)) {
//
//				System.out.println("root " + rootNode.getValue());
//				root1 = root1.getRightNode();
//			} else {
//
//				System.out.println("Right:" + root1.getValue());
//
//				root1 = root1.getRightNode();
//			}
//
//		}
//
//		while (root2 != null) {
//			if (rootNode.equals(root2)) {
//				System.out.println("root " + rootNode.getValue());
//				root2 = root2.getLeftNode();
//			} else {
//
//				System.out.println("Left:" + root2.getValue());
//				root2 = root2.getLeftNode();
//			}
//		}
//
//	}
	
	
	
	public void  traversalInOrder(Node node) {
		
		if(node!=null) {
			
			traversalInOrder(node.getLeftNode());
			
			System.out.println(node.getValue());
			
			traversalInOrder(node.getRightNode());
			
		}
		
	}
	public static void main(String...args) {
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.add(12);
		binaryTree.add(25);
		binaryTree.add(1);
		binaryTree.add(13);
		binaryTree.add(6);
		binaryTree.traversalInOrder(binaryTree.rootNode);
		
		
	}
	
}
