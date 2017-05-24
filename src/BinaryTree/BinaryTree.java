package BinaryTree;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

public class BinaryTree <Type extends Comparable<Type>> {

	
	protected Element<Type> thisElement;
	
	protected BinaryTree<Type> branchLeft;
	protected BinaryTree<Type> branchRight;
	
	//Workaround:
	List<Element<Type>> tempList = null;
	List<Element<Type>> outputList = null;
	
	
	public boolean empty(){
		return (branchLeft != null && branchRight != null);
	}
	
	public BinaryTree<Type> left(){
		return branchLeft;
	}
	
	public BinaryTree<Type> right(){
		return branchRight;
	}
	
	public Element<Type> value(){
		return thisElement;
	}
	
	public BinaryTree(Element<Type> e){
		branchLeft 	= new BinaryTree<Type>();
		branchRight = new BinaryTree<Type>();
		thisElement = e;
	}
	
	public BinaryTree(Element<Type> e, BinaryTree<Type> branchLeft, BinaryTree<Type> branchRight){
		thisElement = e;
		this.branchLeft = branchLeft;
		this.branchRight = branchRight;
	}
	
	public BinaryTree(Type e, BinaryTree<Type> branchLeft, BinaryTree<Type> branchRight){
		thisElement = new Element<Type>(e);
		this.branchLeft = branchLeft;
		this.branchRight = branchRight;
	}
	
	public BinaryTree(){
		thisElement = null;
		branchLeft = null;
		branchRight = null;
	}
	
	public List<Element<Type>> traverseInOrder(List<Element<Type>> outputList){
		
		if(thisElement==null){		// rekrusionabbruch
			return outputList;
		}
		
		else{						// rekursionsaufru
			outputList.add(branchLeft.thisElement);	//L
			traverseInOrder(outputList);			//W
			outputList.add(branchRight.thisElement);//R
			return outputList;
		}
	}

	public List<Element<Type>> traversePostOrder(List<Element<Type>> outputList){
		if(thisElement==null) return outputList;
		outputList.add(branchLeft.thisElement);	//L
		outputList.add(branchRight.thisElement);//R
		traversePostOrder(outputList);			//W
		return outputList;
	}

	public List<Element<Type>> traversePreOrder(List<Element<Type>> outputList){
		if(thisElement == null) return outputList;
		traversePreOrder(outputList);				//W
		outputList.add(branchLeft.thisElement);		//L
		outputList.add(branchRight.thisElement);	//R
		return outputList;
	}
	
	//TODO KlammerInOrderFehlt
	
	public String traverseKlammerInOrder(String outputString){
		outputString += "(";
		traverseInOrder(tempList);
		if (tempList.toString() != null) outputString += tempList.toString();
		outputString += ")";
		tempList = null;
		return outputString;
	}
	
	public void traverseKlammerInOrderWriteStream(PrintStream stream){
		PrintWriter pw = new PrintWriter(stream);
		String outputString = "";
		pw.println(traverseKlammerInOrder(outputString));
	}
	
	public void traversePreOrderWriteStream(PrintStream stream){
		PrintWriter pw = new PrintWriter(stream);
		pw.println(traversePreOrder(outputList).toString());
	}
	
	public void traversePostOrderWriteStream(PrintStream stream){
		PrintWriter pw = new PrintWriter(stream);
		pw.println(traversePostOrder(outputList).toString());
	}
	

	
}



