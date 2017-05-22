package BinaryTree;

public class Element<Type> {
	
	private Type content;
	
	public Element(Type content){
		this.content = content;
	}
	public Element(){
		content = null;
	}
	
	public Type getContent(){
		return content;
	}
}
