
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListExample<String> list = new ArrayListExample<>();
		list.add("Mohamed");
		list.add("Ali");
		list.add("Tarq");

//		for (int i = 0; i < list.size; i++) {
//
//			System.out.println(list.get(i));
//		}

		list.remove(1);

		for (int i = 0; i < list.size; i++) {

			System.out.println(list.get(i));
		}

	}

}
