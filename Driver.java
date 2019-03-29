
public class Driver {
	public static void main(String[] args) {
		Node<Integer> N = new Node<>(new Integer(7));
		DCList<Integer> D=new DCList<>();
		D.add(N);
		D.add(new Node<>(new Integer(8)));
		D.add(new Node<>(new Integer(9)));
		D.add(new Node<>(new Integer(16)));
		System.out.println(D.size());
		System.out.println(D.getFirst().getValue());
		D.getClass();
		D.display();
		System.out.println(D.getLast().getValue());
		D.removeLast();
		D.display();
		D.removeFirst();
		D.display();
		D.removeFirst();
		D.display();
		D.remove(N);
		D.display();
	}
}
