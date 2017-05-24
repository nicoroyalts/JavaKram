package BinaryTree;

/* AUFGABE:
 * Suchbaum soll Wurzel haben
Inhalt sind Integer
linkerTeilbaum -> kleinere Zahlen
rechter Teilbaum->gr��ere Zahlen
Binarytree darf genutzt werden
VORHER �berlegen, wie L�SCHEN aussehen muss
	-> Fallunterscheidung (3 F�lle)
EInf�gen muss ausvorhanden sein
Wurzel
Methoden suchen, einf�gen und l�schen

 */

@SuppressWarnings("unused")

public class Main{
	
	public static void main(String[] args){
	
		Element<Integer> testElement = new Element<Integer>(42);
		BinaryTree<Integer> testTree = new BinaryTree<Integer>(testElement);
		SearchTree<Integer> treeRoot = new SearchTree<Integer>(testTree);
		System.out.println("FINISHED");
		
	}
	
}



//TODO:
//Collection Interface verwenden fuer suche, weil da die comparisons einfacher sind
//SearchTree implementiert das jetzt, aber die weiteren Methodenkoerper muessen gefuellt werden