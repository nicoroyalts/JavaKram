package lorenz;

import java.util.Scanner;

public class BinaryTree<Type extends Comparable<Type>>{

	private Node head;
	private Node iterator;
	
	public BinaryTree(Type head){		
		this.head = new Node(head);
		this.iterator = this.head;
	}
	
	public void viewTree() {
		
		Scanner input = new Scanner(System.in);
		iterator = head;
		System.out.println(iterator.getContent().toString());	
		
		boolean exit = false;
		while(!exit) {
			switch(input.next()) {
			
			case "l":
				if(iterator.getLeft() == null) {	
					System.out.println("No left Node");	
				}
				else {
					iterator = iterator.getLeft();
					System.out.println(iterator.getContent().toString());
				}
				break;
			
			case "r":
				if(iterator.getRight() == null) {	
					System.out.println("No right Node");	
				}
				else {
					iterator = iterator.getRight();
					System.out.println(iterator.getContent().toString());					
				}
				break;
			
			case "u":
				iterator = iterator.getRoot();
				System.out.println(iterator.getContent().toString());					
				break;
			
			default:
				input.close();
				exit = true;
					
			}			
		}
		
	}
	
	public boolean add(Type n){
		iterator = head;
		
		switch( iterator.getContent().compareTo( n )){			
			
		case 0:
			System.out.println("Elemnt already exists");
			return false;
			
		case 1:
			if(iterator.left == null){
				iterator.setLeft(new Node(n, iterator));
				return true;
			}
			
			iterator = iterator.left;
			return add(n,iterator);
			
		case -1:
			if(iterator.right == null){
				iterator.setRight(new Node(n,iterator));
				return true;
			}
			
			iterator = iterator.right;
			return add(n,iterator);
			
		default:
			return false;
		
		}		
	}
	
	private boolean add(Type n, Node iterator){
		this.iterator = iterator;
		
		switch( iterator.getContent().compareTo( n )){			
			
		case 0:
			System.out.println("Elemnt already exists");
			return false;
			
		case 1:
			if(iterator.left == null){
				iterator.setLeft(new Node(n,iterator));
				return true;
			}
			
			iterator = iterator.left;
			return add(n,iterator);
			
		case -1:
			if(iterator.right == null){
				iterator.setRight(new Node(n,iterator));
				return true;
			}
			
			iterator = iterator.right;
			return add(n,iterator);
			
		default:
			return false;
		
		}		
	}

	private Node searchNode(Type n) {
		return null;
		
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