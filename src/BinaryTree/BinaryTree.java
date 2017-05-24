package BinaryTree;


public class BinaryTree<Type extends Comparable<Type>>{

	private Node head;
	private Node iterator;
	
	public BinaryTree(Node head){		
		this.head = head;
		this.iterator = head;
	}
	
	public void add(Node n){
		iterator = head;
		
		switch( iterator.getContent().compareTo( n.getContent() )){			
			
		case 0:
			break;
		case -1:
			break;
		case 1:
			break;
			
		}
		
	}
	
	
	class Node{
		private Type content;
		
		private Node right = null;
		private Node left = null;
		private Node root = null;
				
		Node(Type content){
			this.content = content;
		}
		
		Node(Type content,Node root){
			this.content = content;
			this.root = root;
		}
		
		
		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRoot() {
			return root;
		}

		public void setRoot(Node root) {
			this.root = root;
		}

		
		public Type getContent() {
			return content;
		}

		
		public void setContent(Type content) {
			this.content = content;
		}
		
		
	}

}



