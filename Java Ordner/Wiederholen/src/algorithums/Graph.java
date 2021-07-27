package algorithums;

import java.util.LinkedList;
import java.util.List;

public class Graph {
	int vertex;
	LinkedList<Integer> list[];
	
	public Graph(int vertex) {
		this.vertex = vertex;
		list = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			list[i] = new LinkedList<>();
		}
	}
	
	
	public  void addEdge(int source, int distination) {
	
		list[source].add(distination);
		list[distination].add(source);
		
		
		
	}
	
	public  void print() {
		
		for (int i = 0; i < vertex; i++) {
			
			if (list[i].size()>0) {
				System.out.print("Die Knote "+i+" ist verbunden mit ");
				for (int j = 0; j < list[i].size(); j++) {
					
				System.out.print(list[i].get(j)+"  ");
					
				}
				
				
			}
			
			System.out.println();
		}
		
	}
	
	
	
	
	public static void main(String...args) {
		
		


		Graph graph = new Graph(5);
		
		graph.addEdge(0, 2);
		graph.addEdge(0, 4);
		graph.addEdge(1, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 2);
		graph.addEdge(3, 2);
		
		graph.print();
		
		
		
		
		
		
		
		
		
		
	}

}
