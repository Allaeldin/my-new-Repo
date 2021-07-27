import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;

public class Node<E> {
	
	private E dataE = null;
	private ArrayList<Node<E>> childernNodes = new ArrayList<>();
	private Node<E> parent = null;
	
	public Node(E dataE) {
		super();
		this.dataE = dataE;
	}

	
	
	
	
	public void addChild(Node<E> child) {
		childernNodes.add(child);
		child.setParent(this);
		
		
	}
	
	public void addChildern(ArrayList<Node<E>> childern) {
		
		childernNodes.addAll(childern);
		for (Node<E> node : childern) {
			node.setParent(this);
		}
		
	}
	
	public void writeTree(Node<E>root) {
		System.out.println(root.getDataE());
		for (Node<E> node : root.getChildernNodes()) {
			
		     writeTree(node);
		}
		
		
		
		
	}
	
	
	
	// Getter & Setter
	public E getDataE() {
		return dataE;
	}

	public void setDataE(E dataE) {
		this.dataE = dataE;
	}

	public ArrayList<Node<E>> getChildernNodes() {
		return childernNodes;
	}

	public void setChildernNodes(ArrayList<Node<E>> childernNodes) {
		this.childernNodes = childernNodes;
	}

	public Node<E> getParent() {
		return parent;
	}

	public void setParent(Node<E> parent) {
		this.parent = parent;
	}
	
	
	public static void main( String...args) {
		
		Node<String> root = new Node<String>("root");
		Node<String> node1 = new Node<String>("node1");
		Node<String> node2 = new Node<String>("node2");
		Node<String> node3 = new Node<String>("node3");
		Node<String> node4 = new Node<String>("node4");
		Node<String> node5 = new Node<String>("node5");
		
		ArrayList<Node<String>> nodeList = new ArrayList<>();
				nodeList.add(node3);
				nodeList.add(node4);
		
		root.addChild(node1);
		root.addChild(node2);
		node2.addChildern(nodeList);
		node4.addChild(node5);
		
		root.writeTree(root);
		
		
		
	}
	
	
	

}
