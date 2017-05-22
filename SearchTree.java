package BinaryTree;

import java.util.Collection;
import java.util.Iterator;

/* AUFGABE:
 * Suchbaum soll Wurzel haben
Inhalt sind Integer
linkerTeilbaum -> kleinere Zahlen
rechter Teilbaum->größere Zahlen
Binarytree darf genutzt werden
VORHER überlegen, wie LÖSCHEN aussehen muss
	-> Fallunterscheidung (3 Fälle)
EInfügen muss ausvorhanden sein
Wurzel
Methoden suchen, einfügen und löschen

 */
@SuppressWarnings("unused")

public class SearchTree<Type> extends BinaryTree<Type> implements Collection<Type> {
	
	private BinaryTree<Type> thisTreeLevel;
	
	public SearchTree(){									//Wurzelkonstruktor
		thisTreeLevel = new BinaryTree<Type>();
	}
	
	//GEHT SO NICHT; DA DIE ZUORDNUNG LINKS RECHTS AUTOMATISCH NACH ZAHLENNUMMER PASSIEREN SOLL
	
	public SearchTree(Element<Type> thisElement){			//Dieses Element in der Baumebene
		thisTreeLevel = new BinaryTree<Type>(thisElement);
	}
	
	public SearchTree(BinaryTree<Type> thisTreeLevel){		//Diese Baumebene
		this.thisTreeLevel = thisTreeLevel; 
	}

	public SearchTree(BinaryTree<Type> leftBranch, BinaryTree<Type> rightBranch, Element<Type> content){									//Diese Baumebene mit l und r branch
		this.thisTreeLevel = new BinaryTree<Type>(content, leftBranch, rightBranch);
	}
	
	
	public BinaryTree<Type> searchTreeWith(Type content){
		//TODO
		return null;
	}

	public Element<Type> searchElement(Type content){
		//TODO
		return null;
	}
	
	public Type search(Type content){
		return null;
	}
	
	public Type search(Element<Type> content){
		return null;
	}
	
	public void deleteBranch(Element<Type> content){
		//TODO
		return;
	}
	
	public void deleteBranch(BinaryTree<Type> content){
		//TODO
		return;
	}
	
	public void deleteBranch(SearchTree<Type> content){
		//TODO
		return;
	}
	
	public void cutBranch(Element<Type> content){
		//TODO
		return;
	}

	public void cutBranch(BinaryTree<Type> content){
		//TODO
		return;
	}
	
	public void cutBranch(SearchTree<Type> content){
		//TODO
		return;
	}
	
	public void insert(Element<Type> content){
		//TODO
	}
	
	public void insert(BinaryTree<Type> content){
		//TODO		
	}
	
	public void insert(SearchTree<Type> content){
		//TODO
	}

	
	
	@Override
	public boolean add(Type arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Type> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Type> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


