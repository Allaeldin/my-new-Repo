import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	
	
	int vertex;
	LinkedList<Integer> list[];
	
	
	public Graph(int vertex) {
		super();
		this.vertex = vertex;
		
		list = new LinkedList[vertex];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = new LinkedList<>();
		}
		
		
	}
	
	
	public void addEdge(int source , int destination) {
		list[source].addFirst(destination);
		list[destination].addFirst(source);
		
	}
	
	
	
	
	public void ausgeben() {
		
	for (int i = 0; i < vertex; i++) {
		if (list[i].size() != 0) {
			System.out.print("Dies ist "+ i +" verbindet mit .  ");
			for (int value : list[i]) {
				System.out.print("  "+value);
			}
			
			System.out.println();
		}
		
	}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Graph graph = new Graph(5);
		graph.addEdge(0, 2);
		graph.addEdge(1, 4);
		graph.addEdge(4, 1);
		graph.ausgeben();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





























}
