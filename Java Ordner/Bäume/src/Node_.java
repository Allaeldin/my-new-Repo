import java.util.ArrayList;
import java.util.Iterator;

public class Node_<E> {

	private ArrayList<Node_<E>> childernNodes = new ArrayList<>();
	private Node_<E> parent = null;
	private E value = null;
	
	public Node_(E value) {
		super();
		this.value = value;
	}
	
	
	
	public void addchild(Node_<E> child) {
		childernNodes.add(child);
		child.setParent(this);
	}
	
	
	public void addChildern(ArrayList<Node_<E>> childernList) {
		childernNodes.addAll(childernList);
		for (Node_<E> node_ : childernList) {
			node_.setParent(this);
		}
		
	}
	
	
	public void writeTree(Node_<E>root) {
		
		System.out.println(root.getValue());
		for (Node_<E> node_ : root.getChildernNodes()) {
			
			writeTree(node_);
		}
		
		
	}

	public ArrayList<Node_<E>> getChildernNodes() {
		return childernNodes;
	}

	public void setChildernNodes(ArrayList<Node_<E>> childernNodes) {
		this.childernNodes = childernNodes;
	}

	public Node_<E> getParent() {
		return parent;
	}

	public void setParent(Node_<E> parent) {
		this.parent = parent;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
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
