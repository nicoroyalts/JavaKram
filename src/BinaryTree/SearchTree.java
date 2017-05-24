package BinaryTree;

import java.util.Collection;
import java.util.Iterator;

/* AUFGABE:
Suchbaum soll Wurzel haben
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
public class SearchTree<Type extends Comparable<Type>> extends BinaryTree<Type>{

	
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

	public SearchTree(
			BinaryTree<Type> leftBranch,
			BinaryTree<Type> rightBranch,
			Element<Type> content
			){									//Diese Baumebene mit l und r branch
		this.thisTreeLevel = new BinaryTree<Type>(content, leftBranch, rightBranch);
	}
	
	public void sort(){
		/*
		 * TODO
		 */
	}
	
}


