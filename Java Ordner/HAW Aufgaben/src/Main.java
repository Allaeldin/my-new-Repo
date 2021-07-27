
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list = new List<>();
		
		Node<Integer> node1 = new Node<Integer>(78);
		Node<Integer> node2 = new Node<Integer>(1657);
		Node<Integer> node3 = new Node<Integer>(23);
		Node<Integer> node4 = new Node<Integer>(100);
		

		
		
		
		
		
		
		
		
		
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		
		
	list.write();
		
	System.out.println("----------------------");
		
		//list.delete(node4);
		
		list.write();
		
		System.out.println(" --------------------------");
		
		System.out.println(list.get(23).nextNode.getInhalt());
		
		System.out.println("--------------------");
		System.out.println(list.size);
		list.delete(node3);
		System.out.println(list.size);
		
	}

}
