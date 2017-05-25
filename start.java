package lorenz;

public class start {

	public static void main(String[] args) {
		BinaryTree<Integer> b = new BinaryTree<Integer>(new Integer(42));
		b.add(new Integer(10));
		b.add(new Integer(12));
		b.add(new Integer(15));
		b.add(new Integer(45));
		b.add(new Integer(125));
		b.add(new Integer(70));
		b.add(new Integer(2));
		
		b.viewTree();

	}

}
