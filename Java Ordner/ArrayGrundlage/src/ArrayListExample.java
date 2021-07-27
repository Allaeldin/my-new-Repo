import java.util.Arrays;

public class ArrayListExample<E> {
	
	int size=0;
	Object[] elements;
	public static  final int defualtCapasity = 10;
	
	
	public ArrayListExample() {
		
		elements = new Object[defualtCapasity];
	}

	
	
	public void add(E e) {
		
		if(size== elements.length) {
			ensureCapasity();
			
		}
		
		elements[size++]= e;
		
	}
	
	
	
	
	public void ensureCapasity() {
		
		elements = Arrays.copyOf(elements, elements.length*2);
		
		
	}
	
	
	public E get(int index) {
		
		if(index>size || index<0) {
			
			throw new ArrayIndexOutOfBoundsException();
			
		}
		
		return (E) elements[index];
		
	}
	
	public E remove(int index) {
		
		Object items = elements[index];
		for (int i = index; i < size; i++) {
			elements[i]=elements[i+1];
		}
		
		size--;
		return (E) items;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
